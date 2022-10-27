import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberChecker {

    //Assumption one: all numbers are going to be whole numbers
    //Assumption two: all numbers are going to be Integers rather then int
    //assumption three: it does not matter if the array is sorted first or second


    //Using a stream and the java inbuilt function of distinct the duplicate numbers are removed
    public List<Integer> removeDuplicates(List<Integer> listOfNumbers){
        List<Integer> distinctNumbers = listOfNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        return distinctNumbers;
    }

    //Using a loop the numbers are sorted from high to low
    public List<Integer> sortNumbersFromHighToLow(List<Integer> listOfNumbers){
        List<Integer> copyList = new ArrayList<>(listOfNumbers);
        copyList.sort(Comparator.reverseOrder());
        return copyList;
    }
}
