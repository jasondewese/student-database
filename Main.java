import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
       
        StudentDirectory directory = new StudentDirectory();
        
        
        System.out.println("\nWelcome to the student database!");
        System.out.println("--------------------------------");
        int programControl = 0;
        while (programControl == 0){
            programControl = Controls.menu(directory);

        }

        
        System.out.println("\nGoodbye!\n");
        
    }
}