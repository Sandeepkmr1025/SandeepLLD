package DesignPatterns.CreationalDesignPattern.builder;

public class Builder {

    private String name;
    private Integer age;
    private String email;
    private int psp;
    private int graduationYear;
    private String universityName;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getPsp() {
        return psp;
    }

    public Builder setPsp(int psp) {
        this.psp = psp;
        return this;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public Builder setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Builder setUniversityName(String universityName)
    {
        this.universityName = universityName;
        return this;
    }

    public Student build()
    {
        if (this.getGraduationYear()>2024)
        {
            throw new RuntimeException("Validation failed");
        }
        return new Student(this);
    }
}
