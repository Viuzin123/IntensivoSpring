package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entitys.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository <Game, Long> {
}
