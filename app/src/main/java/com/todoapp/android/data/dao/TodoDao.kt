import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import com.todoapp.android.data.model.Todo

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Update
    suspend fun updateTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo_table ORDER BY id DESC")
    suspend fun getAllTodos(): List<Todo>

    @Query("SELECT * FROM todo_table WHERE id = :todoId")
    suspend fun getTodoById(todoId: Int): Todo?
}