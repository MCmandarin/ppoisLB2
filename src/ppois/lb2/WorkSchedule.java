package ppois.lb2;

import java.util.HashMap;
import java.util.Map;

public class WorkSchedule {
    private Map<Weekday, String> schedule;

    public WorkSchedule() {
        schedule = new HashMap<Weekday, String>();
    }

    public String getWorkingHours(Weekday dayOfWeek) {
        return schedule.get(dayOfWeek);
    }

    public void addWorkDay(Weekday dayOfWeek, String workingHours) {
        schedule.put(dayOfWeek, workingHours);
    }

    public Map<Weekday, String> getSchedule() {
        return schedule;
    }

    public void removeWorkDay(Weekday dayOfWeek) {
        schedule.remove(dayOfWeek);
    }

    public boolean isWorkDay(Weekday dayOfWeek) {
        return schedule.containsKey(dayOfWeek);
    }

}

