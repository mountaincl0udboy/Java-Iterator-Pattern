package kz.narxoz.patterns.iterator.threeiterators;

import java.util.Scanner;
public class CountPositive {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int Size, i = 0, j = 0;
        int positiveCount = 0, negativeCount = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        while (i < Size)
        {
            a[i] = sc.nextInt();
            i++;
        }

        while (j < Size)
        {
            if(a[j] >= 0)
            {
                positiveCount++;
            }
            j++;
        }
        System.out.println("\n Total Number of Positive Numbers in this Array = " + positiveCount);
    }
}