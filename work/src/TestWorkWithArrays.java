import java.util.*;

public class TestWorkWithArrays {
    protected static Integer[][] neededFunction(int n){
        Integer[][] array = new Integer[n][];

        fillArray(array, n);

        TestWork.lenControl.clear();
        return array;
    }

    private static void fillArray(Integer[][] array, int n){
        for (int i = 0; i < n; i++) {
            array[i] = TestWork.createRandomArray();
            if(i % 2 == 0)
                Arrays.sort(array[i]);
            else
                Arrays.sort(array[i], Collections.reverseOrder());
        }
    }

}
