import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store weekdays
        List<String> weekdays = new ArrayList<>();
        
        // Adding weekdays to the ArrayList
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        // Creating a LinkedList to store months
        List<String> months = new LinkedList<>();
        
        // Adding months to the LinkedList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Printing the contents of the ArrayList
        System.out.println("Weekdays: " + weekdays);

        // Printing the contents of the LinkedList
        System.out.println("Months: " + months);
    }
}
