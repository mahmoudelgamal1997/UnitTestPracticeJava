package com.example.unittestpracticejava.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.example.unittestpracticejava.util.DateUtil.GET_MONTH_ERROR;
import static com.example.unittestpracticejava.util.DateUtil.getMonthFromNumber;
import static com.example.unittestpracticejava.util.DateUtil.monthNumbers;
import static com.example.unittestpracticejava.util.DateUtil.months;

public class DateUtilTest {
    public static final String Today="03-2020";

    @Test
    public void getDateTesting(){
        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                Assertions.assertEquals(Today ,DateUtil.getCurrentTimeStamp() );
                System.out.println("date is identical");
            }
        });
    }


    @ParameterizedTest
    @ValueSource(ints ={0,1,2,3,4,5,6,7,8,9,10,11})
    public void getMonthTest_return_true(int monthNumber, TestInfo testInfo, TestReporter reporter){
        Assertions.assertEquals(months[monthNumber],getMonthFromNumber(DateUtil.monthNumbers[monthNumber]));
        System.out.println(""+monthNumbers[monthNumber]+" : "+months[monthNumber]);
    }

    @ParameterizedTest
    @ValueSource(ints ={0,1,2,3,4,5,6,7,8,9,10,11})
    public void getMonthTest_return_error(int monthNumber, TestInfo testInfo, TestReporter reporter){
        Assertions.assertEquals(getMonthFromNumber(String.valueOf(30)) , GET_MONTH_ERROR);
        System.out.println(GET_MONTH_ERROR);
    }

}
