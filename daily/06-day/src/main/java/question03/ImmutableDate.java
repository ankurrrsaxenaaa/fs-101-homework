package question03;
import java.util.Date;
public class ImmutableDate {
    private final Date date;
    public ImmutableDate(Date date) {
        this.date = new Date(date.getTime());
    }
    public ImmutableDate addYears(int yearsToAdd) {
        this.date.setYear(this.date.getYear()+yearsToAdd);
        return this;
    }
    public ImmutableDate addMonths(int monthsToAdd) {
        this.date.setMonth(this.date.getMonth()+monthsToAdd);
        return this;
    }
    public ImmutableDate addDays(int daysToAdd) {
        this.date.setDate(this.date.getDate()+daysToAdd);
        return this;
    }
    public Date getDate() {
        return new Date(date.getTime());
    }
    @Override
    public String toString() {
        return "ImmutableDate{" +
                "date=" + date +
                '}';
    }
}