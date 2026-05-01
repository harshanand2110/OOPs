package OOPS.Encapsulation;

public class App {
    public static void main(String[] args) {
//        Student A = new Student();
//        A.id = 21;
//        A.name = "harsh";
//        A.age = 19;
//        A.roll = 022;
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.roll);
//        A.eat();
//        A.sleep();
        Student A = new Student(21,19,"Harsh",022, "Shanaya");
        System.out.println(A.id);
        System.out.println(A.roll);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.getGf());
        A.eat();
        A.sleep();
        A.gfChatting();
    }
}
