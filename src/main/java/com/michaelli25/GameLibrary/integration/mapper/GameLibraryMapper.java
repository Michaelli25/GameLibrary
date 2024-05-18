package com.michaelli25.gamelibrary.integration.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.michaelli25.gamelibrary.business.GameLibrary;

public interface GameLibraryMapper {

    List<GameLibrary> getGames();

    GameLibrary getGameByTitle(@Param("title") String title);
    
}
