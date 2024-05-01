package DesignPatterns.CreationalDesignPattern.prototypeRegistry;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private double psp;
    private double avgPspOfBatch;
    private String batchName;

    public Student()
    {}

    public Student(Student student) {
        this.name=student.name;
        this.age=student.age;
        this.psp=student.psp;
        this.batchName = student.batchName;
        this.avgPspOfBatch = student.avgPspOfBatch;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgPspOfBatch() {
        return avgPspOfBatch;
    }

    public void setAvgPspOfBatch(double avgPspOfBatch) {
        this.avgPspOfBatch = avgPspOfBatch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    @Override
    public Student copy() {
        return new Student(this);
//        student.setName(this.name);
//        student.setAge(this.age);
//        student.setPsp(this.psp);
//        student.setBatchName(this.batchName);
//        student.setAvgPspOfBatch(this.avgPspOfBatch);
//        return student;
    }
}
