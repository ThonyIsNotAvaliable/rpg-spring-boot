package com.rpg_solo.jogo.service;

import org.springframework.stereotype.Service;

import com.rpg_solo.jogo.interfaces.Usavel;
import com.rpg_solo.jogo.model.Itens.Item;
import com.rpg_solo.jogo.model.Personagem;
import com.rpg_solo.jogo.repository.PersonagemRepository;

@Service
public class PersonagemService {
    int LIMITE_INVENTARIO = 20;

    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }
    
    public Personagem criar(String nome) {
        Personagem personagem = new Personagem(nome);
        return repository.save(personagem);
    }
    
    public Personagem buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personagem não encontrado"));
    }

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

        if (item instanceof Usavel) {
            Usavel iUsavel = (Usavel) item;
            iUsavel.usar(personagem);
        }

        personagem.getInventario().remove(item);
    }
}
