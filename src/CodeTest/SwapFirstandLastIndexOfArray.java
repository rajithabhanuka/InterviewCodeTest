/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTest;

import java.util.Arrays;

/**
 *
 * @author bhanuka
 */
public class SwapFirstandLastIndexOfArray {

    public static void main(String[] args) {
        String[] myArray = {"1", "3", "7", "2", "9"};

        String x = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = x;
        
        System.out.println(Arrays.toString(myArray));

    }

}
