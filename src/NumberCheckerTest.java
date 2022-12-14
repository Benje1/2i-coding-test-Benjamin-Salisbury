import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumberCheckerTest {

    //Three tests are supposed to fail, they are there for me to make sure that the tests aren't passing for any reason other then the function working as expected.


    //NumberChecker is not a static class, though it could be, so it is initialised
    NumberChecker numberChecker;
    //Other lists are initialised for the test
    List<Integer> listOfNumbers;
    List<Integer> listOfDistinctNumbers;
    List<Integer> wrongList;
    List<Integer> sortedList;
    List<Integer> sortedAndDistinctList;

    //Set up stage, anything that goes to the tests is set up here to keep the code DRY
    @Before
    public void before(){
        numberChecker = new NumberChecker();
        listOfNumbers = new ArrayList<>();
        listOfDistinctNumbers = new ArrayList<>();
        wrongList = new ArrayList<>();
        sortedList = new ArrayList<>();
        sortedAndDistinctList = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(12);
        listOfNumbers.add(7);
        listOfNumbers.add(24);
        listOfNumbers.add(3);
        listOfNumbers.add(65);
        listOfNumbers.add(12);
        listOfNumbers.add(65);
        listOfDistinctNumbers.add(1);
        listOfDistinctNumbers.add(3);
        listOfDistinctNumbers.add(12);
        listOfDistinctNumbers.add(7);
        listOfDistinctNumbers.add(24);
        listOfDistinctNumbers.add(65);
        wrongList.add(1);
        wrongList.add(1);
        wrongList.add(1);
        wrongList.add(1);
        sortedList.add(65);
        sortedList.add(65);
        sortedList.add(24);
        sortedList.add(12);
        sortedList.add(12);
        sortedList.add(7);
        sortedList.add(3);
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(1);
        sortedAndDistinctList.add(65);
        sortedAndDistinctList.add(24);
        sortedAndDistinctList.add(12);
        sortedAndDistinctList.add(7);
        sortedAndDistinctList.add(3);
        sortedAndDistinctList.add(1);
    }

    @Test
    public void areTheDistinctNumbersOut(){
        assertArrayEquals(listOfDistinctNumbers.toArray(), numberChecker.removeDuplicates(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotSame(){
        assertArrayEquals(wrongList.toArray(), numberChecker.removeDuplicates(listOfNumbers).toArray());
    }

    @Test
    public void isTheListSorted(){
        assertArrayEquals(sortedList.toArray(), numberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotOrdered(){
        assertArrayEquals(wrongList.toArray(), numberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

    @Test
    public void sortAndRemoveDuplicates(){
        assertArrayEquals(sortedAndDistinctList.toArray(), numberChecker.removeDuplicatesAndSortFromHighToLow(listOfNumbers).toArray());
    }

    //This following test is made to fail, checking that the function does not default to passing
    @Test
    public void failTestAsNotOrderedOrDistinct(){
        assertArrayEquals(wrongList.toArray(), numberChecker.sortNumbersFromHighToLow(listOfNumbers).toArray());
    }

}