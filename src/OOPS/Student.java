package OOPS;

public class Student {
    //attributes
    public int id;
    public int age ;
    public String name;
    public int roll;

    //Default Constructor // attributes
    public Student(){
        System.out.println("default  ctor called");
    }

    //Parameterised Constructor
    public Student(int id , int age , String name , int roll){
        this.id = id;
        this.age = age;
        this.name = name;
        this.roll = roll;
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

}
