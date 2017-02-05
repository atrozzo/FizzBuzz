package com.at.fizzbuzz;

import com.at.fizzbuzz.rules.Rule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by angelo on 10/11/2016.
 */
public class RulesService {

    private final List<Rule> rules;
    public RulesService() {
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule){
        rules.add(rule);
    }

    /**
     * This method apply the rule strategy to each number
     *
     * @param number is the current number to analyse.
     * @return a String value produced by the rule.
     */
    public String getAppliedRulesResult(int number){
        StringBuilder resultBuilder = new StringBuilder();
        for (Rule rule : rules){
               rule.addBuilder(resultBuilder).apply(number);
        }
       return resultBuilder.toString();

    }






}
