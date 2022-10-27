import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberChecker {

    //Assumption one: all numbers are going to be whole numbers
    //Assumption two: all numbers are going to be Integers rather then int
    //assumption three: it does not matter if the array is sorted first or second


    //Using a stream and the java inbuilt function of distinct() the duplicate numbers are removed
    public List<Integer> removeDuplicates(List<Integer> listOfNumbers){
        List<Integer> distinctNumbers = listOfNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        return distinctNumbers;
    }

    //Using the java inbuilt function of sort() and reverse order the list is sorted
    public List<Integer> sortNumbersFromHighToLow(List<Integer> listOfNumbers){
        listOfNumbers.sort(Comparator.reverseOrder());
        return listOfNumbers;
    }

    //Function that uses the other two functions above, reducing the amount of code the man function has, working on the solid principal
    //Also, if a list only needs to be made distinct or sorted then one of the other two function may be called
    public List<Integer> removeDuplicatesAndSortFromHighToLow(List<Integer> listOfNumbers){
        removeDuplicates(listOfNumbers);
        sortNumbersFromHighToLow(listOfNumbers);
        return listOfNumbers;
    }
}
