public class StopWatch {

    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    //to start timer
    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    // to stop timer
    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getElapsedTime()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args) {

            StopWatch sw = new StopWatch();
            System.out.println("Press '1' to Start Time: ");
            sw.start();


            System.out.println("Press '2' to Stop Time: ");
            sw.stop();

            long l = sw.getElapsedTime();
            System.out.println("Total Time Elapsed(in millisec) is:" + l);
            System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");
        }
}
