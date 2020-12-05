package com.test.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count(0);
    }

    void count(int number) {
        int varriableNumber = 1;
        int i = 0;
        if (number >= 0) {
            while (varriableNumber < number) {
                if ((number % varriableNumber) == 0) i++;
                varriableNumber++;


            }
        } else {
            while (varriableNumber > number) {
                if ((number % varriableNumber) == 0) i++;
                varriableNumber--;
            }
        }

        if (i > 2) {
            System.out.println(number + " это составное число");
        } else if ((1 <= i) && (i <= 2)) {
            System.out.println(number + " это простое число");
        } else if (i == 0){
            System.out.println(number + " не является ни простым, ни составным числом");
        }

    }
}