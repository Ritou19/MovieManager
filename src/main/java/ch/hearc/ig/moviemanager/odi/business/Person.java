package ch.hearc.ig.moviemanager.odi.business;

import java.util.HashMap;

/**
 *
 * @author steven.habegger
 */
public class Person {
    
    private long id;
    private String firstName;
    private String lastName;
    HashMap<Long, Movie> movies;
    
    /**
     * Constructeur de personne
     *
     * @param id Identifiant de la personne
     * @param firstName Prénom de la personne
     * @param lastName Nom de la personne
     */
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Renvoie les films vus par la personne
     *
     * @return Films vus par la personne
     */
    public HashMap<Long, Movie> getMovies() {
        return movies;
    }

    /**
     * Modifie les films vus par la personne
     *
     * @param movies Nouveaux films vu par la personne
     */
    public void setMovies(HashMap<Long, Movie> movies) {
        this.movies = movies;
    }

    /**
     * Renvoie un film par son identifiant
     *
     * @param id Identifiant du film
     * @return Film correspondant à l'identifiant
     */
    public Movie getMovieById(long id) {
        return this.movies.get(id);
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
