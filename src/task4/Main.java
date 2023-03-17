package task4;

public class Main {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();//creating thread
        daemonThread.setDaemon(true);// is daemon thread
        daemonThread.start();//starting threads
        System.out.println("Daemon: " + daemonThread.isDaemon());
        System.out.println("Alive: " + daemonThread.isAlive());
        System.out.println("Is interrupted: " + daemonThread.isInterrupted());
        System.out.println("ID: " + daemonThread.getId());
        System.out.println("Name: " + daemonThread.getName());
        System.out.println("State: " + daemonThread.getState());
        System.out.println("Priority: " + daemonThread.getPriority());
    }
}
