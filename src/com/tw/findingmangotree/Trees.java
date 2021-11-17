package com.tw.findingmangotree;

public class Trees {

    public String foundMangoTree(int numberOfRows, int numberOfColumns, int treeNumber) {
        int flag = 0;
        for (int row = 1; row <= numberOfRows; row++) {
            if (row == 1) {
                for (int column = 1; column <= numberOfColumns; column++) {
                    if (treeNumber == row * column) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (row == numberOfRows) {
                for (int column = 1; column <= numberOfColumns; column++) {
                    if (treeNumber == row * column || treeNumber == ((row * column)) + 1) {
                        flag = 1;
                        break;

                    }
                }
            }
        }
        if (flag == 1)
            return "yes";
        else
            return "No";
    }
}
