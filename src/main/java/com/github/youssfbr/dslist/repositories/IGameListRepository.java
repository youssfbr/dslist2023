package com.github.youssfbr.dslist.repositories;

import com.github.youssfbr.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameListRepository extends JpaRepository<GameList, Long> {
}
