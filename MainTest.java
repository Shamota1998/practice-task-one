import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Random;

public class MainTest {

        @Test
        public void sumOfPositives() throws MyException{
            int[] arr = new int[]{1,2,3};
             SumOfArray sum= new SumOfArray(arr);
             int summ = sum.total();
             assertEquals(6,summ);
        }

        @Test
        public void sumOfNegatives() throws MyException{
            int[] arr = new int[]{-1,-2,-3};
            SumOfArray sum = new SumOfArray(arr);
            int summ = sum.total();
            assertEquals(-6,summ);
        }

        @Test(expected = MyException.class)
            public void nullPointerTest() throws MyException{
            int[] arr=null;
            SumOfArray sum = new SumOfArray(arr);
        }

        @Test
            public void notNullTest() throws MyException{
            int[] arr = new int[]{55,55,55};
            SumOfArray sum = new SumOfArray(arr);
            int summ = sum.total();
            assertNotNull(summ);
    }

        @Test(timeout = 10)
            public void timeOutTest() {
            int[] arr = new int[500];
            for(int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt();
      }
    }

}
