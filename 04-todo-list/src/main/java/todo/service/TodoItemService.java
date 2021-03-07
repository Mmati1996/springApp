package todo.service;
import todo.model.TodoData;
import todo.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);
    void removeItem (int id);
    TodoItem getItem (int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}