package DesignPatterns.CreationalDesignPattern.builder;

public class Client {

    public static void main(String[] args) {
       /* Builder DesignPatterns.CreationalDesignPattern.builder = Student.getBuilder();

        DesignPatterns.CreationalDesignPattern.builder.setName("John");
        DesignPatterns.CreationalDesignPattern.builder.setAge(29);
        DesignPatterns.CreationalDesignPattern.builder.setEmail("john@gmail.com");
        DesignPatterns.CreationalDesignPattern.builder.setPsp(90);
        DesignPatterns.CreationalDesignPattern.builder.setGraduationYear(2024);
        DesignPatterns.CreationalDesignPattern.builder.setUniversityName("Oxford");
        Student student = DesignPatterns.CreationalDesignPattern.builder.build(); */

        /*Student student = Student.getBuilder()
                .setName("John")
                .setAge(29)
                .setEmail("john@gmail.com")
                .setPsp(90)
                .setGraduationYear(2024)
                .setUniversityName("Oxford")
                .build();

        System.out.println(student);*/

        Student_RestrictingConstructor student = Student_RestrictingConstructor.getBuilder()
                .setName("John")
                .setAge(29)
                .setEmail("john@gmail.com")
                .setPsp(90)
                .setGraduationYear(2024)
                .setUniversityName("Oxford")
                .build();

        System.out.println(student);
    }
}
