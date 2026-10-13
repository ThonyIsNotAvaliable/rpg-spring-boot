package com.rpg_solo.jogo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rpg_solo.jogo.model.Personagem;
import com.rpg_solo.jogo.service.PersonagemService;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public Personagem criar(@RequestParam String nome) {
        return service.criar(nome);
    }

    @GetMapping("/{id}")
    public Personagem buscar(@PathVariable Long id) {
        return service.buscar(id);
    }
}