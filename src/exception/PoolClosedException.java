package exception;

/**
 * @author: mizhang
 * @since: Aug 29, 2013 1:41:20 PM
 */
public class PoolClosedException extends Exception {

    public PoolClosedException(String msg) {
        super(msg);
    }
}
