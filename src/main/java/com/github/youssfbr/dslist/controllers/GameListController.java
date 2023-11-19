package com.github.youssfbr.dslist.controllers;

import com.github.youssfbr.dslist.dto.GameListResponseDTO;
import com.github.youssfbr.dslist.services.IGameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lists")
public class GameListController {

    private final IGameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListResponseDTO>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }
}
