package application;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);

    }

    public static void  copy(List<? extends Number> source,List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}