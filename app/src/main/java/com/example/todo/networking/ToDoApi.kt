package com.example.todo.networking

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.Call
interface ToDoApi {

    @GET("/")
    fun getToDoItems(): Call<Items>

    @POST("/add")
    fun addToDoItem(@Body item:Item) : Call<Items>


}