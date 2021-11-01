public class Dog {
    private String name;
    private int age;
    private  breed nBreed;

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public breed getBreed(){
        return nBreed;
    }
    enum breed {
        PitBull,
        Labrador,
        Terrier,
        Spaniel,
        Boxer;
    }
    public Dog (String name, int age,  breed nBreed){
        this.name = name;
        this.age = age;
        this.nBreed = nBreed;
    }
    public void output(){
        System.out.println(name+", age-"+age+", breed- "+nBreed);
    }
}
