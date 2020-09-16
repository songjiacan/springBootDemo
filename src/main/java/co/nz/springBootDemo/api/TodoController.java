package co.nz.springBootDemo.api;

import co.nz.springBootDemo.model.ToDo;
import co.nz.springBootDemo.service.TodoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

//@CrossOrigin(origins = "*", maxAge = 3600)
@Api(tags = "Api Todo Controller", description = "to do list controller")
@RequestMapping("/api/todo")
@RestController
public class TodoController{

    private final TodoService TodoService;

    @Autowired
    public TodoController(TodoService TodoService) {
        this.TodoService = TodoService;
    }

    @ApiOperation("Create a new todo task")
    @PostMapping
    public void addTodo(@Valid @NotNull @RequestBody ToDo toDo){
        TodoService.addTodo(toDo);
    }

    @ApiOperation("Get all todo tasks")
    @GetMapping
    public List<ToDo> getAllTodo(){
        return TodoService.getAllTodo();
    }

    @ApiOperation("Get a todo task by id")
    @GetMapping(path = "{id}")
    public ToDo getTodoById(@PathVariable("id") int id)
    {
        return  TodoService.getTodoById(id)
                .orElse(null);
    }

    @ApiOperation("Delete a todo task by id")
    @DeleteMapping(path = "{id}")
    public void deleteTodoById(@PathVariable("id") int id)
    {
        TodoService.deleteTodo(id);
    }

    @ApiOperation("Update status of todo task")
    @PutMapping(path = "{id}")
    public void updateTodoById(@PathVariable("id") int id,@Valid @NotNull @RequestBody ToDo toDo)
    {
        TodoService.updateTodo(id,toDo);
    }
}

