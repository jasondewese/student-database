import java.util.Scanner;

public class Controls {
    public static int menu(StudentDirectory directory){
        Scanner scan = new Scanner(System.in);
        int userInput;
        
        System.out.println();
        System.out.println("Choose which option you would like: ");
        System.out.println("1. Add new student");
        System.out.println("2. See student info");
        System.out.println("3. Quit Program");
        System.out.println("");
        
        
        try {
        userInput = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException e)
        {
        userInput = 0;
        }

        if ( userInput == 1){
            directory.addToDirectory(Student.addNewStudent());
            return 0;
        }
        else if ( userInput == 2){
            listStudents(directory);
            return 0;
        }
        else if ( userInput == 3){
            return 1;
        }
        else if (userInput == 0) {
            System.out.print("Error: invalid input\n");
            return 0;
        }
        else {
            System.out.print("Error: invalid input\n");
            return 0;
        }

    }

    public static void listStudents(StudentDirectory directory){
        System.out.println(directory.toStringDirectory());
    }

    public static void printStudent(Student student){

    }
}