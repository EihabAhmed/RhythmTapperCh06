package com.mygdx.rhythmtapperch06;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class RhythmTapperGame extends BaseGame {
	@Override
	public void create() {
		super.create();
		setActiveScreen(new RhythmScreen());
	}
}
