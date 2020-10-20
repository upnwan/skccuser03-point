package nnosmok;

import java.util.Date;

public class CheckedInSmokingArea extends AbstractEvent {

    private Long id;
    private Long checkInId;
    private Long userId;
    private Date checkInDate;
    private Long latitude;
    private Long longitude;
    private String status;
    private Long smokingAreaId;
    private String smokingAreaName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(Long checkInId) {
        this.checkInId = checkInId;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Date getCheckDate() {
        return checkInDate;
    }

    public void setCheckDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }
    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }
    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getSmokingAreaId() {
        return smokingAreaId;
    }

    public void setSmokingAreaId(Long smokingAreaId) {
        this.smokingAreaId = smokingAreaId;
    }
    public String getSmokingAreaName() {
        return smokingAreaName;
    }

    public void setSmokingAreaName(String smokingAreaName) {
        this.smokingAreaName = smokingAreaName;
    }
}