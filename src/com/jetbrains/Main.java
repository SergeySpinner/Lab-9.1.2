package com.jetbrains;

public class Main {

    public static void main(String[] args) {
        int x[] = new int[20];
        int y[] = new int[20];
        for(int i = 0; i < 20; i++)
        {
            x[i] = (int) (Math.random() * 11 + 11);
            y[i] = (int) (Math.random() * 41 - 20);
        }
        for(int i = 0; i < 20; i++)
            for(int j = 0; j < 19; j++)
                if(y[j] > y[j+1]) {
                    int temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }

        for(int i = 0; i < 20; i++)
            for(int j = 0; j < 19; j++)
                if(x[j] > x[j+1]) {
                    int temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }

        for(int i = 0; i < 20; i++)
            System.out.println("Point: " + x[i] + " " + y[i]);
    }
}
