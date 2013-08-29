package util;

import java.util.concurrent.TimeUnit;

/**
 * @author: zhang
 */
public class ResourcePoolImp<R> implements ResourcePool<R> {

    private final static int DEFAULT_POOL_SIZE = 1024;

    private boolean isOpen = false;

    private int size = 0;

    private Object lock = new Object();


    Object[] recources = new Object[DEFAULT_POOL_SIZE];

    public void open(){
        isOpen = true;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void close() {

    }

    public void closeNow() {

    }

    public boolean add(R resource) {
        return false;
    }

    public boolean remove(R resource) {
        return false;
    }

    public boolean removeNow(R resource) {
        return false;
    }

    public R acquire() {
        return null;
    }

    public R acquire(long timeout, TimeUnit unit) {
        return null;
    }

    public void release(R resource) {

    }
    
}
