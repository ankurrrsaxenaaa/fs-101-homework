package guestbook;

class GuestBookEntry {

    private String name;
    private String content;

    GuestBookEntry(String name, String content) {
        this.name = name;
        this.content = content;
    }

    String getName() {
        return name;
    }

    String getContent() {
        return content;
    }
}