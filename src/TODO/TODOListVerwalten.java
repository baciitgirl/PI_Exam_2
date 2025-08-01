package TODO;

/**
 * Verwaltet eine Liste von Aufgaben (Tasks).
 */
public class TODOListVerwalten {
    // Attribute
    private Task[] tasks;
    private int nextId;
    private int maxNumberOfTasks;
    private int numberOfTasks;

    // Konstruktor
    public TODOListVerwalten(int maxNumberOfTasks) {
        this.maxNumberOfTasks = maxNumberOfTasks;
        this.tasks = new Task[maxNumberOfTasks];
        this.nextId = 0;
        this.numberOfTasks = 0;
    }

    /**
     * Fügt einen neuen Task mit dem angegebenen Titel hinzu.
     */
    public void addTask(String title) {
        if (numberOfTasks < maxNumberOfTasks) {
            for (int i = 0; i < tasks.length; i++) {
                if (tasks[i] == null) {
                    tasks[i] = new Task(nextId++, title);
                    tasks[i].setComplete(false);
                    numberOfTasks++;
                    break;
                }
            }
        } else {
            System.out.println("Task-Liste ist voll!");
        }
    }

    /**
     * Gibt den Task mit der angegebenen ID zurück.
     */
    public Task getTask(int id) {
        for (Task task : tasks) {
            if (task != null && task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    /**
     * Markiert den Task mit der angegebenen ID als erledigt.
     */
    public void markTaskComplete(int id) {
        for (Task task : tasks) {
            if (task != null && task.getId() == id) {
                task.setComplete(true);
                break;
            }
        }
    }

    /**
     * Löscht den Task mit der angegebenen ID.
     */
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                tasks[i] = null;
                numberOfTasks--;
                break;
            }
        }
    }

    /**
     * Gibt alle gespeicherten Tasks auf der Konsole aus.
     */
    public void displayTasks() {
        System.out.printf("%-6s %-15s %-10s%n", "ID", "Titel", "Status");
        for (Task task : tasks) {
            if (task != null) {
                String status = task.isComplete() ? "done" : "offen";
                System.out.printf("%-6d %-15s %-10s%n", task.getId(), task.getTitle(), status);
            }
        }
        System.out.println();
    }
}
