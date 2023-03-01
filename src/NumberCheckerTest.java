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
    List<Number> listOfNumbers;
    List<Number> listOfDistinctNumbers;
    List<Number> wrongList;
    List<Number> sortedList;
    List<Number> sortedAndDistinctList;

    //Set up stage, anything that goes to the tests is set up here to keep the code DRY
    @Before
    public void before(){
        numberChecker = new NumberChecker();
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