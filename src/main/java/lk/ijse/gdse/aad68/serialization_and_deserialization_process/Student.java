package lk.ijse.gdse.aad68.serialization_and_deserialization_process;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Student implements Serializable {


        private static final long serialVersionUID = 1L;
        private String name;
        private String address;
        private int age;

        public Student(String name, int age,String address) {
            this.name = name;
            this.address=address;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "',address='" + address + "',age='" + age + '}';
        }
    }



