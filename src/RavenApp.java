import java.util.Scanner;

public class RavenApp {
    public static void main(String[] args) {

        // scanner class instantiating
        Scanner keybd = new Scanner(System.in);
        RavenService rsrv = new RavenService();


        // variable to store user reply
        String userInput;

        // Scanner reads user input
        System.out.println("Good morning, how are you feeling today? (q/Q to quit)");
        userInput = keybd.nextLine();
        // while user input is not equal to the letter q keep looping
        while (!userInput.equalsIgnoreCase("q")) {

            String tempUserInput = userInput.toLowerCase();

            if (tempUserInput.contains("bye")) {
                System.out.println("why is bye not working=" + tempUserInput);
                rsrv.printBye(userInput);
                break;
            } else {
                rsrv.giveReply(userInput);
                userInput = keybd.nextLine();
            }
        }   // end of while() loop

        // print all conversations
        rsrv.printAllLogs();


    }   // end of main() method

}   // end of Class
