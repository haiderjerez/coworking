package pro.coworking.Entity;

import jakarta.persistence.*;

@Entity

@Table(name = "reservation") 
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private Integer spaceId;
    private String startTime;
    private String endTime;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getSpaceId() {
        return spaceId;
    }
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


}