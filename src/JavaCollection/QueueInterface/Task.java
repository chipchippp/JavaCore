package JavaCollection.QueueInterface;

public class Task implements Comparable{
    private int priority;
    private String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Task task = (Task) o;
        return this.priority - task.priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
