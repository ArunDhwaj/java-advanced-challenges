package com.sbp.advanced.java.challenges.others;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OthersTest {

    public void test(){

        InputType inputType = new InputType();

        log.info(inputType.inputType("10e5.4"));

        log.info(inputType.inputType("2e10"));

        log.info(inputType.inputType("20.5"));

        log.info(inputType.inputType("AB"));

        log.info(inputType.inputType("1231456416541214651356151564651954156"));

        log.info(inputType.inputType("2000"));
    }
}
