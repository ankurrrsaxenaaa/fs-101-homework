package guestbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class GuestBookService {

    private Set<String> spamWords;
    private CacheUtility redis;
    private Database database;

    GuestBookService(CacheUtility redis) {
        this.spamWords = new HashSet<>( SpamPool.getSpamWords() );
        this.redis = redis;
        this.database = new Database();
    }

    void createAndSaveEntry(GuestBookEntry guestBookEntry, String ipAddress) {
        Set<String> words = new HashSet<>( Arrays.asList( guestBookEntry.getContent().split( "\\s" ) ) );
        if (!Collections.disjoint( spamWords, words )) {
            throw new RuntimeException( "Spam words detected" );
        }

        if (redis.exists( ipAddress )) {
            throw new RuntimeException( "Ip Address is rate limited" );
        }
        database.save( guestBookEntry );
        redis.add( ipAddress );
    }


    private static class Database {
        void save(GuestBookEntry guestBookEntry) {
            System.out.println( "Saved Guestbook to DBk" );
        }
    }

}