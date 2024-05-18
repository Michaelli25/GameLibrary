package com.michaelli25.gamelibrary.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.michaelli25.gamelibrary.business.GameLibrary;
import com.michaelli25.gamelibrary.business.service.GameLibraryService;

@RestController
@RequestMapping("/api")
public class GameLibraryController {

    private static final String DB_ERROR_MESSAGE = "There was an error connecting to the database. Please try again later.";

    @Autowired
    private GameLibraryService gameLibraryService;

    /**
     * Retrieves a list of all games in the game library.
     *
     * @return the list of games
     * @throws ResponseStatusException if there is an error connecting to the database
     */
    @GetMapping("/games")
    public List<GameLibrary> getGames() {
        try {
            return gameLibraryService.getGames();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, DB_ERROR_MESSAGE, e);
        }
    }

    /**
     * Retrieves a game from the game library by its title.
     *
     * @param title the title of the game
     * @return the game with the specified title
     * @throws ResponseStatusException if there is an error connecting to the database
     */
    @GetMapping("/games/{title}")
    public ResponseEntity<GameLibrary> getGameByTitle(String title) {
        GameLibrary game;
        try {
            game = gameLibraryService.getGameByTitle(title);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, DB_ERROR_MESSAGE, e);
        }
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(game);
    }
}
