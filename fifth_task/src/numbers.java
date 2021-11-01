import java.util.Arrays;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        float n1 , n2 , n3;

        //first task
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the float number 1:");
        n1 = in.nextFloat();
        System.out.println("Enter the float number 2:");
        n2 = in.nextFloat();
        System.out.println("Enter the float number 3:");
        n3 = in.nextFloat();

        if ( n1 >= -5 && n1 <= 5){
                System.out.println("Number 1 belong to range [-5 ,5]. Number 1 :"+n1);
        } else {
            System.out.println("Number 1 do not belong to range [-5 ,5]. Number 1 :"+n1);
        }
        if ( n2 >= -5 && n2 <= 5){
            System.out.println("Number 2 belong to range [-5 ,5]. Number 2 :"+n2);
        } else {
            System.out.println("Number 2 do not belong to range [-5 ,5]. Number 2 :"+n2);
        }
        if ( n3 >= -5 && n3 <= 5){
            System.out.println("Number 3 belong to range [-5 ,5]. Number 3 :"+n3);
        } else {
            System.out.println("Number 3 do not belong to range [-5 ,5]. Number 3 :"+n3);
        }

        //second task
        int[] arr=new int[3];
        int i=0;
        while (i<arr.length){
            System.out.println("Enter "+i+" index of three int nubmers: ");
            arr[i]=in.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.println("Minimum value of three int numbers = " + arr[0]);
        System.out.println("Maximum value of three int numbers = " + arr[arr.length-1]);

        //third task
        enum HTTPerror{
            Bad_Request(400),
            Unauthorized(401),
            Payment_Required(402),
            Forbidden(403),
            Not_Found(404);
            public int error;

            HTTPerror(int error) {
                this.error = error;
            }
            public int getError(){
                return error;
            }

        }
        System.out.println("Enter nubmer of your HTTP error:");
        int n =in.nextInt();
        for(HTTPerror e: HTTPerror.values()) {
            if (n == e.getError()) {
                System.out.println("Your error: "+e);
            }
        }


    }
}
