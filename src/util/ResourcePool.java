package util;

import java.util.concurrent.TimeUnit;

/**
 * @author: mizhang
 */

public interface ResourcePool<R> {

    /**
     * open the resource pool
     */
    public void open();

    /**
     * check whehter the resource is open
     * @return is open
     */
    public boolean isOpen();

    /**
     * close the resource pool
     */
    public void close();

    /**
     * force close the resource pool
     */
    public void closeNow();

    /**
     * add resource to the pool
     * @param resource the resource to be added
     * @return true success, otherwise false
     */
    public boolean add(R resource);

    /**
     * remove the resource
     * @param resource the resource to be removed
     * @return true if sucess, otherwise false
     */
    public boolean remove(R resource);

    /**
     * force to remove the resource even it is holding by a thread
     * @param resource resource to be removed
     * @return true if sucess, otherwise false
     */
    public boolean removeNow(R resource);

    /**
     * get the next available resource
     * @return the resource retrieved from the pool, otherwise null
     */
    public R acquire();


    /**
     * same as acquire() except the timeout
     * @param timeout timeout
     * @param unit time unit
     * @return null if fails, otherwise the retrieved resource
     */
    public R acquire(long timeout, TimeUnit unit);

    /**
     * release resouce
     * @param resource resource to be released
     */
    public void release(R resource);
    
}
