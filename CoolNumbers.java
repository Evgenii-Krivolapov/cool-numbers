package practice;

import java.util.*;

public class CoolNumbers {
    static List<String> symbolList = new ArrayList<>() {{
        add("А");
        add("В");
        add("Е");
        add("К");
        add("М");
        add("Н");
        add("О");
        add("Р");
        add("С");
        add("Т");
        add("У");
        add("Х");
    }};
    static final int MIN_REGION = 1;
    static final int MAX_REGION = 199;
    static String symbol = "";
    static String result = "";

    public static List<String> generateCoolNumbers() {
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 1; i <= 2_000_000L; i++) {
            int firstSymbol = (int) (Math.random() * symbolList.size());
            symbol = symbolList.get(firstSymbol);

             int number1 = ((int) (Math.random() * 10));
             int number2 = ((int) (Math.random() * 10));
             int number3 = ((int) (Math.random() * 10));
             String numberToString1  = Integer.toString(number1);
             String numberToString2 = Integer.toString(number2);
             String numberToString3  = Integer.toString(number3);

            int region = (int) ((Math.random() * (MAX_REGION - MIN_REGION)) + MIN_REGION);
            result = symbol + numberToString1 + numberToString2 + numberToString3 + symbol + symbol + region;
            resultList.add(result);
        }
        return resultList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long start = System.nanoTime();
        if (list.contains(number)) {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск перебором: номер найден, поиск занял " + time + " нс");
            return true;
        } else {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск перебором: номер не найден, поиск занял " + time + " нс");
            return false;
        }
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        long start = System.nanoTime();
        int find = Collections.binarySearch(sortedList, number);
        long end = System.nanoTime();
        String time = Long.toString(end - start);
        if (find > -1) {
            System.out.println("Бинарный поиск: номер найден, поиск занял " + time + " нс");
            return true;
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял " + time + " нс");
            return false;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long start = System.nanoTime();
        if (hashSet.contains(number)) {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск HashSet: номер найден, поиск занял " + time + " нс");
            return true;
        } else {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск HashSet: номер не найден, поиск занял " + time + " нс");
            return false;
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long start = System.nanoTime();
        if (treeSet.contains(number)) {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск TreeSet: номер найден, поиск занял " + time + " нс");
            return true;
        } else {
            long end = System.nanoTime();
            String time = Long.toString(end - start);
            System.out.println("Поиск TreeSet: номер не найден, поиск занял " + time + " нс");
            return false;
        }
    }
}