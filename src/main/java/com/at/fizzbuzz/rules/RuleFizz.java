package com.at.fizzbuzz.com.at.fizzbuzz.rules;

/**
 * Created by angelo on 10/11/2016.
 */
public class RuleFizz extends Rule {

 /*   public List<FizzBuzzKind> applyRule(int number) {
        List<FizzBuzzKind>  result = new ArrayList();
        if (number % 3 == 0 )
           result.add(FizzBuzzKind.FIZZ);

        return result;
    }*/

    @Override
    public void apply(int number) {
        if (number % 3 == 0 )
            builder.append("fizz");
    }




}
