package com.mygdx.atomo;

import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector3;

public class Atomo {
    private Vector3 pos;
    private Nucleo nucleo;
    NuvemEletronica nuvem;

    public Atomo(NuvemEletronica nuvem, Nucleo nucleo){
        this.pos = nucleo.getPosNucleo();
        this.nuvem = nuvem;
        this.nucleo = nucleo;
    }

    public void create(){
        nuvem.create();
        nucleo.create();
    }

    public void dispose(){
        nuvem.dispose();
        nucleo.dispose();
    }

    public Vector3 getPos() {
        return pos;
    }

    public void setPos(Vector3 pos) {
        this.pos = pos;
    }

    public void render(ModelBatch batch, PerspectiveCamera cam, Environment env){
        nuvem.render(batch,cam,env);
        nucleo.render(batch,cam, env);
    }


}
