package com.tw.findingmangotree;

import java.util.Scanner;

public class DoraGarden {

    public static void main(String[] args) {

        Trees trees = new Trees();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter number of columns:");
        int numberOfColumns = scanner.nextInt();

        System.out.println("Enter tree number");
        int treeNumber = scanner.nextInt();

        System.out.println(trees.foundMangoTree(numberOfRows, numberOfColumns, treeNumber));
    }
}

