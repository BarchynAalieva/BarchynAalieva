package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println(getInfo(getAge(), getTemp()));

        }


    }
    public static String getInfo(int age, int temp){
        String poz = "Можно идти гулять";
        String neg = "Оставайтесь дома";
        if(age > 20 && age <45 && temp >-20 && temp <30){
            return poz;


        }

        else if(age <20 && temp >0 && temp <28){
            return poz;

        }
        else if(age >45 && temp >-10 && temp < 25){
            return poz;

        }
        else {
            return neg;

        }

    }
    public static int getAge(){
        Random random = new Random();
        int Age = random.nextInt(99) + 1;
        System.out.println(Age);
        return Age;




    }
    public static int getTemp(){
        Random random = new Random();
        int Temp = random.nextInt(50) -50;
        System.out.println(Temp);
        return Temp;
    }
}

