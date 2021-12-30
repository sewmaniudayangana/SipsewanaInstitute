package dto;

import entity.Couse;
import entity.Student;

public class Registerdto {
    private String registerId;
    private String date;

    private Student student;

    private Couse couse;

    public Registerdto() {
    }

    public Registerdto(String registerId, String date, Student student, Couse couse) {
        this.registerId = registerId;
        this.date = date;
        this.student = student;
        this.couse = couse;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Couse getCouse() {
        return couse;
    }

    public void setCouse(Couse couse) {
        this.couse = couse;
    }

    @Override
    public String toString() {
        return "Registerdto{" +
                "registerId='" + registerId + '\'' +
                ", date='" + date + '\'' +
                ", student=" + student +
                ", couse=" + couse +
                '}';
    }
}
