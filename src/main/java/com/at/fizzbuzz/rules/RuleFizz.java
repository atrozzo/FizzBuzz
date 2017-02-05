package com.at.fizzbuzz.rules;

/**
 * Created by angelo on 10/11/2016.
 */
public class RuleFizz extends Rule {

    @Override
    public void apply(int number) {
        if (number % 3 == 0 )
            builder.append("fizz");
    }




}
