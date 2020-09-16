package co.nz.springBootDemo.dao;

import co.nz.springBootDemo.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface TodoDao {
    int inserttodoById(int id, ToDo Todo);

    int insertTodo(ToDo Todo);

    List<ToDo> selectAllTodo();

    Optional<ToDo> selectTodoById(int id);

    int deleteTodoById(int id);

    int updateTodoById(int id, ToDo Todo);
}
