package day13_parctice_task.student;

import javax.crypto.spec.PSource;

public class GraduateStudent extends Students{

    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }
}
