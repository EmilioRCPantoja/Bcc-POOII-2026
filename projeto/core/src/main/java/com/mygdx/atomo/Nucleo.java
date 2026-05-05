package com.mygdx.atomo;

import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector3;

import java.util.ArrayList;

public class Nucleo {
    private Vector3 posNucleo;
    private ArrayList<Particula> nucleo = new ArrayList<Particula>();

    //Contructors
    public Nucleo(Particula p ){
        nucleo.add(p);
        Vector3 po = pontoMedio(nucleo);
        this.posNucleo = po;
    }

    public Nucleo (ArrayList<Particula> p){
        this.nucleo = p;
        Vector3 po = pontoMedio(nucleo);

        this.posNucleo = po;
    }
    //Getters e Setters
    public Vector3 getPosNucleo() {
        return posNucleo;

    }
    public void setNucleo(ArrayList<Particula> nucleo) {
        this.nucleo = nucleo;
        this.posNucleo = pontoMedio(nucleo);
    }

    public void create(){
        for(Particula p : nucleo){
            p.create();
        }
    }

    public void render(ModelBatch batch, PerspectiveCamera cam, Environment env){
        for(Particula p : nucleo){
            p.render(batch, cam, env);
        }
    }

    public void dispose(){
        for(Particula p : nucleo){
            p.dispose();
        }
    }

    private Vector3 pontoMedio(ArrayList<Particula> p){
        Vector3 po = new Vector3();
        if(nucleo.size() > 1){
            for(Particula pa : nucleo){
                po.x += pa.getPos().x;
                po.y += pa.getPos().y;
                po.z += pa.getPos().z;
            }
            po.x/=nucleo.size();
            po.z/=nucleo.size();
            po.y/=nucleo.size();
        }
        else
            po = p.get(0).getPos();

        return po;
    }

    public void addParticula(Particula p){
        this.nucleo.add(p);
        this.posNucleo = pontoMedio(nucleo);
    }

    public double getTam(){
        if(this.nucleo.size() == 0 )
            return 0;
        else if(this.nucleo.size() == 1)
            return this.nucleo.get(0).getTam();
        else if(this.nucleo.size() == 2)
            return 2 * this.nucleo.get(0).getTam();

        return this.nucleo.get(0).getTam() * Math.cbrt(this.nucleo.size()/0.74);
    }

}
