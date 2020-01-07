package algo;

import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArrayTest {
    @Test
    public void testArrayDeclare(){
        int[] arr1;
        String[] arr2;

        int[] arr01 = new int[5];
        System.out.println(Arrays.toString(arr01));
        boolean[] arr02 = new boolean[4];
        System.out.println(Arrays.toString(arr02));
        String[] arr03 = new String[3];
        System.out.println(Arrays.toString(arr03));
        Object[] arr04 = new Object[5];
        System.out.println(Arrays.toString(arr04));
        
        int[] arr05 = new int[0];
        System.out.println(Arrays.toString(arr05));
        int[] arr06 = new int[] {1,2,4};
        System.out.println("arr6="+Arrays.toString(arr06));

        int[] arr = {3,4,7};
        System.out.println("arr="+Arrays.toString(arr));

        String[] str = {"122","34","78",null,"","null"};
        System.out.println("str="+Arrays.toString(str));

        Integer[] int1 = {1,2,4,null,8};
        System.out.println("int1="+Arrays.toString(int1));
    }


}