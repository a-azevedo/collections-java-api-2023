package set;

import java.util.Set;
import java.util.TreeSet;

public class TaskManager {
    Set<Task> todo;

    public TaskManager(){
        this.todo = new TreeSet<>();
    }
    public void addTask(String description){
        todo.add(new Task(description));
    }
    public void removeTask(int id){
        todo.removeIf(x -> x.getId() == id);
    }
    public void showTasks(){
        System.out.println(todo);
    }
    public void tasksCount(){
        System.out.println(todo.size());
    }

    public void setTaskToDone(String description){
        for(Task t : todo){
            if(t.getDescription().equalsIgnoreCase(description)){
                t.setDone(true);
                break;
            }
        }
    }
    public void setTaskToPending(String description){
        for(Task t : todo){
            if(t.getDescription().equalsIgnoreCase(description)){
                t.setDone(false);
                break;
            }
        }
    }
    public Set<Task> getDoneTasks(){
        Set<Task> doneTasks = new TreeSet<>();
        for(Task t : todo ){
            if(t.isDone()){
                doneTasks.add(t);
            }
        }
        return doneTasks;
    }
    public Set<Task> getPendindTasks(){
        Set<Task> pendingTasks = new TreeSet<>();
        for(Task t : todo){
            if(!t.isDone()){
                pendingTasks.add(t);
            }
        }
        return pendingTasks;
    }

    public void clearAllTask(){
        todo.clear();
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Ler 10 páginas de um livro");
        tm.addTask("Estudar na DIO");
        tm.addTask("Enviar currículo");


        tm.showTasks();
        tm.removeTask(2);
        tm.setTaskToDone("ler 10 páginas de um livro");
        tm.showTasks();
        tm.setTaskToPending("ler 10 páginas de um livro");
        tm.showTasks();
        tm.setTaskToDone("ler 10 páginas de um livro");
        tm.showTasks();
        System.out.println(tm.getDoneTasks());
        System.out.println(tm.getPendindTasks());
        tm.clearAllTask();
        tm.showTasks();
        tm.tasksCount();
    }
}
