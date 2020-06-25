package ru.mts;

public class Starter {
    public static void main(String[] args) throws Exception {
        System.out.println("Start tests");
        try {
            String nameClass = "ru.mts.TestClass";
            MyCount myCount = (MyCount) new MyMethods(nameClass).startFw();
            myCount.printCounts();
        } catch (Exception e) {
            System.out.println("Exception " + e);
            System.out.println("Test failure!");
        } finally {
            System.out.println("Tests finished");
        }
    }
}
