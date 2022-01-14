public class LessonSeventeen {

    public static void main(String[] args) {

        // Create a new Thread that executes the code in GetTime20

        Thread getTime = new GetTime20();

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds

        Runnable getMail = new GetTheMail(10);

        Runnable getMailAgain = new GetTheMail(20);

        // Call for the code in the method run to execute

        getTime.start();

        new Thread(getMail).start();
        new Thread(getMailAgain).start();

    }

}

// Yes, if the thread doesn't have further actions to perform it ends.
// The thread runs until an exception is thrown, or it reaches the end of the
// run method.

// A thread is just a list of code that executes for a period of time and then
// ends. The main function is a thread. When you implement runnable, that means
// you promise to make a method named run. When start() is called on that
// object, the code in run() executes until it finishes. This is all being done
// so we can have more than one group of code executing at the same time. Kind
// of like walking and chewing gum :)