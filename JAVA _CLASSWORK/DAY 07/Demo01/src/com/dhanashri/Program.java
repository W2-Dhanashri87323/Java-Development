package com.dhanashri;

public class Program {
    public static void main(String[] args) {
        try {
            Time t1 = new Time(12, 12, 1000);
            t1.display();
        } catch (CustomException e) {
            e.displayError();

        }

    }
}
