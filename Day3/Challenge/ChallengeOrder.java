package com.Jeet.Day3.Challenge;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ChallengeOrder {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of customers");
        int customers = sc.nextInt();
        int avg = 0, sum = 0;

        List<Pair<Integer,Integer>> list = new ArrayList<>();

        for (int i = 0; i < customers; i++)
            list.add(new Pair<>(sc.nextInt(), sc.nextInt()));

        list.sort(Comparator.comparingInt(Pair::getValue));

        for (Pair<Integer,Integer> pair: list) {
            sum += pair.getValue();
            avg += sum - pair.getKey();
        }

        System.out.println(avg/customers);
    }
}
