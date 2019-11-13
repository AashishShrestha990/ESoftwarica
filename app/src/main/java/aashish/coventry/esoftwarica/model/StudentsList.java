package aashish.coventry.esoftwarica.model;

import java.util.List;

public class StudentsList {
    static List<Student> StudentList;
    boolean result=false;
    String Name, Age, Address, Gender;

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;

    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public List<Student> getStudentlist() {
        return StudentList;
    }

    public boolean Check() {
        if (getStudentlist() != null) {

            for (int i = 0; i < getStudentlist().size(); i++) {
                final Student studentdetail = getStudentlist().get(i);
                if (Name.equals(studentdetail.getName()) && Age.equals(studentdetail.getAge())) {
                    result = true;
                } else {
                    result = false;
                }

            }
        } else {
            result = false;

        }

        return result;
    }

}
