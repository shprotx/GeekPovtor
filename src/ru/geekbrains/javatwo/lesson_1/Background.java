package ru.geekbrains.javatwo.lesson_1;

import java.awt.*;

public class Background extends Sprite {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    public void update(GameCanvas gameCanvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        color = new Color(red, green, blue);
    }

    @Override
    void render(GameCanvas canvas, Graphics g) {
        canvas.setBackground(color);
    }

}


