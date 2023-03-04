package com.example.samsung0403_2;

// Класс для базы данных
// Делаем абстрактным, наследуемся от RoomDatabase

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)      // Надо написать, в Entities указываем классы, которые будут в БД
public abstract class TaskDB extends RoomDatabase {
    private static TaskDB instance;     // Здесь будет лежать единственный объект самого класса

    public abstract TaskDao taskDao();      // Для связи с запросами

    public synchronized static TaskDB getInstance(Context context) {    // synchronized - чтобы не было багов в многопотоке
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),    // контекст
                    TaskDB.class,
                    "task_database"                     // название базы данных
            ).build();
        }
        return instance;
    }
}

// Паттерн Singleton - может существовать только один объект этого класса
