package entity;

public class Student {
    private String StudentId;
    private String Name;
    private String dob;
    private String Address;
    private int Contact;

    public Student() {
    }

    public Student(String studentId, String name, String dob, String address, int contact) {
        setStudentId(studentId);
        setName(name);
        this.setDob(dob);
        setAddress(address);
        setContact(contact);
    }


    @Override
    public String toString() {
        return "Student{" +
                "StudentId='" + getStudentId() + '\'' +
                ", Name='" + getName() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Contact=" + getContact() +
                '}';
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }
}
