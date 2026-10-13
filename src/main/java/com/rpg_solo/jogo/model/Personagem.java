package com.rpg_solo.jogo.model;

import java.util.ArrayList;

import com.rpg_solo.jogo.model.Itens.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personagem {

    @Id
    private Long id;

    private String nome;
    private int vida;
    private int ouro;
    private int dano;
    private ArrayList<Item> inventario;

    public Personagem() {
    };

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ouro = 0;
        this.inventario = new ArrayList<>();
        this.dano = 10;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getOuro() {
        return ouro;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void receberOuro(int ouro) {
        this.ouro += ouro;
    }

    public void curar(int pontosDeCura) {
        this.vida += pontosDeCura;
        if (this.vida > 100) {
            this.vida = 100;
        }
        // System.out.println("Vida atualizada: " + vida);
    }
}
