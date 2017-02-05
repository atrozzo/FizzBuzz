package com.at.fizzbuzz.com.at.fizzbuzz.rules;

/**
 * Created by angelo on 14/11/2016.
 */
public class RuleLucky extends Rule {


    @Override
    public  void apply(int number) {

        if (String.valueOf(number).contains("3")){
            if (builder.length() > 0 ){
                int index = builder.indexOf("fizz");
                if (index >-1 ){
                    builder.replace(index,"fizz".length(),"lucky");
                }
            }
        }
    }
}
