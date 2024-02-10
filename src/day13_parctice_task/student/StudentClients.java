package day13_parctice_task.student;

public class StudentClients {
    public static void main(String[] args) {
        Student student1= new Student("enes",30,"Male");
        System.out.println(student1);
        Students student2= new Students("ahmet",23,"male","bb12","onlien",'b',"whampstead");
        student2.study();
        System.out.println(student2);
        GraduateStudent student3= new GraduateStudent("aise",33,"female","bb13","facetoface",'c',"camden");
        student3.study();
        System.out.println(student3);
        CydeoStudent student4= new CydeoStudent("Ella",18,"female","bb15","onlien",'a',"st agnes");
        System.out.println(student4);

    }
}
