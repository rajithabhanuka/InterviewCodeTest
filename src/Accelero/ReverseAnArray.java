/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accelero;

import java.util.Arrays;

/**
 *
 * @author bhanuka
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 7, 8};
      
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }

        System.out.println("Reverse pattern is " + Arrays.toString(myArray));
    }
}
