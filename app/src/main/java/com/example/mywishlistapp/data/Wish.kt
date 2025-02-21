package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long =0L,
    @ColumnInfo(name = "wish-title")
    val title: String="",
    @ColumnInfo(name = "wish-description")
    val description: String=""
)

object DummyWish{
    val wishList = listOf(
        Wish(title="google watch 2 ",
            description = "an android watch"),
        Wish(title = "oculus quest 2",
            description = "a VR headset for the future")
    )

}
