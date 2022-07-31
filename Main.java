package practice;
import java.util.*;

public class Main {
    static final String numberCar = "К777КК77";
    static List<String> list = new ArrayList<>();
    static HashSet<String> hashSet = new HashSet<>();
    static TreeSet<String> treeSet = new TreeSet<>();
    public static void main(String[] args) {
        list = CoolNumbers.generateCoolNumbers();
        CoolNumbers.bruteForceSearchInList(list,numberCar);
        CoolNumbers.binarySearchInList(list,numberCar);
        CoolNumbers.searchInHashSet(hashSet,numberCar);
        CoolNumbers.searchInTreeSet(treeSet,numberCar);
    }
}
