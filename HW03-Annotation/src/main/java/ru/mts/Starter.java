package ru.mts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Starter {
    public static void main(String[] args) throws Exception {
        MyCount myCountMain = new MyCount();
        MyMethods myMethods =new MyMethods();
        try {
            myMethods.methodTest(myCountMain);
            myMethods.method2Test(myCountMain);
            myMethods.method3Test(myCountMain);
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception NullPointerException: " + e);
            myCountMain.addCount_minus();
            myCountMain.addCount_all();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
            myCountMain.addCount_minus();
            myCountMain.addCount_all();
        }
        finally {
            myCountMain.printCounts();
        }
        //TestClass testClass1 = new TestClass("");

    }
}
