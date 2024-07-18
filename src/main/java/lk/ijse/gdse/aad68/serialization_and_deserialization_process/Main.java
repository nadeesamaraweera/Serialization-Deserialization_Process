package lk.ijse.gdse.aad68.serialization_and_deserialization_process;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Nadeesha",24,"Matara");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Serialization successful: " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedPerson = (Student) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

