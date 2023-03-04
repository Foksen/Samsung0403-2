package com.example.samsung0403_2;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import io.reactivex.Completable;
import io.reactivex.Observable;

@Dao
public interface TaskDao {      // Dao - Data access object
    // INSERT task INTO task_table
    @Insert
    Completable addTask(Task task);        // Room сама напишет запрос

    @Query("SELECT * FROM task_table WHERE id = :id")
    Observable<Task> getTask(int id);

    @Query("DELETE FROM task_table WHERE id = :id")      // для запроса нужна аннотация @Query, для вставки переменных используем :
    void removeTask(int id);                             // для delete достаточно id, остальное не нужно

    @Update
    void updateTask(Task task);
}
