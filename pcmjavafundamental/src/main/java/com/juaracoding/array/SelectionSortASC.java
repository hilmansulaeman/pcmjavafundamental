package com.juaracoding.array;

public class SelectionSortASC {
    public static void main(String[] args) {
        StringBuilder sBuild = new StringBuilder();
//        int val[] = {69,89,31,56,99};
        int val[] = {15,22,3,10,1,44};
        String bef = "";
        String aft = "";
        int initz = 0;
        int intContainer = 0;
        sBuild.setLength(0);
        System.out.println("\n==BEFORE==");
        for (int num:val)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));
        for(int i = 0 ; i < val.length ; i++)
        {
            initz = i;
            if(i!=val.length-1)
            {
                for (int j = i ; j < val.length ; j++)
                {
                    if(val[initz] > val[j])
                    {
                        initz = j;
                    }
                }
            }
            intContainer = val[i];
            val[i] = val[initz];
            val[initz] = intContainer;
        }
        sBuild.setLength(0);
        System.out.println("\n==AFTER==");
        for (int num:val)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

}
