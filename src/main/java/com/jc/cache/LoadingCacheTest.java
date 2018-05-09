package com.jc.cache;

import com.google.common.cache.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by jiangchen.
 */
public class LoadingCacheTest {
    public static void main(String[] args) throws ExecutionException {

        LoadingCache<String, String> tempCache = CacheBuilder.newBuilder()
                .expireAfterAccess(10, TimeUnit.MINUTES)
//                .expireAfterWrite(10 ,TimeUnit.MINUTES)
                .refreshAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(3)
//                .maximumWeight(1000)
//                .weigher(new Weigher<String, String>(){
//                    @Override
//                    public int weigh(String key, String value) {
//                        return 0;
//                    }
//                })
//                .weakKeys()
//                .weakValues()\
                .removalListener(
                    new RemovalListener<String, String>() {
                        @Override
                        public void onRemoval(RemovalNotification<String, String> notification) {
                            // do some thing
                        }
                     })
                .build(
                    new CacheLoader<String, String>() {
                        @Override
                        public String load(String key) throws Exception {
                            System.out.print(key);
                            return key;
                        }
                    });
        tempCache.put("1", "1");
        tempCache.put("2", "2");
        tempCache.put("3", "3");

        System.out.println(tempCache.size());

        tempCache.get("key", new Callable<String>() {
            @Override
            public String call() throws Exception {
                // do some computation
                return "result";
            }
        });
    }
}
