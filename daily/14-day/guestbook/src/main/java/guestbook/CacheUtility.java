package guestbook;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

class CacheUtility {

    private LoadingCache<String, String> cache;

    CacheUtility() {
        this.cache = CacheBuilder.newBuilder()
                .expireAfterWrite( 1, TimeUnit.DAYS )
                .build( new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        return key;
                    }
                } );
    }

    boolean exists(String key) {
        return this.cache.getIfPresent( key ) != null;
    }

    void add(String key) {
        this.cache.put( key, key );
    }


}