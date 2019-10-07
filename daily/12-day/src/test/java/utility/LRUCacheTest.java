package utility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LRUCacheTest {

    @Test
    public void should_delete_the_eldest_entry_when_cache_limit_reached() {
        LRUCache<String, String> lruCache = new LRUCache<>(2);
        lruCache.set("test1", "test1");
        lruCache.set("test2", "test2");
        lruCache.set("test3", "test3");

        assertThat(lruCache.find("test1")).isNull();
    }

    @Test
    public void should_contains_the_latest_entries() {
        LRUCache<Integer, Integer> lruCache = new LRUCache<>(2);
        lruCache.set(1, 10);
        lruCache.set(2, 20);
        lruCache.set(3, 30);

        assertThat(lruCache).hasSize(2);
        assertThat(lruCache).containsKeys(2,3);
    }

    @Test
    public void should_not_contains_the_eldest_entries() {
        LRUCache<Integer, Integer> lruCache = new LRUCache<>(2);
        lruCache.set(1, 10);
        lruCache.set(2, 20);
        lruCache.set(3, 30);
        lruCache.set(4, 40);

        assertThat(lruCache).doesNotContainKeys(1,2);
    }
}