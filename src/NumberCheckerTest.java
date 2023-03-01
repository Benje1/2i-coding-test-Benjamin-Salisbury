import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumberCheckerTest {

    //Three tests are supposed to fail, they are there for me to make sure that the tests aren't passing for any reason other then the function working as expected.

    //Other lists are initialised for the test
    List<Number> listOfNumbers;
    List<Number> listOfDistinctNumbers;
    List<Number> wrongList;
    List<Number> sortedList;
    List<Number> sortedAndDistinctList;
    List<Number> onlyDoubleList;
    List<Number> distinctDoubleOnlyLit;
    List<Number> sortedDoubleOnlyList;
    List<Number> distinctAndSortedDoubleOnlyList;
    List<Number> listWithDoublesAndDuplicates;
    List<Number> listWithoutDuplicates;
    List<Number> listWithSortedDoubles;
    List<Number> sortedAndDistinctDoubleList;

    //Set up stage, anything that goes to the tests is set up here to keep the code DRY
    @Before
    public void before(){
        listOfNumbers = new ArrayList<>(){
            {
                add(1);
                add(1);
                add(3);
                add(12);
                add(7);
                add(24);
                add(3);
                add(65);
                add(12);
                add(65);
            }
        };
        listOfDistinctNumbers = new ArrayList<>(){{
            add(1);
            add(3);
            add(12);
            add(7);
            add(24);
            add(65);
        }};
        wrongList = new ArrayList<>(){{
            add(1);
            add(1);
            add(1);
            add(1);
        }};
        sortedList = new ArrayList<>(){{
            add(65);
            add(65);
            add(24);
            add(12);
            add(12);
            add(7);
            add(3);
            add(3);
            add(1);
            add(1);
        }};
        sortedAndDistinctList = new ArrayList<>(){{
            add(65);
            add(24);
            add(12);
            add(7);
            add(3);
            add(1);
        }};
        listWithDoublesAndDuplicates = new ArrayList<>(){{
            add(3.6);
            add(3.6);
            add(3);
            add(2.5);
            add(5.2);
            add(10);
            add(10);
        }};
        listWithoutDuplicates = new ArrayList<>(){{
            add(3.6);
            add(3);
            add(2.5);
            add(5.2);
            add(10);
        }};
        listWithSortedDoubles = new ArrayList<>(){{
            add(10);
            add(10);
            add(5.2);
            add(3.6);
            add(3.6);
            add(3);
            add(2.5);
        }};
        sortedAndDistinctDoubleList = new ArrayList<>(){{
            add(10);
            add(5.2);
            add(3.6);
            add(3);
            add(2.5);
        }};
        onlyDoubleList = new ArrayList<>(){{
            add(3.5);
            add(1.4);
            add(9.4);
            add(10.0);
            add(3.5);
            add(3.6);
            add(8.4);
            add(8.4);
        }};
        distinctDoubleOnlyLit = new ArrayList<>(){{
            add(3.5);
            add(1.4);
            add(9.4);
            add(10.0);
            add(3.6);
            add(8.4);
        }};
        sortedDoubleOnlyList = new ArrayList<>(){{
            add(10.0);
            add(9.4);
            add(8.4);
            add(8.4);
            add(3.6);
            add(3.5);
            add(3.5);
            add(1.4);
        }};
        distinctAndSortedDoubleOnlyList = new ArrayList<>(){{
            add(10.0);
            add(9.4);
            add(8.4);
            add(3.6);
            add(3.5);
            add(1.4);
        }};
    }

    @Test
    public void areTheDistinctNumbersOut(){
        assertArrayEquals(listOfDistinctNumbers.toArray(), NumberChecker.removeDuplicates(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotSame(){
        assertArrayEquals(wrongList.toArray(), NumberChecker.removeDuplicates(listOfNumbers).toArray());
    }

    @Test
    public void isTheListSorted(){
        assertArrayEquals(sortedList.toArray(), NumberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotOrdered(){
        assertArrayEquals(wrongList.toArray(), NumberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

    @Test
    public void sortAndRemoveDuplicates(){
        assertArrayEquals(sortedAndDistinctList.toArray(), NumberChecker.removeDuplicatesAndSortFromHighToLow(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotOrderedOrDistinct(){
        assertArrayEquals(wrongList.toArray(), NumberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

    @Test
    public void doubleOnlyListRemoveDuplicates(){
        assertArrayEquals(distinctDoubleOnlyLit.toArray(), NumberChecker.removeDuplicates(onlyDoubleList).toArray());
    }

    @Test
    public void doubleOnlySortList(){
        assertArrayEquals(sortedDoubleOnlyList.toArray(), NumberChecker.sortNumbersFromHighToLow(onlyDoubleList).toArray());
    }

    @Test
    public void doubleOnlySortAndRemoveDuplicates(){
        assertArrayEquals(distinctAndSortedDoubleOnlyList.toArray(), NumberChecker.removeDuplicatesAndSortFromHighToLow(onlyDoubleList).toArray());
    }

    @Test
    public void removeDuplicatesFromDoubleList(){
        assertArrayEquals(listWithoutDuplicates.toArray(), NumberChecker.removeDuplicates(listWithDoublesAndDuplicates).toArray());
    }

    @Test
    public void sortDoublesInDescendingOrder(){
        assertArrayEquals(listWithSortedDoubles.toArray(), NumberChecker.sortNumbersFromHighToLow(listWithDoublesAndDuplicates).toArray());
    }

    @Test
    public void sortedAndDistinctListOfDoubles(){
        assertArrayEquals(sortedAndDistinctDoubleList.toArray(), NumberChecker.removeDuplicatesAndSortFromHighToLow(listWithDoublesAndDuplicates).toArray());
    }

}