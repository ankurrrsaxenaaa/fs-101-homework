package guestbook;

class PostService {

    static void post(PublishMedium medium, GuestBookEntry guestBookEntry) {
        switch (medium) {
            case TWITTER:
                System.out.println( String.format( "We had a visitor! %s said %s", guestBookEntry.getName(), guestBookEntry.getContent() ) );
                break;
            case LINKEDIN:
                System.out.println( String.format( "We had another visitor! %s said %s", guestBookEntry.getName(), guestBookEntry.getContent() ) );
            default:
        }
    }
}