package set;

public class Task implements Comparable<Task>{

    private static int nextID;
    private final int id;
    private final String description;
    private boolean isDone;

    public Task(String description) {
        nextID++;
        this.id = nextID;
        this.description = description;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(id, o.getId());
    }
}
