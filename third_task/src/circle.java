import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        //1 task
        double perimetr , area , radius;
        final double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = in.nextDouble();
        perimetr = 2 * (pi * radius);
        area = pi * (radius * radius);
        System.out.println("The perimetr of circle =" + String.format("%.2f",perimetr)) ;
        System.out.println("The area of circle =" + String.format("%.2f",area));
    }
}
