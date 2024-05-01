package DesignPatterns.CreationalDesignPattern.prototypeRegistry_practice;

public class IntelligentStudent extends Student{
 private int iq;

    public IntelligentStudent() {

    }
    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    /*@Override
    public String toString() {
        return "IntelligentStudent{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", psp=" + this.getPsp() +
                ", batch='" + this.getBatch() + '\'' +
                ", iq='" + this.getIq() + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return String.valueOf(this.hashCode());
    }
}
