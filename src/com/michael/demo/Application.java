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
        while (run = true){

            if(hashMap.containsKey(x)){
                int temp = hashMap.get(x).intValue();
                hashMap.put(x,temp);
                System.out.println( "you have added string "+ temp +  "  times");

            }else{
                hashMap.put(x,1);
            }
            x = scanner.nextLine();

            System.out.println("Do you want to quit");
            Scanner scanner1 = new Scanner(System.in);
            String anwser = scanner1.nextLine();
            anwser.equalsIgnoreCase(anwser);
            if(anwser == "yes"){
                break;
            }else{
                run = true;
            }
        }
    }
}
