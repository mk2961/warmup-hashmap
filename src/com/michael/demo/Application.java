package com.michael.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("enter a string");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        boolean run = true;

        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        while (run != false){

            if(hashMap.containsKey(x)){
                int temp = hashMap.get(x).intValue();
                hashMap.put(x,temp);
                System.out.println( "you have added string "+ temp +  "  times");
                temp++;

            }else{
                hashMap.put(x,0);


            System.out.println("Do you want to quit");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.nextLine();
            answer.equalsIgnoreCase(answer);
            if(answer == "yes"){
                run = false;
            }else{
                run = true;
            }
            }
            x = scanner.nextLine();
        }
    }
}
