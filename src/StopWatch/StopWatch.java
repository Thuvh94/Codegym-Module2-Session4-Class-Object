package StopWatch;

import java.util.Calendar;
public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    Calendar calendar = Calendar.getInstance();
    long currentTime = calendar.getTimeInMillis();

    public void start(){
        this.startTime = currentTime;
    }
    public void stop(){
        this.endTime = currentTime;
    }
    public StopWatch(){
    }

    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
