import java.util.ArrayList;

public class AdminBoard {
    public void updateStatus(ArrayList<RoadReportEntry> reports, int postId, String newStatus) {
        for (RoadReportEntry report : reports) {
            if (report.getPostId() == postId) {
                report.setRoadStatus(newStatus);
                System.out.println("Status updated successfully.");
                return;
            }
        }
        System.out.println("Post ID not found.");
    }
}
