package com.at.fizzbuzz.rules;

import com.at.fizzbuzz.FizzBuzz;

/**
 * Created by angelo on 14/11/2016.
 */
public class FizzBuzzClient {

    public static  void main ( String ...arg){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i =0;i< 20; i++){
            fizzBuzz.of(i);
        }
        fizzBuzz.printReport();
    }

}
