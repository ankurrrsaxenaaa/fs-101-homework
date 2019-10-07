package police_station;


import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PoliceStationTest {

    @Test
    public void should_return_90_officers_when_urgent_() {
        PoliceStation policeStation = new PoliceStation();
        policeStation.addReport(
                new Report.Builder().withReportId(1).withAlertType(AlertType.NORMAL).withCrime(Crime.KIDNAPPING).build(),
                new Report.Builder().withReportId(2).withAlertType(AlertType.URGENT).withCrime(Crime.VIOLENCE).build(),
                new Report.Builder().withReportId(3).withAlertType(AlertType.CRITICAL).withCrime(Crime.HOMICIDE).build(),
                new Report.Builder().withReportId(4).withAlertType(AlertType.URGENT).withCrime(Crime.VIP_CAVALCADE).build(),
                new Report.Builder().withReportId(5).withAlertType(AlertType.CRITICAL).withCrime(Crime.TERROR_ATTACK).build(),
                new Report.Builder().withReportId(6).withAlertType(AlertType.NORMAL).withCrime(Crime.THEFT).build());

        policeStation.addOfficer(100);
        policeStation.deployOfficer();
        assertThat(policeStation.getOfficers()).isEqualTo(90);
        assertThat(policeStation.allReports()).hasSize(5);

    }


}