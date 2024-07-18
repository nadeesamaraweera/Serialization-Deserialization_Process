package lk.ijse.gdse.aad68.serialization_and_deserialization_process;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DeserializeStudent {
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = mapper.readValue(new File("student.json"), Student.class);
            System.out.println("Student deserialized from 'student.json'");
            System.out.println(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}




