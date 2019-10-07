package police_station;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PoliceStation {

    private PriorityQueue<Report> priorityQueue;
    private int officers;

    Comparator<Report> reportComparator = new Comparator<Report>() {
        @Override
        public int compare(Report o1, Report o2) {
            return o1.getAlertType().getPriority() - o2.getAlertType().getPriority();
        }
    };

    public PoliceStation() {
        this.priorityQueue = new PriorityQueue<>(reportComparator);
    }

    public void addReport(Report... reports) {
        for (Report report : reports) {
            priorityQueue.add(report);
        }
    }

    public PriorityQueue<Report> allReports() {
        return this.priorityQueue;
    }

    public void addOfficer(int officers) {
        this.officers += officers;
    }

    public int getOfficers() {
        return this.officers;
    }

    public int deployOfficer() {
        if (priorityQueue.peek().getAlertType().equals(AlertType.CRITICAL)) {
            priorityQueue.poll();
            this.officers = officers - 10;
        }
        if (priorityQueue.peek().getAlertType().equals(AlertType.URGENT)) {
            priorityQueue.poll();
            this.officers = officers - 5;
        }
        if (priorityQueue.peek().getAlertType().equals(AlertType.NORMAL)) {
            priorityQueue.poll();
            this.officers = officers - 2;
        }
        return officers;
    }
}
