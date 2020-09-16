package co.nz.springBootDemo.service;

import co.nz.springBootDemo.model.ToDo;
import java.util.List;
import java.util.Optional;

public interface TodoService {

    public int addTodo(ToDo todo);

    public List<ToDo> getAllTodo();

    public Optional<ToDo> getTodoById(int id);

    public int deleteTodo(int id);

    public int updateTodo(int id, ToDo newTodo);
}


//@Service
//public class TodoService {
//    private final TodoDao TodoDao;
//
//    @Autowired
//    public TodoService(@Qualifier("fakeTodoDao") TodoDao TodoDao)
//    {
//        this.TodoDao = TodoDao;
//    }
//
////    @Autowired
////    public TodoService(@Qualifier("posgres") TodoDao TodoDao)
////    {
////        this.TodoDao = TodoDao;
////    }
//
//    public int addTodo(Todo todo)
//    {
//        return TodoDao.insertTodo(todo);
//    }
//
//    public List<Todo> getAllTodo() {
//        return TodoDao.selectAllTodo();
//    }
//
//    public Optional<Todo> getTodoById(int id)
//    {
//        return  TodoDao.selectTodoById(id);
//    }
//
//    public int deleteTodo(int id)
//    {
//        return TodoDao.deleteTodoById(id);
//    }
//
//    public int updateTodo(int id, Todo newTodo)
//    {
//        return  TodoDao.updateTodoById(id,newTodo);
//    }
//}
