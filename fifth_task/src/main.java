
import java.util.Arrays;

public class main{
    public static void main(String[] args) {
        Dog doggo1 = new Dog("Hulk", 4, Dog.breed.Boxer );
        Dog doggo2 = new Dog("wolk", 2, Dog.breed.Labrador);
        Dog doggo3 = new Dog("Nicky",1, Dog.breed.Spaniel);

        System.out.println("Our gods:");
        doggo1.output();
        doggo2.output();
        doggo3.output();
        System.out.println();
        Object[] ObjectArray= {doggo1.getAge(),doggo2.getAge(),doggo3.getAge()};
        Arrays.sort(ObjectArray);
        int maximum = (int) ObjectArray[ObjectArray.length-1];
        if (doggo1.getAge() == maximum){
            System.out.print( "The oldest dog is - ");
            doggo1.output();
        } else if (doggo2.getAge() == maximum){
            System.out.print( "The oldest dog is - ");
            doggo2.output();
        }else if (doggo3.getAge() == maximum){
            System.out.print( "The oldest dog is - ");
            doggo3.output();
        }
        System.out.println();

        boolean sameBreed = false;
        if (doggo1.getBreed() == doggo2.getBreed() | doggo1.getBreed() == doggo3.getBreed() | doggo2.getBreed() == doggo3.getBreed()){
            sameBreed = true;
            System.out.println("There are dogs with same breed - "+sameBreed);
        } else {
            System.out.println("There are dogs with same breed - "+sameBreed);
        }
    }


}