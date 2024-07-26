import java.io.*;
import java.util.*; 

public class limeshell {
    public class handlers {
        public static void get_input(String header) {
            Scanner ioScanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("|" + header + "|>");
            String input_data = ioScanner.next();  // Read user input 
        }
    }
    public class cmd {
        public static void mkfile(String filename) {
            try {
                File filehandler = new File(filename);
                if (filehandler.createNewFile()) {
                    System.out.println("mkfile: File created: " + filehandler.getName());
                } 
                else {
                    System.out.println("[USR_ERROR][LOG]: File already exists.");
                }
            } 
            catch (IOException e) {
                System.out.println("[ERROR][LOG]: An error occurred.");
                e.printStackTrace();
            }
        }
        public static void hlp() {
            System.out.println("LimeSHELL Help:");
            System.out.println("mkfile - creates a file using the mkfile wizard.");
            System.out.println("help - displays this help program.");
            System.out.println("hlp - displays this help program.");
        }
    }
    public static void main(String[] args) {
        System.out.println("LimeSHELL 1.0 beta");
        handlers.get_input("limesh1.1");
        System.out.println("wtf>");
    }
}