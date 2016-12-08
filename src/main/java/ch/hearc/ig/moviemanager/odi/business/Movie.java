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
    
}
