package question02;

import question03.ImmutableDate;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Date d = new Date();
        d.setDate(15);
        ImmutableDate immutableDate = new ImmutableDate(d);
        d.setTime(0);
        immutableDate.getDate().setTime(0);
        immutableDate.addDays(2);
        System.out.println(immutableDate);
    }
}
