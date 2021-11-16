package com.tw.findingmangotree;

public class Trees {

        public String foundMango(int numberOfRows, int numberOfColumns, int treeNumber){
            int flag=0;
            for(int i=1;i<=numberOfRows;i++)
            {
                if(i==1)
                {
                    for(int j=1;j<=numberOfColumns;j++)
                    {
                        if(treeNumber==i*j) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if(i==numberOfRows) {
                    for (int j = 1; j <= numberOfColumns; j++) {
                        if (treeNumber == i * j || treeNumber == ((i * j)) + 1) {
                            flag = 1;
                            break;

                        }
                    }
                }
            }
            if(flag==1)
                return "yes";
            else
                return "No";
        }
}
