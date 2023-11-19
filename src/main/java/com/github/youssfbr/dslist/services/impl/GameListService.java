package com.github.youssfbr.dslist.services.impl;

import com.github.youssfbr.dslist.dto.GameListResponseDTO;
import com.github.youssfbr.dslist.repositories.IGameListRepository;
import com.github.youssfbr.dslist.services.IGameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService implements IGameListService {

    private final IGameListRepository gameListRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameListResponseDTO> findAll() {
        return gameListRepository.findAll()
                .stream()
                .map(GameListResponseDTO::new)
                .toList();
    }
}
