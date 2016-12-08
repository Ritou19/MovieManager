package ch.hearc.ig.moviemanager.odi.business;

import java.util.HashMap;

/**
 *Classe métier de film.
 * 
 * @author steven.habegger
 */
public class Movie {
    
    private long id;
    private String name;
    private String producer;
    HashMap<Long, Person> persons; 
    
    /**
     * Constructeur de film
     *
     * @param id Identifiant du film
     * @param name Titre du film
     * @param producer Nom du producteur
     */
    public Movie(long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.persons = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * Renvoie les personnes ayant vu le film
     *
     * @return Liste de personnes
     */
    public HashMap<Long, Person> getPersons() {
        return persons;
    }

    /**
     * Modifie les personnes ayant vu le film
     *
     * @param persons Listes des nouvelles personnes
     */
    public void setPersons(HashMap<Long, Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }
}
