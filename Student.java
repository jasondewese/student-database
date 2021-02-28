import java.util.Scanner;

public class Student {
    private String firstName = "";
    private String lastName = "";
    private int grade = 0;
    private int id = 0;

    public Student(String first, String last, int studentGrade, int studentID) {
        firstName = first;
        lastName = last;
        grade = studentGrade;
        id = studentID;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public int getGrade(){
        return this.grade;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return 
         "First Name: " + this.firstName + "\n"
        + "Last Name: " + this.lastName + "\n"
        + "Grade = " + String.valueOf(this.grade) + "\n"
        +"ID = " + String.valueOf(this.id) + "\n";
    }

    public static Student addNewStudent() {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        int grade;
        int id;
        

        System.out.print("\nEnter the student's first name: ");
        firstName = scan.nextLine();

        System.out.print("Enter the student's last name: ");
        lastName = scan.nextLine();

        System.out.print("Enter the student's current grade: ");
        try {
            grade = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException e)
            {
                grade = 0;
                System.out.println("\nInvalid input for grade");
                System.out.println();
            }
        

        System.out.print("Enter the student's id: ");
        try {
            id = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException e)
            {
                id = 0;
                System.out.println("\nInvalid input for id");
                System.out.println();
            }

        Student newStudent = new Student(firstName, lastName, grade, id);
        return newStudent;
    }

}