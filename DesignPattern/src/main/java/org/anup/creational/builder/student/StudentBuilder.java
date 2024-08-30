//package org.anup.creational.builder.student;
//
//import java.util.EnumSet;
//import java.util.function.Consumer;
//
//public class StudentBuilder {
//    // Require fields
//    private String firstName;
//    private String lastName;
//    private int rollNum;
//
//    // Optional fields
//    private String course;
//    private int year;
//    private String address;
//
//    // Constructor for initializing Require fields
//    public StudentBuilder(String firstName, String lastName, int rollNum) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.rollNum = rollNum;
//    }
//
//    // Setter methods for initializing optional fields
//    public StudentBuilder setCourse(String course) {
//        this.course = course;
//        return this;
//    }
//
//    public StudentBuilder setYear(int year) {
//        this.year = year;
//        return this;
//    }
//
//    public StudentBuilder setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getRollNum() {
//        return rollNum;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    // validate to ensure obj state is valid through multiple if statement, Runnable List, StreamApi, Map or enum
////    private void validate(){
////        if(this.firstName == null || this.firstName.isEmpty())
////            throw new IllegalArgumentException("first name can't be null and empty");
////        if (this.lastName == null || this.lastName.isEmpty())
////            throw new IllegalArgumentException("last Name can't be null or empty");
////    }
//
//    private enum Validator{
//        FIRST_NAME(sb -> {
//            if(sb.firstName == null || sb.firstName.isEmpty())
//                throw new IllegalArgumentException("first name can't be null and empty");
//        }),
//        LAST_NAME(sb -> {
//            if(sb.lastName == null || sb.lastName.isEmpty())
//                throw new IllegalArgumentException("last name can't be null and empty");
//        }),
//        ROLL_NUMBER(sb -> {
//            if(sb.rollNum <= 0)
//                throw new IllegalArgumentException("Roll Num must be positive");
//        }),
//        YEAR(sb -> {
//            if(sb.year != 0 && (sb.year < 2000 || sb.year > 2024))
//                throw  new IllegalArgumentException("Year must be between 2002 to 2024");
//        });
//
//        private final Consumer<StudentBuilder> validator;
//
//        Validator(Consumer<StudentBuilder> validator){
//            this.validator = validator;
//        }
//
//        void validate(StudentBuilder sb){
//            validator.accept(sb);
//        }
//    }
//
//    private void validate(){
//        EnumSet.allOf(Validator.class).forEach(v -> v.validate(this));
//    }
//
//    // build method to create a student instance
//    public Student build(){
//        validate(); // check validating before creating the obj.
//        return new Student(this);
//    }
//}
