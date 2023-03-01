import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberChecker {

    //Assumption one: all numbers are going to be whole numbers
    //Assumption two: all numbers are going to be Integers rather than int
    //Assumption three: it does not matter if the array is sorted first or second, --
    //-- but the duplicates are removed first so that the list is smaller therefore more efficient
    //Assumption four: there is no reason not to use the inbuilt functions of java


    //Using a stream and the java inbuilt function of distinct() the duplicate numbers are removed
    public List<Number> removeDuplicates(List<Number> listOfNumbers){
        List<Number> distinctNumbers = listOfNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        return distinctNumbers;
    }

    //Using the java inbuilt function of sort() and reverse order the list is sorted to the desired descending order
    public List<Number> sortNumbersFromHighToLow(List<Number> listOfNumbers){
        Collections.sort(listOfNumbers, Collections.reverseOrder());
        return listOfNumbers;
    }

    //Function that uses the other two functions above, reducing the amount of code the man function has, working on the solid principals. i.e. separation of concerns
    //Also, if a list only needs to be made distinct or sorted then one of the other two function may be called
    public List<Number> removeDuplicatesAndSortFromHighToLow(List<Number> listOfNumbers){
        List<Number> distinctList = new ArrayList<>( removeDuplicates(listOfNumbers));
        List<Number> sortedList = new ArrayList<>(sortNumbersFromHighToLow(distinctList));
        return sortedList;
    }
}
