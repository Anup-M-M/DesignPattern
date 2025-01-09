package org.anup.creational.builder.student;

import javax.xml.validation.Validator;
import java.util.Arrays;
import java.util.List;

public class Student {
    // Require fields
    private String firstName;
    private String lastName;
    private int rollNum;

    // Optional fields
    private String course;
    private int year;
    private String address;

    public Student() {
    }

    private Student(StudentBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.rollNum = builder.getRollNum();
        this.course = builder.getCourse();
        this.year = builder.getYear();
        this.address = builder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    // static method to get a builder instance
    public static StudentBuilder getBuilder(String firstName, String lastName, int rollNum) {
        return new StudentBuilder(firstName, lastName, rollNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNum=" + rollNum +
                ", course='" + course + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder {
        // Require fields
        private String firstName;
        private String lastName;
        private int rollNum;

        // Optional fields
        private String course;
        private int year;
        private String address;

        // Constructor for initializing Require fields
        public StudentBuilder(String firstName, String lastName, int rollNum) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.rollNum = rollNum;
        }

        // Setter methods for initializing optional fields
        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getRollNum() {
            return rollNum;
        }

        public String getCourse() {
            return course;
        }

        public int getYear() {
            return year;
        }

        public String getAddress() {
            return address;
        }

        // validate to ensure obj state is valid through multiple if statement, Runnable List, StreamApi, Map or enum
//    private void validate(){
//        if(this.firstName == null || this.firstName.isEmpty())
//            throw new IllegalArgumentException("first name can't be null and empty");
//        if (this.lastName == null || this.lastName.isEmpty())
//            throw new IllegalArgumentException("last Name can't be null or empty");
//    }

        private void validate() {
            List<Runnable> validators = Arrays.asList(() -> {
                if (this.firstName == null || this.firstName.isEmpty()) {
                    throw new IllegalStateException("First name cannot be null or empty");
                }
            }, () -> {
                if (this.lastName == null || this.lastName.isEmpty()) {
                    throw new IllegalStateException("Last name cannot be null or empty");
                }
            }, () -> {
                if (this.rollNum <= 0) {
                    throw new IllegalStateException("Roll number must be positive");
                }
            }, () -> {
                if (this.year != 0 && (this.year < 1900 || this.year > 2100)) {
                    throw new IllegalStateException("Year must be between 1900 and 2100");
                }
            }, () -> {
                if (this.address != null && this.address.length() > 100) {
                    throw new IllegalStateException("Address is too long");
                }
            });

            for(Runnable validator : validators){
                validator.run();
            }
        }

        // build method to create a student instance
        public Student build() {
            validate(); // check validating before creating the obj.
            return new Student(this);
        }
    }

}
