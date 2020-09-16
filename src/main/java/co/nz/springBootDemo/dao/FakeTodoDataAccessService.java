package co.nz.springBootDemo.dao;

import co.nz.springBootDemo.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeTodoDao")
public class FakeTodoDataAccessService implements TodoDao {
    private static List<ToDo> DB = new ArrayList<>();

    @Override
    public int inserttodoById(int id, ToDo todo) {
        DB.add(new ToDo(id,todo.getText(), todo.getCompleted()));
        return 1;
    }

    @Override
    public int insertTodo(ToDo todo) {
        int index = 0;
        for (ToDo e : DB) {
            index = Math.max(index, e.getId());
        };
        DB.add(new ToDo(index +1 ,todo.getText(), todo.getCompleted()));
        return 1;
    }

    @Override
    public List<ToDo> selectAllTodo() {
        return DB;
    }

    @Override
    public Optional<ToDo> selectTodoById(int id) {
        return DB.stream()
                .filter(Todo -> Todo.getId() == (id))
                .findFirst();
    }

    @Override
    public int deleteTodoById(int id) {
        selectTodoById(id)
                .map(Todo -> {
                    int index = DB.indexOf(Todo);
                    if (index >= 0)
                    {
                        DB.remove(index);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
        return 0;
    }

    @Override
    public int updateTodoById(int id, ToDo TodoForUpdate) {
        return  selectTodoById(id)
                .map(Todo -> {
                    int index = DB.indexOf(Todo);
                    if (index >= 0)
                    {
                        DB.set(index, new ToDo(id, TodoForUpdate.getText(), TodoForUpdate.getCompleted()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
