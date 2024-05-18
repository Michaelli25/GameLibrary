package com.michaelli25.gamelibrary.business;

import java.util.Arrays;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ageRating;
        result = prime * result + Arrays.hashCode(platforms);
        result = prime * result + ((developer == null) ? 0 : developer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameLibrary other = (GameLibrary) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (releaseDate == null) {
            if (other.releaseDate != null)
                return false;
        } else if (!releaseDate.equals(other.releaseDate))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (ageRating != other.ageRating)
            return false;
        if (!Arrays.equals(platforms, other.platforms))
            return false;
        if (developer == null) {
            if (other.developer != null)
                return false;
        } else if (!developer.equals(other.developer))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GameLibrary [title=" + title + ", genre=" + genre + ", releaseDate=" + releaseDate + ", price=" + price
                + ", ageRating=" + ageRating + ", platforms=" + Arrays.toString(platforms) + ", developer=" + developer
                + "]";
    }

}
