import jdk.nashorn.internal.ir.WhileNode;

import  java.util.*;
import java.io.*;


public class RandCount
{
    private RandCount(){}
    public static void count()
    {
        int n=(int)(Math.random()*100)+1;//生成一个1-100的随机数
        System.out.println("请开始猜测随机数");
        Scanner c=new Scanner(System.in);
        int count = 1,x;
        x=c.nextInt();
        for(;count<=10;count++)
        {
            if(x>n) {
                System.out.println("该随机数小于输入！");
                System.out.println(x);
            }
            else if(x<n) {
                System.out.println("该随机数大于输入！");
                System.out.println(x);
            }
            else {
                System.out.println("Yes!");
                System.out.println(count);
                break;
            }
            System.out.println("输入的次数："+count);
            x=c.nextInt();
        }
        if(count>10)
            System.out.println("输入的次数大于10次，你输了！");
    }
}
public class Ccount
{
    public static void main(String[] args)
    {
        RandCount.count();
    }
}