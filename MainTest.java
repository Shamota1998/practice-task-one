import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

        @Test
        public void sumOfPositives() {
            int[] arr = new int[]{1,2,3};
             SumOfArray sum= new SumOfArray(arr);
             int summ = sum.total();
             assertEquals(6,summ);
        }
        @Test
        public void sumOfNegatives(){
            int[] arr = new int[]{-1,-2,-3};
            SumOfArray sum = new SumOfArray(arr);
            int summ = sum.total();
            assertEquals(-6,summ);
        }

//    @Test
//    public void test3(){
//        SumOfArray sum = new SumOfArray();
//        int summ = sum.total();
//        assertEquals(0,summ);
//    }
}
