import java.util.Scanner;

public class tasttodo {
    public static void main(String[] args) {

        int n ;
        int kvadrat;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = in.nextInt();

        //first task
        kvadrat = n * n;
        String str = Integer.toString(kvadrat);
        System.out.println("n^2="+kvadrat+", contains '3' = "+ str.contains("3"));
        System.out.println();

        //second task
        String revers_order = Integer.toString(n);
        String reverse = new StringBuffer(revers_order).reverse().toString();
        System.out.println("The reverse order of n: " + reverse);
        System.out.println();

        //third task
        String replace = Integer.toString(n);
        char first = replace.charAt(0);
        char last = replace.charAt(replace.length()-1);
        StringBuilder sb = new StringBuilder(replace);
        sb.setCharAt(0, last);
        sb.setCharAt(replace.length()-1, first);
        String newString = sb.toString();
        System.out.println("third task. swaped n:" + newString);
        System.out.println();

        //fourth task
        String addone = Integer.toString(n);
        char one = '1' ;
        addone= one + addone + one;
        int added =Integer.parseInt(addone);
        System.out.println("Added 1 to the start and end:  " + added);
    }
}
