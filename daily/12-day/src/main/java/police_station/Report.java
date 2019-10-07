package police_station;

public class Report {

    private int reportId;
    private AlertType alertType;
    private Crime crime;

    private Report(Builder builder) {
        reportId = builder.reportId;
        alertType = builder.alertType;
        crime = builder.crime;
    }


    public AlertType getAlertType() {
        return alertType;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + reportId +
                ", alertType=" + alertType +
                ", crime=" + crime +
                '}';
    }

    public static final class Builder {
        private int reportId;
        private AlertType alertType;
        private Crime crime;

        public Builder() {
        }

        public Builder withReportId(int val) {
            reportId = val;
            return this;
        }

        public Builder withAlertType(AlertType val) {
            alertType = val;
            return this;
        }

        public Builder withCrime(Crime val) {
            crime = val;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
