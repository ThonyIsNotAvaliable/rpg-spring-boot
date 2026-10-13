package com.rpg_solo.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg_solo.jogo.model.Itens.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
