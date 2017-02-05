package com.at.fizzbuzz.rules;

/**
 * Created by angelo on 10/11/2016.
 */
public class RuleBuzz extends Rule {

    @Override
    public void apply(int number) {
        if (number % 5 == 0 )
            builder.append("buzz");
    }
}
