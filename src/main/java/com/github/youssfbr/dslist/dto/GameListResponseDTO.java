package com.github.youssfbr.dslist.dto;

import com.github.youssfbr.dslist.entities.GameList;

public record GameListResponseDTO(
        Long id ,
        String name
) {
    public GameListResponseDTO(GameList list) {
        this(list.getId(), list.getName());
    }
}
