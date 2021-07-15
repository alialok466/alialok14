package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] numbers ={ 2.4, 2.3, 7.3, -2.4, 4.9, 1.3, -1.9, 3.4, -2.3, 9.3, 1.2, 1.22, -1.23, 3.43, 9.96};
        double col =0.0;
        int s = 0;
        boolean m = false;

        for (double sum : numbers) {
            if (sum < 0) {
                m = true;
            } else if (m) {
                col = col + sum;
                s++;
            }
        }

        double id = col / s;
        System.out.println(id);




        int[] numberss = new int[]{8, -73, 290, -39, 20, 39, 18, -31};
        boolean sort = false;
        while (!sort){
            sort = true;
            for (int i = 1; i< numberss.length; i++) {
                if (numberss[i] < numberss[i - 1]) {
                    int w = numberss[i];
                    numberss[i] = numberss[i - 1];
                    numberss[i - 1] = w;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(numberss));
        }
    }
}

