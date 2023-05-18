package com.mygdx.rhythmtapperch06;

public class RecorderGame extends BaseGame
{
    public void create()
    {
        super.create();
        setActiveScreen( new RecorderScreen() );
    }
}