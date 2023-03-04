package com.example.samsung0403_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// ORM - Object-relational mapping, технология программирования, которая для преобразоывания наборов данных в объекты
// Room ORM - библиотека Java для этих целей
// Качать отсюда (setup): https://developer.android.com/training/data-storage/room
// Вставляем в gradle

// Alt+Insert - быстрое создание методов
