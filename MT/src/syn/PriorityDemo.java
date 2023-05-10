package syn;

class PriorityDemo extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running");
    }

    public static void main(String[] args) {
        PriorityDemo thread1 = new PriorityDemo();
        PriorityDemo thread2 = new PriorityDemo();
        PriorityDemo thread3 = new PriorityDemo();

        System.out.println(" priority before setting: " + Thread.currentThread().getName() + thread1.getPriority());
        System.out.println(" priority before setting: " + Thread.currentThread().getName() + thread2.getPriority());
        System.out.println(" priority before setting: " + Thread.currentThread().getName() + thread3.getPriority());

        thread1.setPriority(Thread.MIN_PRIORITY); // set thread1 to lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY); // set thread2 to default priority
        thread3.setPriority(Thread.MAX_PRIORITY); // set thread3 to highest priority

        System.out.println("priority after setting: " + Thread.currentThread().getName() + thread1.getPriority());
        System.out.println("priority after setting: " + Thread.currentThread().getName() + thread2.getPriority());
        System.out.println("priority after setting: " + Thread.currentThread().getName() + thread3.getPriority());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


