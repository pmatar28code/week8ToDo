package com.example.todo.networking

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/*
{
"items" : [
    {
    "item : "take out trash",
      "priority" : 0
    },
    {
    "item" : "study programming",
    "priority" : 0
    },
    {
    "item" : "Clean the house",
    "priority" : 2
    }
  ]
}
 */

@JsonClass(generateAdapter = true)
data class Items (
    @Json(name = "items") val items : List<Item>
)
@JsonClass(generateAdapter = true)
data class Item(
        @Json(name = "item") val item : String,
        @Json(name = "priority") val priority : Int
)