package ques1main;
import ques1service.Service;

public class Main
{
    public static void main(String[] args)
    {
        Service service = new Service();
        service.implementation();
        System.out.println();
        service.test(service.arr1);

    }
}


