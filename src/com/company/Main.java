package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        while(true) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите имя: " + list.add(scanner.nextLine()));
            }
            break;
        }

        while(true) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите имя: " + list1.add(scanner.nextLine()));
            }
            break;
        }

        ArrayList<String> A = new ArrayList<>();
        A.addAll(list);
        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();
        B.addAll(list1);
        System.out.println(B);

        ArrayList<String> C = new ArrayList<>();
        C.addAll(A);
        Collections.reverse(B);
        C.addAll(B);
        Collections.rotate(C.subList(1, 6), -1);
        Collections.rotate(C.subList(1, 7), -1);
        Collections.rotate(C.subList(1, 8), -1);
        Collections.rotate(C.subList(1, 9), -1);
        System.out.println(C);

        C.sort(Comparator.comparingInt(String::length));
        C.forEach(System.out::println);

    }
}
