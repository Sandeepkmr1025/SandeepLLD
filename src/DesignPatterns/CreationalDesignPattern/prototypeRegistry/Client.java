package DesignPatterns.CreationalDesignPattern.prototypeRegistry;

public class Client {

    private static final StudentRegistry studentRegistry = new StudentRegistry();

    private static void fillRegistry()
    {
        Student student = new Student();
        student.setName("Student1");
        student.setAge(28);
        student.setPsp(87.0);
        student.setBatchName("June 2023");
        student.setAvgPspOfBatch(80.23);

        IntelligentStudent is = new IntelligentStudent();
        is.setName("IS1");
        is.setAge(30);
        is.setPsp(99);
        is.setBatchName("July 2023");
        is.setAvgPspOfBatch(99.0);
        is.setIq(100);

        studentRegistry.setPrototype("July 2023", is);
        studentRegistry.setPrototype("June 2023", student);
    }

    public static void main(String[] args) {
        fillRegistry();

        Student mariya = studentRegistry.getPrototype("June 2023").copy();
        mariya.setName("Mariya");
        mariya.setAge(25);
        mariya.setPsp(80.0);
        mariya.setBatchName("June 2023");
        mariya.setAvgPspOfBatch(80.23);

        Student akhil = studentRegistry.getPrototype("June 2023").copy();;
        akhil.setName("Akhil");
        akhil.setAge(27);
        akhil.setPsp(90.0);

        Student intelligentAkhil = studentRegistry.getPrototype("July 2023").copy();
        intelligentAkhil.setName("Intelligent Akhil");
        intelligentAkhil.setAge(33);
        intelligentAkhil.setPsp(98);

        System.out.println("DEBUG");




    }
}
