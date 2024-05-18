package com.michaelli25.gamelibrary.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.michaelli25.gamelibrary.business.GameLibrary;
import com.michaelli25.gamelibrary.integration.mapper.GameLibraryMapper;

@Repository("gameLibraryDao")
public class GameLibraryDaoImpl implements GameLibraryDao{

    @Autowired
    private GameLibraryMapper mapper;

    @Override
    public List<GameLibrary> getGames() {
        List<GameLibrary> games = mapper.getGames();
        return games;
    }

    @Override
    public GameLibrary getGameByTitle(String title) {
        GameLibrary game = mapper.getGameByTitle(title);
        return game;
    }
    
}
