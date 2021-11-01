public class Person {
    private String name;
    private int birthYear;
    private int age;
    private int year = 2021;

    public void changeName(String name){
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    // Default Constructor
    public Person(){
    }
    //  Constructor
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    // To calculate the age
    public int age(){
         int age = year - birthYear;
        return age;
    }
    public void output(){
        System.out.println("My name is "+name+" and I am "+age()+" years old.");
    }
}


