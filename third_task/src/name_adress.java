import java.util.Scanner;

public class name_adress {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.nextLine();
        String adress;
        System.out.println("Where do u live " + name+"?");
        adress = in.nextLine();
        System.out.println(name+ ", you live in "+ adress+ ".");
    }
}
