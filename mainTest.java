import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class mainTest {

        @Test
        public void evaluatesExpressionSuccess() {
            int[] arr = new int[]{1,2,3};
sumOfArray sum = new sumOfArray(arr);
int summ = sum.total();
assertEquals(6,summ);
        }
        @Test
    public void test2(){
            int[] arr = new int[]{0,0,0};
            sumOfArray sum = new sumOfArray(arr);
            int summ = sum.total();
            assertEquals(0,summ);
        }


}
