package todo.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import todo.model.TodoData;
import todo.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    // ==fields ==
    @Getter
    private final TodoData data = new TodoData();

    // == public methods ==
    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
