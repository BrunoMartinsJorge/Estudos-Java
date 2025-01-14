package Modulos.ArraysCollections.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_02 {

    public static void main(String[] args) {

        //Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Bruno");
        lista.add("João");
        lista.add("Carlos");
        lista.add("Arthur");

        for(String condidatos: lista){
            System.out.println(condidatos);
        }

        SortedSet<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(21);
        nums.add(12);
        nums.add(19);

        for(int num: nums){
            System.out.println(num);
        }
    }
}
