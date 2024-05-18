package com.michaelli25.gamelibrary.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.michaelli25.gamelibrary.business.GameLibrary;
import com.michaelli25.gamelibrary.integration.GameLibraryDao;

public class GameLibraryServiceImpl implements GameLibraryService{
    @Autowired
    private GameLibraryDao dao;

    @Override
    public List<GameLibrary> getGames() {
        List<GameLibrary> games = null;
        try {
            games = dao.getGames();
        } catch (Exception e) {
            throw new IllegalStateException("Error querying the database. Please try again later.", e);
        }
        return games;
    }

    @Override
    public GameLibrary getGameByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGameByTitle'");
    }
    
}
