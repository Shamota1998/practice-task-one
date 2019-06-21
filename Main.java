import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
try {
    SumOfArray obj = new SumOfArray();
    System.out.println("Sum = " + obj.total());
}catch(MyException e){
    System.out.println(e.toString());
}catch(InputMismatchException ex){
    System.out.println("Please enter only integers!");
   // ex.printStackTrace();
}

}

}
