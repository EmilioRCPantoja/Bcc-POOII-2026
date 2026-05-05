package com.mygdx.atomo;

import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.utils.Distancia;

import java.util.ArrayList;
import java.util.Random;

public class NuvemEletronica {
    private ArrayList<Eletron> eletrons = new ArrayList<Eletron>();
    private Vector3 posNuvem = new Vector3();
    private int tamArea = 150;
    private Nucleo infoN ;
    private double  a0 = 25;
    private final Random rd = new Random();
    public enum Orbital {s1, s2, p2z};
    private Orbital orbAtl = Orbital.p2z;
    private double pMaxCache;
    private int ultimoAtualizado = 0;
    private static final int POR_FRAME = 100;
    //Getters e Setters
    public ArrayList<Eletron> getEletrons() {
        return eletrons;
    }



    public void setEletrons(ArrayList<Eletron> eletrons) {
        this.eletrons = eletrons;
    }

    public Vector3 getPosNuvem() {
        return posNuvem;
    }

    public void setPosNuvem(Vector3 posNuvem) {
        this.posNuvem = posNuvem;
    }

    public int getTamArea() {
        return tamArea;
    }

    public void setTamArea(int tamArea) {
        this.tamArea = tamArea;
    }

    public Nucleo getInfoN() {
        return infoN;
    }

    public void setInfoN(Nucleo infoN) {
        this.infoN = infoN;
    }

    public double getA0() {
        return a0;
    }

    public void setA0(double a0) {
        this.a0 = a0;
    }

    public NuvemEletronica( int tamArea, Nucleo infoN, double a0) {
        this.tamArea = tamArea;
        this.infoN = infoN;
        this.a0 = a0;

    }

    public NuvemEletronica( int tamArea, Nucleo infoN) {
        this.tamArea = tamArea;
        this.infoN = infoN;
    }

    public NuvemEletronica( int tamArea, Nucleo infoN, double a0, Eletron e) {
        this.tamArea = tamArea;
        this.infoN = infoN;
        this.a0 = a0;
        eletrons.add(e);
    }

    public NuvemEletronica( int tamArea, Nucleo infoN, Eletron e) {
        this.tamArea = tamArea;
        this.infoN = infoN;
        eletrons.add(e);
    }

    public NuvemEletronica( int tamArea, Nucleo infoN, double a0, ArrayList<Eletron> es) {
        this.tamArea = tamArea;
        this.infoN = infoN;
        this.a0 = a0;
        this.eletrons = es;
    }

    public NuvemEletronica( int tamArea, Nucleo infoN, ArrayList<Eletron> es) {
        this.tamArea = tamArea;
        this.infoN = infoN;
        this.eletrons = es;
    }

    private double probabilidade(double x, double y, double z){
        double r = Distancia.getDistancia(x,y,z);
        if(r < 1e-9)
            r = 1e-9;

        double rho = r/a0;

        double cosTheta = z/r;

        double sinTheta = Math.sqrt(1 - (cosTheta*cosTheta));

        double psi;

        if(r > 1e-9)

        switch (orbAtl){
            case s1:
                 psi = Math.exp(-rho);
                return psi*psi * r*r;
            case s2:
                psi = (2 - rho) * Math.exp(-rho / 2.0);
                return psi*psi * r*r;
            case p2z:
                psi = rho * Math.exp(-rho/2.0)*cosTheta;
                return psi*psi;
            default: psi = 0;
        }

        return 0;
    }

    private double pMax(){

        if(orbAtl == Orbital.p2z)
            return (4.0 / Math.E) * 1.1;
        else{
            double pMax = 0f;
            int grid = 40;
            float step = tamArea * 2f / grid;
            for (int ix = 0; ix <= grid; ix++)
                for (int iy = 0; iy <= grid; iy++)
                    for (int iz = 0; iz <= grid; iz++) {
                        float x = -tamArea + ix * step;
                        float y = -tamArea + iy * step;
                        float z = -tamArea + iz * step;
                        double p = probabilidade(x, y, z);
                        if (p > pMax) pMax = p;
                    }
            return pMax * 1.1;
        }

    }


    public Vector3 gerarPonto(double pMax){
        double rNucleo = infoN.getTam();
        Vector3 posNucleo = infoN.getPosNucleo();

        for(int  i = 0; i < 2000; i++) {
            float x = (float) ((rd.nextDouble() * 2 - 1) * tamArea);
            float y = (float) ((rd.nextDouble() * 2 - 1) * tamArea);
            float z = (float) ((rd.nextDouble() * 2 - 1) * tamArea);

            double distNucleo = Distancia.getDistancia(x,y,z);
            if (distNucleo < rNucleo)
                continue;

            double prob = probabilidade(x, y, z);

            if (rd.nextDouble() * pMax < prob)
                return new Vector3(x + posNucleo.x, y + posNucleo.y, z + posNucleo.z);
        }

        return null;
    }

    public void create(){
        for(Eletron e : eletrons)
            e.create();
        this.pMaxCache = pMax();
        recalcPos();

        System.out.println("pMaxCache=" + pMaxCache);
        System.out.println("prob(0,0,0.001)=" + probabilidade(0,0,0.001));
        System.out.println("prob(0,0,50)=" + probabilidade(0,0,50));
        System.out.println("prob(0,0,150)=" + probabilidade(0,0,150));

        int aceitos=0, rejeitados=0;
        double somaR=0, maxR=0;
        for(int i=0; i<10000; i++){
            float x=(float)((rd.nextDouble()*2-1)*tamArea);
            float y=(float)((rd.nextDouble()*2-1)*tamArea);
            float z=(float)((rd.nextDouble()*2-1)*tamArea);
            double prob=probabilidade(x,y,z);
            if(rd.nextDouble()*pMaxCache < prob){
                aceitos++;
                double r=Math.sqrt(x*x+y*y+z*z);
                somaR+=r;
                if(r>maxR) maxR=r;
            } else rejeitados++;
        }
        System.out.println("aceitos="+aceitos+" rejeitados="+rejeitados);
        System.out.println("r medio="+(somaR/aceitos));
        System.out.println("r max="+maxR);

    }

    public void dispose(){
        for(Eletron e : eletrons){
            e.dispose();
        }
    }

    private void recalcPos(){

        for (Eletron e : eletrons) {
            Vector3 pos = gerarPonto(this.pMaxCache);
            if (pos != null) {
                e.getPos().set(pos);
            }
        }

    }

    public void render(ModelBatch batch, PerspectiveCamera cam, Environment env){
        if (eletrons.isEmpty()) return;

        for(int i = 0; i < POR_FRAME; i++){
            int idx = (ultimoAtualizado + i) % eletrons.size();
            Vector3 novaPos = gerarPonto(pMaxCache);
            if(novaPos != null){
                eletrons.get(idx).getPos().set(novaPos);
            }
        }
        ultimoAtualizado = (ultimoAtualizado + POR_FRAME) % eletrons.size();

        // renderiza todos
        for (Eletron e : eletrons) {
            e.render(batch, cam, env);
        }

    }

    public void setOrbital(Orbital orbital) {
        this.orbAtl = orbital;

        this.pMaxCache = pMax();
        recalcPos();
    }

}
