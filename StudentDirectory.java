import java.util.ArrayList;

public class StudentDirectory {
    private ArrayList<Student> studentDirectory = new ArrayList<Student>();

    public StudentDirectory() {

    }

    public void addToDirectory(Student student) {
        studentDirectory.add(student);
    }

    public String toStringDirectory() {
        String studentList = "";
        for (int i = 0; i < studentDirectory.size(); i++){
            studentList += "\n";
            studentList += studentDirectory.get(i).toString();
            studentList += "\n";
        }
        return studentList;
    }
}