package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        A250217 a = new A250217();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        a.generatePermutations(n);

    }
}
