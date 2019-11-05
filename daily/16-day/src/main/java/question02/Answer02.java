package question02;

public class Answer02 {
    public static void main(String[] args) {
        Sender<String> sender = System.out::println;
        sender.print("Ankur");
    }
}