package com.mygdx.atomo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Simulation extends ApplicationAdapter {
    private ModelBatch batch    ;
    private Texture image;
    private Vector3 v = new Vector3(0,0,0);
    public PerspectiveCamera cam;
    public Environment environment;
    public CameraInputController camCont;

    //partes do atomo
    private Particula p = new Particula(v,0,0.0, 40f);
    private  Nucleo n = new Nucleo(p);
    private ArrayList<Eletron> el = new ArrayList<Eletron>();
    private NuvemEletronica nu = new NuvemEletronica(300, n,20, el);
    private Atomo a = new Atomo( nu, n);


    @Override
    public void create() {
        //config janela
        environment = new Environment();
        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.2f, 0.2f, 0.2f, 0.5f));
        environment.add(new DirectionalLight().set(0.4f, 0.4f, 0.4f, -1f, -0.5f, 1f));
        cam = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.position.set(450f,450f,450f);
        cam.lookAt(a.getPos());
        cam.near = 1f;
        cam.far = 1000f;
        cam.update();
        camCont = new CameraInputController(cam);
        Gdx.input.setInputProcessor(camCont);

        batch = new ModelBatch();

        //partes do atomo
        for(int i =0; i<5000; i++) {
            el.add(new Eletron(0, 5f));
        }
        a.create();
    }

    @Override
    public void render() {
        //config janela
        camCont.update();

        ScreenUtils.clear(1, 1, 1, 1, true);

        Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        //partes do atomo
        batch.begin(cam);
        a.render(batch, cam, environment);
        batch.end();
    }

    @Override
    public void dispose() {
        a.dispose();
        batch.dispose();
    }
}
