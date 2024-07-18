package lk.ijse.gdse.aad68.serialization_and_deserialization_process;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

        private String name;
        private String age;
        private String address;

        public Student(@JsonProperty("name") String name,
                        @JsonProperty("age") String age,
                        @JsonProperty("address") String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


