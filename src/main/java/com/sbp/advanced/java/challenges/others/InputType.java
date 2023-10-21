package com.sbp.advanced.java.challenges.others;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.BigInteger;

@Slf4j
public class InputType {

    public String inputType(String str)
    {
        String inputType = "";

        //1. Integer Testing
        try {
            Integer.valueOf(str);
            inputType = "Integer";
        }
        catch (NumberFormatException e)
        {
            //log.info(e.toString());
        }

        if(inputType.equals("Integer"))
            return inputType;
        else
        {
            //2. Float Testing
            try {
                Float.parseFloat(str);
                inputType = "Float";
            }
            catch (NumberFormatException e)
            {
                //log.info(e.toString());
            }
        }

        if(inputType.equals("Float"))
            return inputType;
        else
        {
            //3. Double Testing
            try {
                Double.parseDouble(str);
                inputType = "Double";
            }
            catch (NumberFormatException e)
            {
                //log.info(e.toString());
            }
        }

        if(inputType.equals("Double"))
            return inputType;
        else
        {
            //4. Long Testing
            try {
                Long.parseLong(str);
                inputType = "Long";
            }
            catch (NumberFormatException e)
            {
                //log.info(e.toString());
            }
        }

        if(inputType.equals("Long"))
            return inputType;
        else
        {
            //5. BigInteger Testing
            try {
                new BigInteger(str);
                inputType = "BigInteger";
            }
            catch (NumberFormatException e)
            {
                //log.info(e.toString());
            }
        }

        if(inputType.equals("BigInteger"))
            return inputType;
        else
        {
            //6. BigDecimal Testing
            try {
                new BigDecimal(str);
                inputType = "BigDecimal";
            }
            catch (NumberFormatException e)
            {
                //log.info(e.toString());
            }
        }

        if(inputType.equals("BigDecimal"))
            return inputType;
        else
            return "String";
    }
}
