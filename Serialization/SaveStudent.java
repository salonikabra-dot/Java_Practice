package Java_Practice.Serialization;
import java.io.*;

public class SaveStudent {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice");

        try {
            FileOutputStream fileOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s);  

            out.close();
            fileOut.close();

            System.out.println("Student saved to file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
