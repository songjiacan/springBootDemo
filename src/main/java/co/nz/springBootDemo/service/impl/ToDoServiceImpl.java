package co.nz.springBootDemo.service.impl;

import co.nz.springBootDemo.mapper.ToDoMapper;
import co.nz.springBootDemo.model.ToDoExample;
import co.nz.springBootDemo.model.ToDo;
import co.nz.springBootDemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements TodoService {

    @Autowired
    private ToDoMapper todoMapper;


    @Override
    public int addTodo(ToDo todo) {
        return todoMapper.insert(todo);
    }

    @Override
    public List<ToDo> getAllTodo() {
        return todoMapper.selectByExample(null);
    }

    @Override
    public Optional<ToDo> getTodoById(int id) {
        return Optional.of(todoMapper.selectByPrimaryKey( id));
    }

    @Override
    public int deleteTodo(int id) {
        return todoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTodo(int id, ToDo newTodo) {
        newTodo.setId(id);
        return todoMapper.updateByPrimaryKeySelective(newTodo);
    }
}
