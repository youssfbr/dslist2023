package com.github.youssfbr.dslist.dto;

import com.github.youssfbr.dslist.entities.Game;

public record GameByIdResponseDTO(
        Long id,
        String title,
        Integer year,
        String genre,
        String platforms,
        Double score,
        String imgUrl,
        String shortDescription,
        String longDescription
) {
    public GameByIdResponseDTO(Game game) {
        this(
                game.getId() ,
                game.getTitle() ,
                game.getYear() ,
                game.getGenre() ,
                game.getPlatforms() ,
                game.getScore() ,
                game.getImgUrl() ,
                game.getShortDescription() ,
                game.getLongDescription()
        );
    }
}


