import java.util.Scanner;

public class phone_calls {
    public static void main(String[] args) {

        double c1 , c2 , c3;
        double t1 , t2 , t3;
        double count1 , count2 , count3 , count_all;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter standart per minute for c1:");
        c1 = in.nextDouble();
        System.out.println("Enter duration t1:");
        t1 = in.nextDouble();
        System.out.println("Enter standart per minute for c2:");
        c2 = in.nextDouble();
        System.out.println("Enter duration t2:");
        t2 = in.nextDouble();
        System.out.println("Enter standart per minute for c3:");
        c3 = in.nextDouble();
        System.out.println("Enter duration t3:");
        t3 = in.nextDouble();

        count1 = c1 * t1;
        count2 = c2 * t2;
        count3 = c3 * t3;
        count_all = count1 + count2 + count3;
        System.out.println("Computer count for call 1 - "+count1);
        System.out.println("Computer count for call 2 - "+count2);
        System.out.println("Computer count for call 3 - "+count3);
        System.out.println("Computer count for all calls  -"+count_all);


    }
}
