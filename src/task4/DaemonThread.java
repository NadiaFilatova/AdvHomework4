package task4;

//Створіть потік-демон і виведіть про нього якнайбільше інформації.
public class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("My daemon thread");
    }

}
