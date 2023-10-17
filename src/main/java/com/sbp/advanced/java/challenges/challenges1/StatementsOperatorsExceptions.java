package com.sbp.advanced.java.challenges.challenges1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatementsOperatorsExceptions {

    public void statementsOperatorsExceptions(){
        challenge1();

    }

    private void challenge1() {
        log.info( "" +  check(50));
        log.info( "" +  check(51));
    }
    /*
    Ch-1: What type does the below method return at runtime?
    Ans: It return Boolean.
     */
    private Object check(int x) {
        int y = 50;
        return x == y;
    }

}
