package coffedemo;

public class MyTimer implements Runnable {

    private  int curTime;

    public MyTimer(int curTime) {
        this.curTime = curTime;
    }

    @Override
    public void run() {
        System.out.println("Time Elapsed: " + curTime);
    }
}
