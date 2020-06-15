package ru.mts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Starter {
    public static void main(String[] args) throws Exception {
        MyCount myCountMain = new MyCount();
        try {
            methodTest(myCountMain);
            method2Test(myCountMain);
            method3Test(myCountMain);
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
    private static void methodTest(MyCount myCount) throws NoSuchMethodException {
        Class<TestClass> clazz = TestClass.class;
        Method before = clazz.getMethod("toStringBefore");
        Annotation[] beforeAnn = before.getDeclaredAnnotations();
        System.out.println("Method toStringBefore with annotation " + Arrays.toString(beforeAnn));
        Method method = clazz.getMethod("toString");
        Annotation[] annotations = method.getDeclaredAnnotations();
        System.out.println("Method toString with annotation " + Arrays.toString(annotations));
        Method after = clazz.getMethod("toStringAfter");
        Annotation[] afterAnn = after.getDeclaredAnnotations();
        System.out.println("Method toStringAfter with annotation " + Arrays.toString(afterAnn));
        myCount.addCount_plus();
        myCount.addCount_all();
    }
    private static void method2Test(MyCount myCount) throws Exception {
        TestClass testClass = new TestClass("Run TestClass");
        System.out.println(testClass.toStringBefore());
        System.out.println(testClass.toString());
        System.out.println(testClass.toStringAfter());
        myCount.addCount_plus();
        myCount.addCount_all();
    }
    private static void method3Test(MyCount myCount){
        String name="";
        TestClass testExc = new TestClass();
        testExc.setValue(name);
        myCount.addCount_plus();
        myCount.addCount_all();
    }
}
