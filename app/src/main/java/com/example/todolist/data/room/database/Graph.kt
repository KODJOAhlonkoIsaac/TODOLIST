package com.example.todolist.data.room.database

import android.content.Context
import com.app.todolist.data.room.database.TodoListDatabase
import com.example.todolist.data.room.repository.OTPCodeRepository
import com.example.todolist.data.room.repository.UserRepository

object Graph {

    private lateinit var todoListDatabase: TodoListDatabase
        private set

    val userRepository by lazy {
        UserRepository(
            userDao = todoListDatabase.userDao()
        )
    }

    val otpCodeRepository by lazy {
        OTPCodeRepository(
            otpCodeDao = todoListDatabase.otpCodeDao()
        )
    }

    fun provide(context: Context) {

        todoListDatabase = TodoListDatabase.getDatabase(context = context)
    }
}