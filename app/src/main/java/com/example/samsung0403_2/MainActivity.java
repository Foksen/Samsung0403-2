package com.example.samsung0403_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskDB taskDB = TaskDB.getInstance(this);
        TaskDao taskDao = taskDB.taskDao();

        taskDao
                .addTask(new Task("Task one", "task description", false))
                .subscribeOn(Schedulers.io())
                .subscribe(() -> {});

        taskDao
                .getTask(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Task>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Task task) {
                        Log.d("MyLog", taskDao.getTask(0).toString());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

// ORM - Object-relational mapping, технология программирования, которая для преобразоывания наборов данных в объекты
// Room ORM - библиотека Java для этих целей
// Качать отсюда (setup): https://developer.android.com/training/data-storage/room
// Вставляем в gradle

// Alt+Insert - быстрое создание методов

// Также в dependencies надо вставить RxJava
// Для поддержки нужна также строчка из "optional - RxJava2 support for Room" по ссылке выше
