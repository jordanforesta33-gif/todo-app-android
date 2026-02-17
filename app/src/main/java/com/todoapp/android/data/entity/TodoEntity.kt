package com.todoapp.android.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "todos")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val isCompleted: Boolean = false,
    val priority: String = "MEDIUM",
    val dueDate: Long? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val completedAt: Long? = null,
    val tags: String = "",
    val category: String = "General",
    val isRecurring: Boolean = false,
    val recurringPattern: String? = null,
    val notificationEnabled: Boolean = true,
    val notificationTime: Long = 0
)

enum class Priority {
    LOW, MEDIUM, HIGH
}

enum class RecurringPattern {
    DAILY, WEEKLY, MONTHLY
}

enum class TaskCategory {
    PERSONAL, WORK, SHOPPING, HEALTH, FINANCE, OTHER
}