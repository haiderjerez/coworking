package pro.coworking.dto;

import java.time.LocalDateTime;


public class ReservationDTO {
    private Long id;
    private String userName;
    private Long spaceId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public ReservationDTO() {}

    public ReservationDTO(Long id, String userName, Long spaceId, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.userName = userName;
        this.spaceId = spaceId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

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

    public Long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    
}
