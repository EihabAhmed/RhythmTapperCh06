package com.mygdx.rhythmtapperch06;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class FallingBox extends BaseActor {

    public FallingBox(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("box.png");
        setScale(0.75f, 0.75f);
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);
    }
}
