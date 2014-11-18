package com.basui.platformer.view;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class GameScreen implements Screen {
    public TiledMap map; //making the map variable
    public OrthogonalTiledMapRenderer renderer; //making the renderer variable
    public OrthographicCamera camera; //making the camera variable

    public GameScreen() {
        map = new TmxMapLoader().load("map/map01.tmx"); //assigning the map variable to the map
        renderer = new OrthogonalTiledMapRenderer(map, 1/70f); //
        camera = new OrthographicCamera(14f, 14f); //assigning the camera to be something, 14f by 14f is # of tiles shown.
    }

    @Override
    public void render(float delta) {
        camera.update(); //refreshing the camera every fps
        renderer.setView(camera); //setting the camera to be the active view (use the camera)
        renderer.render(); //rendering :D
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
