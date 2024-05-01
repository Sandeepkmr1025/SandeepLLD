package DesignPatterns.CreationalDesignPattern.prototypeRegistry;

public class IntelligentStudent extends Student{

    public IntelligentStudent()
    {}

    public IntelligentStudent(IntelligentStudent intelligentStudent)
    {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
