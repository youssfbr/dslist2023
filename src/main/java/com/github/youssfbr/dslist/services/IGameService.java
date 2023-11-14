package com.github.youssfbr.dslist.services;

import com.github.youssfbr.dslist.dto.GameResponseDTO;

import java.util.List;

public interface IGameService {
    List<GameResponseDTO> findAll();
}
