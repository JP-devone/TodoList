package com.example.todolist.domain

data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean
)

//Fake Objects
val todo1 = Todo(
    id = 1,
    title = "Todo1",
    description = "Description for todo1",
    isCompleted = false,
)
val todo2 = Todo(
    id = 1,
    title = "Todo2",
    description = "Description for todo2",
    isCompleted = true,
)
val todo3 = Todo(
    id = 1,
    title = "Todo3",
    description = "Description for todo3",
    isCompleted = false,
)


