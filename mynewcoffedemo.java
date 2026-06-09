
package coffedemo;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class mynewcoffedemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        mycoffe_events coffe = new mycoffe_events("adding coffe");
        mycoffe_events sugar = new mycoffe_events("adding sugar");
        mycoffe_events water = new mycoffe_events("adding water");
        mycoffe_events serve = new mycoffe_events("serving the coffe");


        executor.schedule(coffe,4, TimeUnit.SECONDS);
        executor.schedule(sugar,7, TimeUnit.SECONDS);
        executor.schedule(water,11, TimeUnit.SECONDS);
        executor.schedule(serve,20, TimeUnit.SECONDS);

        for(int i =1 ;i<=20; i++){
            executor.schedule(new MyTimer(i),i,TimeUnit.SECONDS);
        }
    }
}
