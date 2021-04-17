package com.thedai;

import java.util.Scanner;

/**
 * @author thedai
 * @date 2021/4/15 - 8:17
 */
public class honio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入你所要的转移的圆盘个数：");
        int n = scanner.nextInt();
        System.out.print("圆盘初始位置：");
        String one = scanner.next();
        System.out.print("中转站位置：");
        String two = scanner.next();
        System.out.print("目标位置：");
        String three = scanner.next();
        honioprint(n,one,two,three);
    }
    public static void honioprint(int n,String one,String two,String three){
        if(n==1)
            System.out.println(n+":"+one+"-->"+three);
        else{
            honioprint(n-1,one,three,two);
            System.out.println(n+":"+one+"-->"+three);
            honioprint(n-1,two,one,three);
        }
    }
}
