package com.sofiqul54.evidence;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ranom10UniqeNumber {
    public static void main(String[] args) {
        Random rand = new Random(100);
        Set<Integer>unique = new HashSet();
        
        for (int i = 1 ; i < 10; i++) {
            int num = rand.nextInt(90)+10;
            unique.add(num);
        }
        for (int i : unique) {
            System.out.println(i+" ");
        }
    }
}
