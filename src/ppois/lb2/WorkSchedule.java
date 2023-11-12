package ppois.lb2;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkSchedule {
    private Map<Weekday, DateRange> schedule;

    public WorkSchedule() {
        schedule = new HashMap<Weekday, DateRange>();
    }

    public void setWorkHours(Weekday dayOfWeek, LocalTime startTime, LocalTime endTime) {
        DateRange dateRange = new DateRange();
        dateRange.setStartTime(startTime);
        dateRange.setEndTime(endTime);
        schedule.put(dayOfWeek, dateRange);
    }

    public DateRange getWorkHours(Weekday dayOfWeek) {
        return schedule.get(dayOfWeek);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Work Schedule:\n");
        for (Map.Entry<Weekday, DateRange> entry : schedule.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSchedule that = (WorkSchedule) o;
        return Objects.equals(schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule);
    }
}

