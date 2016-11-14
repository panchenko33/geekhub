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
        Map<Set<String>, Set<Map.Entry<LocalDateTime, Task>>> TasksByCategories = new HashMap<>();
        for (Map.Entry<LocalDateTime, Task> taskByCategory : taskByDate.entrySet()) {
            TasksByCategories.put(getCategories(), taskByDate.entrySet());
        }
        return getTasksByCategories();
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        List<Task> TaskByCategory = new ArrayList<>();
        for (Map.Entry<LocalDateTime, Task> taskByCategories : taskByDate.entrySet()) {
            TaskByCategory.add((Task) getTasksByCategories());
        }
        return getTasksByCategory();
    }


    @Override
    public List<Task> getTasksForToday() {
        List<Map<String, List<Task>>> taskForToday = new ArrayList<>();
        for (Map.Entry<LocalDateTime, Task> taskByCategories : taskByDate.entrySet()) {
            taskForToday.add(getTasksByCategories());
        }
        return getTasksForToday();
    }
}
