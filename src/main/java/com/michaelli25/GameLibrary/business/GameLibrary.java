package com.michaelli25.GameLibrary.business;

import java.util.Date;

/**
 * The GameLibrary class represents a game in a game library.
 */
public class GameLibrary {

    private String title;
    private String genre;
    private Date releaseDate;
    private double price;
    private int ageRating;
    private String[] platforms;
    private String developer;
    
    /**
     * Constructs a GameLibrary object with the specified title, genre, release date, price, age rating, platforms, and developer.
     * 
     * @param title the title of the game
     * @param genre the genre of the game
     * @param releaseDate the release date of the game
     * @param price the price of the game
     * @param ageRating the age rating of the game
     * @param platforms the platforms on which the game is available
     * @param developer the developer of the game
     */
    public GameLibrary(String title, String genre, Date releaseDate, double price, int ageRating, String[] platforms, String developer){
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
        this.ageRating = ageRating;
        this.platforms = platforms;
        this.developer = developer;
    }

    /**
     * Returns the title of the game.
     * 
     * @return the title of the game
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the game.
     * 
     * @param title the title of the game
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the genre of the game.
     * 
     * @return the genre of the game
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the game.
     * 
     * @param genre the genre of the game
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns the release date of the game.
     * 
     * @return the release date of the game
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the release date of the game.
     * 
     * @param releaseDate the release date of the game
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Returns the price of the game.
     * 
     * @return the price of the game
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the game.
     * 
     * @param price the price of the game
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the age rating of the game.
     * 
     * @return the age rating of the game
     */
    public int getAgeRating() {
        return ageRating;
    }

    /**
     * Sets the age rating of the game.
     * 
     * @param ageRating the age rating of the game
     */
    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    /**
     * Returns the platforms on which the game is available.
     * 
     * @return the platforms on which the game is available
     */
    public String[] getPlatforms() {
        return platforms;
    }

    /**
     * Sets the platforms on which the game is available.
     * 
     * @param platforms the platforms on which the game is available
     */
    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    /**
     * Returns the developer of the game.
     * 
     * @return the developer of the game
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * Sets the developer of the game.
     * 
     * @param developer the developer of the game
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

}
