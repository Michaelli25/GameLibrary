package com.michaelli25.gamelibrary.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.michaelli25.gamelibrary.business.GameLibrary;
import com.michaelli25.gamelibrary.integration.GameLibraryDao;

@Service
@Transactional
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
        GameLibrary game = null;
        try {
            game = dao.getGameByTitle(title);
        } catch (Exception e) {
            String errorMessage = String.format("Error querying the database for a game with id of %s. Please try again later.", title);
            throw new IllegalStateException(errorMessage, e);
        }
        return game;
    }
    
}
