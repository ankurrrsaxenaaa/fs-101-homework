package guestbook;

import java.util.Arrays;
import java.util.List;

class SpamPool {
    static List<String> getSpamWords() {
        return Arrays.asList( "spam", "fake", "" );
    }
}