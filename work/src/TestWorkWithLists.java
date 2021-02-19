import java.util.*;
//сделал не функцию, а метод, думаю не страшно =)
public class TestWorkWithLists {

    protected static ArrayList<Integer[]> neededFunction(int n){
        ArrayList<Integer[]> arrayContainer = new ArrayList<Integer[]>();

        fillArrayContainer(arrayContainer, n);

        TestWork.lenControl.clear();
        return arrayContainer;
    }

    private static void fillArrayContainer(ArrayList<Integer[]> arrayContainer, int n){
        for (int i = 0; i < n; i++) {
            arrayContainer.add(TestWork.createRandomArray());
            if (i % 2 == 0)
                Arrays.sort(arrayContainer.get(i));
            else
                Arrays.sort(arrayContainer.get(i), Collections.reverseOrder());
        }
    }
}
