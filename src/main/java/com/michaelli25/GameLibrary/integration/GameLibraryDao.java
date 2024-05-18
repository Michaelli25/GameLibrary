package com.michaelli25.gamelibrary.integration;

import java.util.List;

import com.michaelli25.gamelibrary.business.GameLibrary;

public interface GameLibraryDao {

    /**
     * Retrieves a list of all games in the game library.
     *
     * @return the list of games
     */
    List<GameLibrary> getGames();

    /**
     * Retrieves a game from the game library by its title.
     *
     * @param title the title of the game
     * @return the game with the specified title
     */
    GameLibrary getGameByTitle(String title);
    
}
