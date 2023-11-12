package Test;

import ppois.lb2.DateRange;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DateRangeTest {
    @Test
    public void testSetAndGetStartTime() {
        DateRange dateRange = new DateRange();
        LocalTime startTime = LocalTime.of(9, 0);
        dateRange.setStartTime(startTime);
        assertEquals(startTime, dateRange.getStartTime());
    }

    @Test
    public void testSetAndGetEndTime() {
        DateRange dateRange = new DateRange();
        LocalTime endTime = LocalTime.of(17, 0);
        dateRange.setEndTime(endTime);
        assertEquals(endTime, dateRange.getEndTime());
    }

    @Test
    public void testToString() {
        DateRange dateRange = new DateRange();
        dateRange.setStartTime(LocalTime.of(9, 0));
        dateRange.setEndTime(LocalTime.of(17, 0));

        String expectedString = "09:00:00 - 17:00:00";
        assertEquals(expectedString, dateRange.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        DateRange dateRange1 = new DateRange();
        dateRange1.setStartTime(LocalTime.of(9, 0));
        dateRange1.setEndTime(LocalTime.of(17, 0));

        DateRange dateRange2 = new DateRange();
        dateRange2.setStartTime(LocalTime.of(9, 0));
        dateRange2.setEndTime(LocalTime.of(17, 0));

        assertEquals(dateRange1, dateRange2);
        assertEquals(dateRange1.hashCode(), dateRange2.hashCode());
    }
}