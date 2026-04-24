package OOPS.Encapsulation;

import OOPS.Student;

public class Demo {
    public static void main(String[] args) {

        Student A = new Student(21,19,"Harsh",022, "Shanaya");
        System.out.println(A.id);
        System.out.println(A.roll);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.getGf());  //getter is used check Student class to get more idea
        A.eat();
        A.sleep();
        A.gfChatting();
    }
    
}
