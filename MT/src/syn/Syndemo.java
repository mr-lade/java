package syn;

import java.io.*;
import java.util.*;

// A Class used to send a message
class Senders {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSends extends Thread {
    private String msg;
    Senders sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSends(String m, Senders obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        // send the message without synchronization
        sender.send(msg);
    }
}

// Driver class
class SyncDemo {
    public static void main(String args[]) {
        Senders send = new Senders();
        ThreadedSends S1 = new ThreadedSends(" Hi ", send);
        ThreadedSends S2 = new ThreadedSends(" Bye ", send);

        // Start two threads of ThreadedSends type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
