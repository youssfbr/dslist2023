package com.github.youssfbr.dslist.services.impl;

import com.github.youssfbr.dslist.dto.GameByIdResponseDTO;
import com.github.youssfbr.dslist.dto.GameResponseDTO;
import com.github.youssfbr.dslist.projections.IGameMinProjection;
import com.github.youssfbr.dslist.repositories.IGameRepository;
import com.github.youssfbr.dslist.services.IGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService implements IGameService {

    private final IGameRepository gameRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameResponseDTO> findAll() {
        return gameRepository.findAll()
                .stream()
                .map(GameResponseDTO::new)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public GameByIdResponseDTO findById(Long id) {
        return gameRepository.findById(id)
                .map(GameByIdResponseDTO::new)
                .orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<GameResponseDTO> findByList(Long listId) {
        List<IGameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameResponseDTO::new).toList();
    }
}
