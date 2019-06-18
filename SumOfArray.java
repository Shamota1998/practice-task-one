import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfArray {
    private ArrayList <Integer> list = new ArrayList<Integer>();
    private int summa =0;
    SumOfArray() throws NullPointerException {
        System.out.println("Input integer number to calculate the sum: (for exit press 0)");
        int temp=-1;
        try{
        while(temp!=0){
            System.out.print("Number to calculate :");
            temp = new Scanner(System.in).nextInt();

            list.add(temp);
            System.out.println("\n");
        }}catch(InputMismatchException e){
            System.out.println("Please enter only integers!");

        }
    }

    SumOfArray(int[] arr)throws NullPointerException{
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
