import java.util.Date;
public abstract class RoadReport {
    private int postId;
    private String userName;
    private String location;
    private String roadStatus;
    private Date dateSubmitted;

    public RoadReport(int postId, String userName, String location, String roadStatus, Date dateSubmitted) {
        this.postId = postId;
        this.userName = userName;
        this.location = location;
        this.roadStatus = roadStatus;
        this.dateSubmitted = dateSubmitted;
    }

    public int getPostId() {
        return postId;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public String getRoadStatus() {
        return roadStatus;
    }

    public void setRoadStatus(String roadStatus) {
        this.roadStatus = roadStatus;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public abstract void displayDetails();
}
