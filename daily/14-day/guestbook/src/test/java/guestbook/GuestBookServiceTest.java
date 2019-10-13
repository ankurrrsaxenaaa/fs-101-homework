package guestbook;

import guestbook.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GuestBookServiceTest {

    @Test
    public void should_able_to_save_when_ip_address_is_new() {
        GuestBookEntry guestBookEntry = new GuestBookEntry( "Shekhar", "Shekhar is busy today" );
        GuestBookService guestBookService = new GuestBookService( new CacheUtility() );
        guestBookService.createAndSaveEntry( guestBookEntry, "121" );
    }

    @Test
    public void should_able_to_throw_exception_when_ip_address_is_repeated() {
        GuestBookEntry guestBookEntry = new GuestBookEntry( "Shekhar", "Shekhar is busy today" );
        GuestBookService guestBookService = new GuestBookService( new CacheUtility() );
        guestBookService.createAndSaveEntry( guestBookEntry, "121" );
        try {
            guestBookService.createAndSaveEntry( guestBookEntry, "121" );
        } catch (RuntimeException e) {
            assertThat( e ).hasMessage( "Ip Address is rate limited" );
        }
    }

    @Test
    public void should_able_to_throw_exception_when_there_is_spam_in_content() {
        GuestBookEntry guestBookEntry = new GuestBookEntry( "Ankur", "This is a spam message" );
        GuestBookService guestBookService = new GuestBookService( new CacheUtility() );
        try {
            guestBookService.createAndSaveEntry( guestBookEntry, "122" );
        } catch (RuntimeException e) {
            assertThat( e ).hasMessage( "Spam words detected" );
        }
    }

    @Test
    public void should_able_to_share_the_post_if_ip_is_new_and_content_so_not_contain_spam() {
        GuestBookEntry guestBookEntry = new GuestBookEntry( "Ankur", "I am a finalist in XGT" );
        GuestBookService guestBookService = new GuestBookService( new CacheUtility() );
        guestBookService.createAndSaveEntry( guestBookEntry, "123" );
        PostService.post( PublishMedium.TWITTER, guestBookEntry );
    }
}