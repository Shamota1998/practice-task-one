import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class sumOfArray {
    private ArrayList <Integer> list = new ArrayList<Integer>();
    private int summa =0;
    sumOfArray() throws NullPointerException, java.util.InputMismatchException {
        System.out.println("Input integer number to calculate the sum: (for exit press 0)");
        int temp=-1;
        while(temp!=0){
            System.out.print("Number to calculate :");
            temp = new Scanner(System.in).nextInt();

            list.add(temp);
            System.out.println("\n");
        }
    }

    sumOfArray(int[] arr){
        for (int var:arr) {
            list.add(var);
        }
    }
    public int total(){
        for (int arg:list) {
            summa+=arg;
        }
        return summa;
    }
}
