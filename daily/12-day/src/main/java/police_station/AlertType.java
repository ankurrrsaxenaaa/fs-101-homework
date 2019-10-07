package police_station;

public enum AlertType {
    CRITICAL(1), URGENT(2), NORMAL(3);

    private int priority;

    private AlertType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
