package Callback;

/**
 * Created by Vlad on 19.12.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Task simpleTask = new SimpleTask();
        simpleTask.execute();
        System.out.println("SimpleTask has been executed");
    }
}
