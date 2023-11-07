package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Weekday;
import ppois.lb2.WorkSchedule;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WorkScheduleTest {

    @Test
    void getWorkingHours() {
        WorkSchedule ws = new WorkSchedule();
        ws.addWorkDay(Weekday.MONDAY, "9-18");
        assertEquals("9-18", ws.getWorkingHours(Weekday.MONDAY));
    }

    @Test
    void addWorkDay() {
    }

    @Test
    void getSchedule() {
        WorkSchedule ws = new WorkSchedule();
        ws.addWorkDay(Weekday.MONDAY, "9-18");
        Map<Weekday, String> map = ws.getSchedule();
        assertEquals(1, ws.getSchedule().size());
    }

    @Test
    void removeWorkDay() {
        WorkSchedule ws = new WorkSchedule();
        ws.addWorkDay(Weekday.MONDAY, "9-18");
        ws.addWorkDay(Weekday.SATURDAY, "9-18");
        ws.removeWorkDay(Weekday.MONDAY);
        assertEquals(null, ws.getWorkingHours(Weekday.MONDAY));
    }

    @Test
    void isWorkDay() {
        WorkSchedule ws = new WorkSchedule();
        ws.addWorkDay(Weekday.MONDAY, "9-18");
        assertEquals(false, ws.isWorkDay(Weekday.SATURDAY));
    }
}