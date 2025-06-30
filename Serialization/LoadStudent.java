package Java_Practice.Serialization;
import java.io.*;

public class LoadStudent {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student s = (Student) in.readObject();  // Load the student

            in.close();
            fileIn.close();

            System.out.println(" Student loaded from file:");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
