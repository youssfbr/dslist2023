package com.github.youssfbr.dslist.controllers;

import com.github.youssfbr.dslist.dto.GameListResponseDTO;
import com.github.youssfbr.dslist.dto.GameResponseDTO;
import com.github.youssfbr.dslist.services.IGameListService;
import com.github.youssfbr.dslist.services.IGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lists")
public class GameListController {

    private final IGameListService gameListService;
    private final IGameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListResponseDTO>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameResponseDTO>> findByList(@PathVariable Long listId) {
        return ResponseEntity.ok(gameService.findByList(listId));
    }
}
