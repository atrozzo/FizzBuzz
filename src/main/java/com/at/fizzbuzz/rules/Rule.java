package com.at.fizzbuzz.rules;

/**
 * Created by angelo on 14/11/2016.
 */
public abstract class Rule {

    StringBuilder builder = null;

    public abstract void apply(int number);

    public Rule addBuilder(StringBuilder resultBuilder){
        builder = resultBuilder;
        return this;
    }
}

