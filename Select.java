package com.company;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] number={1,3,51,2,3,2,3};
int temp=0;
        for (int i = 0; i < number.length-1; i++) {
            int index=i;
            for (int j = i+1; j < number.length; j++) {
                if(number[j]<number[index]) {
                    index = j;
                }
            }
            temp=number[index];
            number[index]=number[i];
            number[i]=temp;

        }
        System.out.println(Arrays.toString(number));
    }
}
