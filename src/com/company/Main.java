package com.company;

public class Main {

    public static void main(String[] args) {

//Объявление и запись рандомного массива
        int n = 10;
        int min = 1000;
        int max = -1;
        int avg = 0;
        int k = 0;
        int swap=0;
        int[] array = new int[n];
        for (int i = 0; i< array.length;i++) {
            array[i] = (int)(Math.random()*(200+1)-100);
        }
//поиск мин макс и среднего
        for (int i = 0; i< array.length;i++){
            min = Math.min(min,array[i]);
            max = Math.max(max,array[i]);
            avg += (int)(array[i] / array.length);
        }
        //сортировка пузырьком
        for (int i=0; i< array.length-1; i++){
            for (int j=0; j<array.length-i-1; j++){
             if (array[j]>array[j+1]) {
             swap = array[j];
             array[j]=array[j+1];
             array[j+1]=swap; }
            }
            }
      //  }
//Вывод массива
        for (int i=0; i< array.length;i++){
            System.out.print(array[i]+" ");
            k++;
        }
//вывод
        System.out.println(" ");
        System.out.println("min= "+min);
        System.out.println("max= "+max);
        System.out.println("avg= "+avg);
        System.out.println("chisel= "+k);

    }

}