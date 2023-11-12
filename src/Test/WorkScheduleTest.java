package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Weekday;
import ppois.lb2.WorkSchedule;

import java.time.LocalTime;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WorkScheduleTest {

    @Test
    public void testSetAndGetWorkHours() {
        WorkSchedule workSchedule = new WorkSchedule();

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 0);

        workSchedule.setWorkHours(Weekday.MONDAY, startTime, endTime);

        assertEquals(startTime, workSchedule.getWorkHours(Weekday.MONDAY).getStartTime());
        assertEquals(endTime, workSchedule.getWorkHours(Weekday.MONDAY).getEndTime());
    }

    @Test
    public void testEmptyScheduleToString() {
        WorkSchedule workSchedule = new WorkSchedule();

        String expectedString = "Work Schedule:\n";

        assertEquals(expectedString, workSchedule.toString());
    }
}