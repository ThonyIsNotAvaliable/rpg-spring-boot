package com.rpg_solo.jogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Item {

    @Id
    private Long id;

    private String nome;
    private int valor;

    public Item(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int get_valor() {
        return valor;
    }

    public String get_nome() {
        return nome;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Item item = (Item) object;
        if (java.util.Objects.equals(this.nome, item.get_nome()) && this.valor == item.get_valor()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.nome, this.valor);
    }
}
