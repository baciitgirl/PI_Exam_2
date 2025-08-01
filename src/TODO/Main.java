package TODO;

public class Main {
    public static void main(String[] args) {
     TODOListVerwalten verwaltung= new TODOListVerwalten(10);
        //hinzufügen der elemente
        verwaltung.addTask("Einkaufen");
        verwaltung.addTask("PR1 Ueben");
        verwaltung.addTask("Lernen   ");
//consolenausgabe
        verwaltung.displayTasks();
        verwaltung.markTaskComplete(1);
        verwaltung.displayTasks();
        verwaltung.deleteTask(2);
        verwaltung.displayTasks();
    }
}

