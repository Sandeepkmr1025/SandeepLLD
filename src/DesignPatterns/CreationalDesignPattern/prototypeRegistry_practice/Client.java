package DesignPatterns.CreationalDesignPattern.prototypeRegistry_practice;

public class Client {

    private static final StudentRegistry studentRegistry = new StudentRegistry();

    public static void fillRegistry()
    {
        Student student = new Student();
        student.setName("student 1");
        student.setAge(30);
        student.setPsp(90);
        student.setBatch("June 2024");

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setName("student 2");
        intelligentStudent.setAge(25);
        intelligentStudent.setPsp(95);
        intelligentStudent.setBatch("July 2024");
        intelligentStudent.setIq(100);

        studentRegistry.setStudent(student.getBatch(), student);
        studentRegistry.setStudent(intelligentStudent.getBatch(), intelligentStudent);

    }


    public static void main(String[] args) {
        fillRegistry();
        /*IntelligentStudent student = new IntelligentStudent();
        student.setName("Sandeep");
        student.setAge(30);
        student.setPsp(90);
        student.setBatch("June 2024");
        student.setIq(100);

        System.out.println(student);

        IntelligentStudent student_copy = student.copy();

        System.out.println(student_copy);*/

        Student student = studentRegistry.getStudent("June 2024").copy();

        student.setName("Sandeep");
        System.out.println(student);

        Student intelligentStudent = studentRegistry.getStudent("July 2024").copy();

        intelligentStudent.setName("IS Sandeep");
        System.out.println(student);


    }
}
