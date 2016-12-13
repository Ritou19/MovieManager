package ch.hearc.ig.odi.moviemanager.exception;

/**
 *
 * @author steven.habegger
 */
public class NullParameterException extends Exception {
    public NullParameterException() {
        super();
    }
    
    public NullParameterException(String message) {
        super(message);
    }

}
