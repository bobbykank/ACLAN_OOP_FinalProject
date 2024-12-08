import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RoadStatusManagement {
    private static int idCounter = 1;
    private static ArrayList<RoadReportEntry> reports = new ArrayList<>();
    private static AdminBoard adminBoard = new AdminBoard();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Welcome to Path-Finder");
            System.out.println("---------------------------------");
            System.out.println("1. Submit a Road Report");
            System.out.println("2. View All Reports");
            System.out.println("3. Admin: Update Road Status");
            System.out.println("4. Exit");
            System.out.println("---------------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter road status (Closed, Damaged, Under Maintenance): ");
                    String status = scanner.nextLine();
                    reports.add(new RoadReportEntry(idCounter++, name, location, status, new Date()));
                    System.out.println("Report submitted successfully!");
                    break;

                case 2:
                    System.out.println("ALL REPORTS:");
                    for (RoadReportEntry report : reports) {
                        report.displayDetails();
                    }
                    break;

                case 3:
                    System.out.println("Submitted Paths:");
                    System.out.println("---------------------------------");
                    // Display all reports before prompting for Post ID
                    if (reports.isEmpty()) {
                        System.out.println("No reports available to update.");
                        break;
                    }
                    for (RoadReportEntry report : reports) {
                        report.displayDetails(); // Show the details of each report
                    }
                
                    System.out.print("Enter Post ID to update: ");
                    int postId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                
                    System.out.print("Enter new status (Solved/Safe): ");
                    String newStatus = scanner.nextLine();
                
                    adminBoard.updateStatus(reports, postId, newStatus);
                    break;
                
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("See you later on the right Path!");
                    System.out.println("---------------------------------");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
