package Callback;

/**
 * Created by Vlad on 19.12.2016.
 */
class SimpleTask extends Task {

    @Override
    public void execute() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            Thread.interrupted();
            e.printStackTrace();
        }
        System.out.println("Task is finished");
    }
}

