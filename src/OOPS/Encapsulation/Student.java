package OOPS.Encapsulation;

public class Student {
    //attributes
    public int id;
    public int age ;
    public String name;
    public int roll;

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    private String gf;

    //Default Constructor // attributes
//    public Student(){
//        System.out.println("default  ctor called");
//    }

    //Parameterised Constructor
    public Student(int id , int age , String name , int roll, String gf){
        this.id = id;
        this.age = age;
        this.name = name;
        this.roll = roll;
        this.gf = gf;
    }

    //methods or behaviours
    public void study(){
        System.out.println("studying");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void gfChatting(){
        System.out.println("chatiing to gf");
    }

}
