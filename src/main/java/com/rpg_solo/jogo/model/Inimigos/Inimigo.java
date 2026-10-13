package com.rpg_solo.jogo.model.Inimigos;

import jakarta.persistence.*;

@Entity
public abstract class Inimigo {

    @Id
    private Long id;

    private String nome;
    private int vida;
    private int dano;

    protected Inimigo() {
    };

    public Inimigo(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
