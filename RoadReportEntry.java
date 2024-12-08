import java.util.Date;

public class RoadReportEntry extends RoadReport {
    public RoadReportEntry(int postId, String userName, String location, String roadStatus, Date dateSubmitted) {
        super(postId, userName, location, roadStatus, dateSubmitted);
    }

    @Override
    public void displayDetails() {
        System.out.printf("Post ID: %d | User: %s | Location: %s | Status: %s | Date: %s\n",
                getPostId(), getUserName(), getLocation(), getRoadStatus(), getDateSubmitted());
    }
}
