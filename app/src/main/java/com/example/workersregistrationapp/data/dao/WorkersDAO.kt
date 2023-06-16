package com.example.workersregistrationapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.workersregistrationapp.data.models.Workers

@Dao
interface WorkersDAO {

    @Insert
    suspend fun addNewWorker(worker: Workers) : Long

    @Update
    suspend fun editWorker(worker: Workers)

    @Delete
    fun deleteWorker(worker : Workers)

    @Query("DELETE FROM user")
    suspend fun deleteAll()

    @Query("SELECT * FROM user")
    fun getAllWorkers() : LiveData<List<Workers>>
}