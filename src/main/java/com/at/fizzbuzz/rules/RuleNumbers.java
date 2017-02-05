package com.at.fizzbuzz.com.at.fizzbuzz.rules;

/**
 * Created by angelo on 14/11/2016.
 *
 * This Rule will care of produce number results.
 *
 */
public class RuleNumbers extends Rule {


    @Override
    public void apply(int number) {

        if (builder.length() ==0)
            builder.append(String.valueOf(number));
    }
}
