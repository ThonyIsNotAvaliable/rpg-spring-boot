package com.rpg_solo.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg_solo.jogo.model.Inimigo;

@Repository
public interface InimigoRepository extends JpaRepository<Inimigo, Long> {

}
