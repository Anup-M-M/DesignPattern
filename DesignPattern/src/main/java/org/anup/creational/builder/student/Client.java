package org.anup.creational.builder.student;

public class Client {
    public static void main(String[] args) {

//        Student s1 = new Student();
//        // what if here you client misuses the students and send it to a class which is expecting
//        enroll(s1);
//        // object is already created without any validations
//        s1.setAge(24);

        try {
            // Your data will be ready before you create the actual object
            Student std1 = Student.getBuilder("kusu", "k", 100).setCourse("Java Curse").setYear(2024).build();
            System.out.println(std1);

            Student std2 = Student.getBuilder("Anup", "M", 101).setCourse("Java Curse").setYear(1000).build();
            System.out.println(std2);
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void enroll(Student st) {
        // some work is done over for which id and email are mandatory
        System.out.println("Enrollment is completed");
    }
}
