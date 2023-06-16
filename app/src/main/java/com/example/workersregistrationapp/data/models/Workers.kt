package com.example.workersregistrationapp.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class Workers(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "workers_id")
    val workersID : Int,

    @ColumnInfo(name = "workers_name")
    val workersName : String,

    @ColumnInfo(name = "workers_unit")
    val workersUnit : String,

    @ColumnInfo(name = "workers_branch")
    val workersBranch : String,
)
