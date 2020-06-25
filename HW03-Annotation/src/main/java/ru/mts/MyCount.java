package ru.mts;

public class MyCount {
    private int count_plus;
    private int count_minus;
    private int count_all;


    public MyCount() {
        this.count_plus = 0;
        this.count_minus = 0;
        this.count_all = 0;
    }

    public void addCount_plus() {
        this.count_plus++;
    }

    public void addCount_minus() {
        this.count_minus++;
    }

    public void addCount_all() {
        this.count_all++;
    }

    public void printCounts() {
        System.out.println("count_plus= " + Integer.toString(count_plus) +
                ";  count_minus= " + Integer.toString(count_minus) +
                ";  count_all= " + Integer.toString(count_all));
    }

    public void setCount_all(int count_all) {
        this.count_all = count_all;
    }
}
