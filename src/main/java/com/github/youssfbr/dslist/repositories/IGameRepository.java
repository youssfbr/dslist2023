package com.github.youssfbr.dslist.repositories;

import com.github.youssfbr.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameRepository extends JpaRepository<Game, Long> {
}
