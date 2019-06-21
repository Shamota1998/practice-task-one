import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfArray {
    private ArrayList <Integer> list = new ArrayList<Integer>();
    private int summa =0;
    SumOfArray() throws MyException {
      initialization();
    }

    public void initialization() throws MyException {
        System.out.println("Input integer number to calculate the sum: (for exit press 0)");
        int temp = 0;

            while (true) {
                System.out.print("Number to calculate :");
                temp = new Scanner(System.in).nextInt();
                if (temp == 0) {
                    break;
                }
                list.add(temp);
                System.out.println("\n");
            }
        if (list.size() == 0) {
            throw new MyException();}
        }


    SumOfArray(int[] arr) throws MyException{
        if(arr==null){throw new MyException();}
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
