package util;

import exception.ResourceDoesNotExistException;

import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.HashMap;

/**
 * @author: zhang
 */

/**
 * The basic assumption is that the resource is immutable
 */
public class ResourcePoolImp<R> implements ResourcePool<R> {

    private final static int DEFAULT_POOL_SIZE = 1024;

    private boolean isOpen = false;

    private int head = 0;

    private int tail = 0;

    Object[] recources;

    Map<R, Integer> indices;


    public ResourcePoolImp() {
        this.recources = new Object[DEFAULT_POOL_SIZE];
        this.indices = new HashMap<R, Integer>();
    }

    public void open(){
        isOpen = true;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void close() {
//        isOpen = false;
    }

    public void closeNow() {
        isOpen = false;
    }

    public boolean add(R resource) {
        return false;
    }

    public boolean remove(R resource) {
        if(!indices.containsKey(resource)) {
            return false;
        }

        return removeNow(resource);
    }

    public boolean removeNow(R resource) {
        if (!indices.containsKey(resource)) {
            return false;
        }

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
