package com.rpg_solo.jogo.model.Itens;

import com.rpg_solo.jogo.interfaces.Usavel;
import com.rpg_solo.jogo.model.Personagem;

public class Pocao extends Item implements Usavel {

    private int vida;

    public Pocao(String nome, int valor, int vida) {
        super(nome, valor);
        this.vida = vida;
    }

    @Override
    public void usar(Personagem personagem) {
        personagem.curar(vida);
    }

    public int getVida() {
        return vida;
    }
}
