import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumberCheckerTest {


    NumberChecker numberChecker;
    List<Integer> listOfNumbers;
    List<Integer> listOfDistinctNumbers;
    List<Integer> wrongList;

    @Before
    public void before(){
        numberChecker = new NumberChecker();
        listOfNumbers = new ArrayList<>();
        listOfDistinctNumbers = new ArrayList<>();
        wrongList = new ArrayList<>();
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
    }

    @Test
    public void areTheDistinctNumbersOut(){
        assertArrayEquals(listOfDistinctNumbers.toArray(), numberChecker.removeDuplicates(listOfNumbers).toArray());
    }

    @Test
    public void failTestAsNotSame(){
        assertArrayEquals(wrongList.toArray(), numberChecker.removeDuplicates(listOfNumbers).toArray());
    }

}