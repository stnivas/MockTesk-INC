package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class FindMajority {

    public void majority(int[] number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int last = 0;
        for (int i = 0; i < number.length; i++) {
            if (map.containsKey(number[i])) {
                map.put(number[i], map.get(number[i]) + 1);
            } else {
                map.put(number[i], 1);
            }
        }
        String name="nibas, hari, vallur";
        String[] c=name.split(" ");
        System.out.println(Arrays.toString(c));
         String an=name.substring(1, name.length());
        System.out.println(an);

//
//             ) {
//        }
    }
       
          
    public static void main(String[] args) {
         FindMajority obj=new FindMajority();
         int[] number={1,2,3,3,3,3,4,4};
         obj.majority(number);
        //System.out.println(max);

    }
}
