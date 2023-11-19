package com.github.youssfbr.dslist.controllers;

import com.github.youssfbr.dslist.dto.GameByIdResponseDTO;
import com.github.youssfbr.dslist.dto.GameResponseDTO;
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
@RequestMapping("/games")
public class GameController {

    private final IGameService gameService;

    @GetMapping
    public ResponseEntity<List<GameResponseDTO>> findAll() {
        return ResponseEntity.ok(gameService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameByIdResponseDTO> findAll(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.findById(id));
    }

}
