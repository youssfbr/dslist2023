package com.github.youssfbr.dslist.dto;

import com.github.youssfbr.dslist.entities.Game;

public record GameResponseDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {
    public GameResponseDTO(Game game) {
        this(
            game.getId() ,
            game.getTitle() ,
            game.getYear() ,
            game.getImgUrl() ,
            game.getShortDescription()
        );
    }
}


