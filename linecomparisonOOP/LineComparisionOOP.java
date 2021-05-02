package com.company;
import java.util.Scanner;
public class LineComparisionOOP
{
    public static void main(String []args)
    {   
        System.out.println("Welcome to linecomparisionOOP program");
	 forlinefunctionsoop obj1 = new forlinefunctionsoop();
         obj1.functionforlines();
	 obj1.functioncheckequallines();
	 obj1.functioncompare();
}
class forlinefunctionsoop
{
    double length1;
    double length2;
    String line1;
    String line2;
    public void functionforlines()
    {
        double x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cordinates for first line");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
         length1 = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println(length1);

        System.out.println("enter the cordinates for second line");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
         length2 = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println(length2);

    }
	public void functioncheckequallines()
    {
        // uc-2 this equals method gives true false value
         line1 = String.valueOf(length1);
         line2 = String.valueOf(length2);
         System.out.println(line1.equals(line2));
    }
	public void functioncompare()
    {
        int comparsion = line1.compareTo(line2);
        System.out.println("comparsion of line1 and line2" + "   " + comparsion);
        if(comparsion==0)
        {
            System.out.println("line1 and line2 are equals");
        }
        else if (comparsion<0)
        {
            System.out.println("line1 is less than line2 basis on length");
        }
        else
        {
            System.out.println("line1 is greater than line2 basis on length");
        }

    }
