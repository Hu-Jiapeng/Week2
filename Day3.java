import jdk.nashorn.internal.ir.WhileNode;

import  java.util.*;
import java.io.*;


public class RandCount
{
    private RandCount(){}
    public static void count()
    {
        int n=(int)(Math.random()*100)+1;//����һ��1-100�������
        System.out.println("�뿪ʼ�²������");
        Scanner c=new Scanner(System.in);
        int count = 1,x;
        x=c.nextInt();
        for(;count<=10;count++)
        {
            if(x>n) {
                System.out.println("�������С�����룡");
                System.out.println(x);
            }
            else if(x<n) {
                System.out.println("��������������룡");
                System.out.println(x);
            }
            else {
                System.out.println("Yes!");
                System.out.println(count);
                break;
            }
            System.out.println("����Ĵ�����"+count);
            x=c.nextInt();
        }
        if(count>10)
            System.out.println("����Ĵ�������10�Σ������ˣ�");
    }
}
public class Ccount
{
    public static void main(String[] args)
    {
        RandCount.count();
    }
}