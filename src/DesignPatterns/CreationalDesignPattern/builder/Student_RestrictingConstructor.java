package DesignPatterns.CreationalDesignPattern.builder;

public class Student_RestrictingConstructor {

    private String name;
    private int age;
    private String email;
    private int psp;
    private int graduationYear;
    private String universityName;

    private Student_RestrictingConstructor(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.psp = builder.getPsp();
        this.graduationYear = builder.getGraduationYear();
        this.universityName = builder.getUniversityName();
    }

    public static Builder getBuilder()
    {
        return new Builder();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", psp=" + psp +
                ", graduationYear=" + graduationYear +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private int age;
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

        public Student_RestrictingConstructor build()
        {
            if (this.getGraduationYear()>2024)
            {
                throw new RuntimeException("Validation failed");
            }
            return new Student_RestrictingConstructor(this);
        }
    }
}

