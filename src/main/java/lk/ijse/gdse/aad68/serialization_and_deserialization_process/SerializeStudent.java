

package lk.ijse.gdse.aad68.serialization_and_deserialization_process;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializeStudent{
    public static void main(String[] args){
        Student student = new Student("Nadeesha","24","Matara");

        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("student.json"), student);
            System.out.println("Student serialized to 'student.json'");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
