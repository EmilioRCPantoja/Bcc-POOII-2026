package com.mygdx.atomo;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector3;

public class Eletron {
    private Vector3 pos = new Vector3();
    private Particula infoP;
    private int nivelEnergia;
    private float tam;

    public Eletron(int nivelEnergia, float tamanho){
        this.nivelEnergia = nivelEnergia;
        this.tam = tamanho;
        infoP = new Particula(pos,1,0d,tam);
    }
    //Getters e Setters
    public Vector3 getPos() {
        return pos;
    }

    public void setPos(Vector3 pos) {
        this.pos = pos;
    }

    public Particula getInfoP() {
        return infoP;
    }

    public void setInfoP(Particula infoP) {
        this.infoP = infoP;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public float getTam() {
        return tam;
    }

    public void setTam(float tam) {
        this.tam = tam;
    }

    public void create(){
        infoP.create();
    }

    public void dispose(){
        infoP.dispose();
    }

    public void render(ModelBatch batch,PerspectiveCamera cam, Environment env){
        infoP.render(batch, cam,env);
        infoP.mudarCor(Color.BLACK);
    }

    public void translation(Vector3 pos){
        this.infoP.translation(pos);
    }
}
