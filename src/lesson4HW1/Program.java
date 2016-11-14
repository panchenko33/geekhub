package lesson4HW1;

import javafx.concurrent.Task;

import java.time.LocalDateTime;
import java.util.*;

public class Program implements TaskManager {

    public Map<LocalDateTime, Task> taskByDate;

    public Program() {
        this.taskByDate = new HashMap<>();
    }

    public Map<LocalDateTime, Task> getTaskByDate() {
        return taskByDate;
    }

    @Override
    public void add(LocalDateTime date, Task task) {
        taskByDate.put(date, task);
    }

    @Override
    public void remove(LocalDateTime date) {
        taskByDate.remove(date, taskByDate);
    }

    @Override
    public Set<String> getCategories() {
        Set<String> categories = new HashSet<>();
        for (Map.Entry<LocalDateTime, Task> taskEntry : taskByDate.entrySet()) {
            categories.add(String.valueOf(getCategories()));
        }
        return categories;
    }

    @Override
    public Map<String, List<Task>> getTasksByCategories(String... categories) {
        return null;
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        return null;
    }

    @Override
    public List<Task> getTasksForToday() {
        return null;
    }
}
