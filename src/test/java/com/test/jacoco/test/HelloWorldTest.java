package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;
/**
 * Created by superZh on 2019/10/1.
 */

import com.ExcelUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import com.test.jacoco.HelloWorld;

import java.io.IOException;
import java.util.List;

public class HelloWorldTest {

    String ExcelPath = System.getProperty("user.dir")+"\\src\\test\\java\\com\\test\\jacoco\\test\\data\\WhiteBoxTest1.xlsx";

    List data = ExcelUtils.readExcel(ExcelPath,0);

    public HelloWorldTest() throws IOException, InvalidFormatException {
    }


    @Before
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
}
