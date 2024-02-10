package day13_parctice_task.phone;

public class PhoneClients {
    public static void main(String[] args) {
        Phone phone1=new Phone("Iphone","13plus","max",2000,"silver");
        System.out.println(phone1);
        phone1.call(1234244);
        phone1.faceTime(123444);
        phone1.text(1234442);
        Nokia phone2=new Nokia("null","3310","normal",2000,null);
        System.out.println(phone2);
        phone2.call(98765);
        phone2.faceTime(98765);
        phone2.text(98765);
        Samsung phone3=new Samsung("samsung","ultra s","large",49949,"black");
        System.out.println(phone3);
        phone3.call(5678912);
        phone3.text(5678912);
        phone3.faceTime(5678912);



    }
}
