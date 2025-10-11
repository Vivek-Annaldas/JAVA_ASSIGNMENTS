import java.util.Random;

class RunnerThread extends Thread {
    private String runnerName;
    private Random random = new Random();

    RunnerThread(String name) {
        this.runnerName = name;
    }

    public void run() {
        for (int distance = 10; distance <= 100; distance += 10) {
            System.out.println(runnerName + ": " + distance + "m");
            try {
                Thread.sleep(random.nextInt(151) + 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(runnerName + ": Finished!");
    }
}

class RunnerRunnable implements Runnable {
    private String runnerName;
    private Random random = new Random();

    RunnerRunnable(String name) {
        this.runnerName = name;
    }

    public void run() {
        for (int distance = 10; distance <= 100; distance += 10) {
            System.out.println(runnerName + ": " + distance + "m");
            try {
                Thread.sleep(random.nextInt(151) + 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(runnerName + ": Finished!");
    }
}

public class DigitalDash {
    public static void main(String[] args) {
        RunnerThread bolt = new RunnerThread("Runner Bolt");
        Thread runnerBlake = new Thread(new RunnerRunnable("Runner Blake"));
        Thread runnerTyson = new Thread(new RunnerRunnable("Runner Tyson"));

        bolt.start();
        runnerBlake.start();
        runnerTyson.start();
    }
}
