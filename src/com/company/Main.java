package com.company;

public class Main {

    public static void main(String[] args) {

//Объявление и запись рандомного массива
        int n = 50;
        int min = 1000;
        int max = -1;
        double avg = 0;
        int[] array = new int[n];
        for (int i = 1; i< array.length;i++) {
            array[i] = (int)(Math.random()*(200+1))-100;
        }
//поиск мин макс и среднего
        for (int i = 1; i< array.length;i++){
            min = Math.min(min,array[i]);
            max = Math.max(max,array[i]);
            avg += array[i] / array.length;
        }
//Вывод массива
        for (int i=1; i< array.length;i++){
            System.out.print(array[i]+" ");

        }
//вывод
        System.out.println(" ");
        System.out.println("min= "+min);
        System.out.println("max= "+max);
        System.out.println("avg= "+avg);
        System.out.println("playwithgit");
        System.out.println("ANDREYEASYKATKA");

    }

}