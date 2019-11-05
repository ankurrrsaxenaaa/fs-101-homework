package question04;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer04B implements Runnable {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private static DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
    private String userDate;

    public Answer04B(Date date) {
        userDate=dateFormat.format(date);
    }

    public static void main(String[] args) throws ParseException {
        Answer04B date01 =new Answer04B(dateFormat.parse("26-May-1996"));
        Answer04B date02= new Answer04B(dateFormat.parse("01-Oct-1996"));
        new Thread(date01).start();
        new Thread(date02).start();
    }

    @Override
    public void run() {
        threadLocal.set(userDate);
        System.out.println("Thread Context for given date "+ threadLocal.get());
    }
}