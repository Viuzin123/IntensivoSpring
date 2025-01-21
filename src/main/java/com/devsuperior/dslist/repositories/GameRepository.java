package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entidades.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository <Game, Long> {
}
