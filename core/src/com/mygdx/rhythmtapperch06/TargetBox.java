package com.mygdx.rhythmtapperch06;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;

public class TargetBox extends BaseActor {

    public TargetBox(float x, float y, Stage s, String letter, Color color) {
        super(x, y, s);
        loadTexture("box.png");
        setSize(64, 64);

        // add a centered label containing letter with given color
        Label letterLabel = new Label(letter, BaseGame.labelStyle);
        letterLabel.setSize(64, 64);
        letterLabel.setAlignment(Align.center);
        letterLabel.setColor(color);
        this.addActor(letterLabel);
    }
}
