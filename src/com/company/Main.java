package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while (true) {
            int n = in.nextInt();
            if (n<=0){
                break;
            }
            int price = in.nextInt();

            int take_away = in.nextInt();
            if (take_away==1) {
                System.out.printf("%d", (n * price) + 10);
                sum=sum+((n*price)+10);
            }
            else if (take_away==0) {
                System.out.printf("%d", n * price);
                sum=sum+(n*price);
            }

        }
        System.out.println(sum);
    }

}
