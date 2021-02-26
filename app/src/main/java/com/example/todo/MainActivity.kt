package com.example.todo

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo.databinding.ActivityMainBinding
import com.example.todo.recyclerview.ToDoListAdapter

class MainActivity : AppCompatActivity() {
    val toDoListAdapter = ToDoListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.todoItems.apply {
            adapter = toDoListAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }
}