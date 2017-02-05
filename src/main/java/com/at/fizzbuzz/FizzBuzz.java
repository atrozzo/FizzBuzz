package com.at.fizzbuzz;

import com.at.fizzbuzz.rules.RuleBuzz;
import com.at.fizzbuzz.rules.RuleFizz;
import com.at.fizzbuzz.rules.RuleLucky;
import com.at.fizzbuzz.rules.RuleNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by angelo on 14/11/2016.
 */
public class FizzBuzz {


        private final Pattern numberPattern = Pattern.compile("\\d");
        private final RulesService rulesService;
        private final List<String> results = new ArrayList<>();

        public FizzBuzz() {
            this.rulesService = new RulesService();
            rulesService.addRule(new RuleFizz());
            rulesService.addRule(new RuleBuzz());
            rulesService.addRule(new RuleLucky());
            rulesService.addRule(new RuleNumbers());

        }

        public String of(int number){
            String result = String.valueOf(rulesService.getAppliedRulesResult(number));
            results.add(result);
            return result;
        }

    public long getStringOccurences(String str){
        return  results.stream().filter(p-> p.equals(str)).count();
    }

    public long getNumberOccurrences(){
        return results.stream().filter(numberPattern.asPredicate()).count();
    }



    public void  printReport(){
        System.out.println("fizz:" +     getStringOccurences("fizz"));
        System.out.println("buzz:" +     getStringOccurences("buzz"));
        System.out.println("fizzbuzz:" + getStringOccurences("fizzbuzz"));
        System.out.println("numbers:"  + getNumberOccurrences());



    }


}
