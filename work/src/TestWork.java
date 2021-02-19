import java.util.*;

public class TestWork {
    protected static final long BITS32 = 4294967296L;
    protected static final long BITS16 = 2147483648L;
    protected static ArrayList<Integer> lenControl = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        TestWorkWithLists.neededFunction(n);
        TestWorkWithArrays.neededFunction(n);
    }

    protected static int getRandomInt(){
        return (int)((Math.random() * TestWork.BITS32) + Integer.MIN_VALUE);
    }
    protected static int getRandomPositiveInt(){
        return (int)((Math.random() * TestWork.BITS16));
    }

    protected static Integer[] createRandomArray(){
        int arrLen = getRandomPositiveInt();
        while (lenControl.contains(arrLen)) {
            arrLen = getRandomPositiveInt();
        }
        lenControl.add(arrLen);

        Integer[] array = new Integer[arrLen];

        for (int i = 0; i < arrLen; i++) {
            array[i] = TestWork.getRandomInt();
        }

        return array;
    }
}
