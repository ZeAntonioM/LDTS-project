package org.example.model.game.entities.powerups;

import org.example.model.Position;
import org.example.model.game.entities.Bomberman;

public class ExplosionRadius extends PowerUp {

    private char animation = '▪';
    private String color = "#F9F295";

    public ExplosionRadius(Position pos, int duration){
        super(pos, duration);
    }

    @Override
    public void doEffect(Bomberman bomberman){
        bomberman.setExplosionRadius(bomberman.getExplosionRadius() + 1);
    }

    @Override
    public char getAnimation() {
        return this.animation;
    }
    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public void nextAnimation() {
        this.animation = this.animation == '▪' ? '●' : '▪';
        this.color = this.color.equals("#F9F295") ? "#E0AA3E" : "#F9F295";
    }
}
