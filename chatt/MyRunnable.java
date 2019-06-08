//package chatt;
import java.lang.Runnable;
import java.lang.Thread;
/**
 * MyRunnable
 */
public class MyRunnable implements Runnable{

        public void run(){
            System.out.println("top o' the stack: 1");
        }
        public static void main(String[] args){
            Runnable threadjob = new MyRunnable();
            Thread myThread = new Thread(threadjob);
            myThread.start();
            System.out.println("back in main");
        }
}