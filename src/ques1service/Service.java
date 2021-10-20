package ques1service;
import java.util.Scanner;

public class Service

{
    public int elements;
    public int[] arr1;
    Scanner sc = new Scanner(System.in);

    public void implementation()
    {
        System.out.println("Enter the total no of floors in building");
        elements = sc.nextInt();
        arr1 = new int[elements];
        for (int i = 0; i < elements ; i++)
        {
            System.out.println("Enter the floor size given on day : " + (i+1) );
            arr1[i] = sc.nextInt();
        }
    }

    int order(int[] a,int start,int end)
    {
        int pivot=a[end];
        int i=(start-1);

        for (int j=start;j<=end;j++)
        {
            if (a[j]>pivot)
            {
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[i+1];
        a[i+1]=a[end];
        a[end]=t;
        return(i+1);
    }

    public void quick(int[] a ,int start, int end)
    {
        if (start<end)
        {
            int p=order(a,start,end);
            quick(a,start,p-1);
            quick(a,p+1,end);
        }
    }
    public void test(int[] a)
    {
        System.out.println();
        System.out.println("The order of construction is as follows");
        int n=0;

        while (n < a.length)
        {
            System.out.println("Day: "+(n+1));

            if (a[n]>a[n+1])
            {
                for (int i=0;i<a.length;i++) {

                    quick(a, 0, a.length - 1);
                    System.out.println(a[i]);
                }
            }
            if (a[n] < a[n+1])
            {
                System.out.println(  );
            }
            n++;
        }
    }
}



