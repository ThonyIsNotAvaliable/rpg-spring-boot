package com.rpg_solo.jogo.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.stereotype.Service;

import com.rpg_solo.jogo.interfaces.Usavel;
import com.rpg_solo.jogo.model.Personagem;

@Service
public class PersonagemService {
    int LIMITE_INVENTARIO = 20;

    public void adicionarItem(Personagem personagem, Item item) throws Exception {
        if (personagem.getInventario().size() >= LIMITE_INVENTARIO) {
            throw new Exception("Inventário Cheio!"); // Aqui você usa sua InventarioCheioException
        }

        personagem.getInventario().add(item);
    }

    public void removerItem(Personagem personagem, Item item) throws Exception {
        if (!personagem.getInventario().contains(item)) {
            throw new Exception("Inventário não contém item");
        }

        personagem.getInventario().remove(item);
    }

    public void usarItem(Personagem personagem, Item item) throws Exception {
        if (!personagem.getInventario().contains(item)) {
            throw new Exception("Inventário não contém item");
        }

        // item.usar(personagem);

        if (Usavel.class.isAssignableFrom(item.getClass())) {
            
        }

        personagem.getInventario().remove(item);
    }
}
