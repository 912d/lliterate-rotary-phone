package javaapplication1;

/**
 *
 * @author re
 */
public class JavaApplication1 {

    public double calculateThings(int x, int y) {
        return x * y;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScheduleTask scheduleTask = new ScheduleTask();
        scheduleTask.execTask();
    }
    
}
