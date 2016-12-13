package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.util.HashMap;

/**
 * Classe métier de film.
 * 
 * @author steven.habegger
 */
public class Person {
    
    private Long id;
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
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap<>();
    }

    /**
     * Constructeur de personne sans le paramètre ID
     *
     * @param firstName Prénom de la personne
     * @param lastName Nom de la personne
     */
    public Person(String firstName, String lastName) {
        this.id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap<>();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public Movie getMovieById(Long id) {
        return this.movies.get(id);
    }
    
    /**
     * Ajoute un film à une personne
     *
     * @param movie Film à ajouter
     * @throws ch.hearc.ig.odi.moviemanager.exception.UniqueException
     */
    public void addMovie(Movie movie) throws UniqueException {
        if (this.movies.get(movie.getId()) == null) {
            this.movies.put(movie.getId(), movie);
            //Ajout de la personne dans la liste des personne ayant vu ce film
            movie.addPerson(this);
        } else {
            throw new UniqueException("Ce film a déjà été vu par cette personne");
        }
    }
    
    /**
     * Suppression d'un film à une personne
     *
     * @param movie Film à supprimer
     * @throws ch.hearc.ig.odi.moviemanager.exception.UniqueException
     */
    public void removeMovie(Movie movie) throws UniqueException {
        if(this.movies.get(movie.getId()) != null) {
            //Suppression du film dans la liste des films vu par la personne
            this.movies.remove(movie.getId());
            //Suppression de la personne dans la liste des personnes ayant vu le film
            movie.removePerson(this);
        } else {
            throw new UniqueException("Ce film n'a pas été vu par cette peronne");
        }
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
