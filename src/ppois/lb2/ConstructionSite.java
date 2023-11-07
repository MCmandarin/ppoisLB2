package ppois.lb2;

public class ConstructionSite {
    private String place;
    private Integer workStartTime;
    private Integer workEndTime;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(Integer workStartTime) {
        if (workStartTime < 4 || workStartTime > 11) {
            System.out.println("Invalid time!");
            return;
        }
        this.workStartTime = workStartTime;
    }

    public Integer getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Integer workEndTime) {
        if (workEndTime < 19 || workEndTime > 23) {
            System.out.println("Invalid time!");
            return;
        }
        this.workEndTime = workEndTime;
    }

    @Override
    public String toString() {
        return "ConstructionSite [place=" + place + ", workStartTime=" + workStartTime + "h, workEndTime=" + workEndTime
                + "h]";
    }
}
