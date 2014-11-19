package com.itp.cache;

import java.util.HashMap;
import java.util.Map;

public class StaticDataCache {

    public static final String STATES_CACHE = "states";
    public static final String MONTHS_CACHE = "months";
    public static final String DAYS_CACHE = "days";
    private static final HashMap Cache = new HashMap();

    public StaticDataCache() {
    }

    public static Object[] getCache(String key) {
        return (Object[]) Cache.get(key);
    }

    public static void putCache(String key, Object[] cache) {
        Cache.put(key, cache);
    }

    public static void putObjectCache(String key, Object obj) {
        Cache.put(key, obj);
    }

    public static void putMapCache(String key, Map cache) {
        Cache.put(key, cache);
    }

    public static Map getMapCache(String key) {
        return (Map) Cache.get(key);
    }

    public static Object getCachedObject(String key) {
        return (Object) Cache.get(key);
    }

    public static HashMap getMap() {
        return Cache;
    }
}
