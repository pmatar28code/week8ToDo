package com.example.todo.networking

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ToDoApi {

    @GET("/")
    fun getToDoItems(): retrofit2.Call<Items>

    @POST("/add")
    fun addToDoItem(@Body item:Item) : retrofit2.Call<Items>


}