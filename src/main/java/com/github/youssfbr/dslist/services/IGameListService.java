package com.github.youssfbr.dslist.services;

import com.github.youssfbr.dslist.dto.GameListResponseDTO;

import java.util.List;

public interface IGameListService {
    List<GameListResponseDTO> findAll();
}
