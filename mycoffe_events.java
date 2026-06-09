package coffedemo;
public class mycoffe_events implements Runnable {

    String msg;

    public mycoffe_events(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
    }
}
