package com.rpg_solo.jogo.service;

import org.springframework.stereotype.Service;

import com.rpg_solo.jogo.model.Inimigo;
import com.rpg_solo.jogo.model.Personagem;

@Service
public class CombateService {
    public void inimigoAtacar(Inimigo inimigo, Personagem alvo) {
        if (!inimigo.estaVivo()) {
            System.out.println(inimigo.getNome() + " está morto e não pode atacar!");
            return;
        }

        System.out.println(inimigo.getNome() + " ataca " + alvo.getNome() + "!");

        alvo.receberDano(inimigo.getDano());

        System.out.println(alvo.getNome() + " agora tem " + alvo.getVida() + " de vida.");
    }

    public void personagemAtacar(Personagem jogador, Inimigo alvo) {

        System.out.println(jogador.getNome() + " ataca " + alvo.getNome() + "!");

        alvo.receberDano(jogador.getDano());

        System.out.println(alvo.getNome() + " agora tem " + alvo.getVida() + " de vida.");
    }
}
