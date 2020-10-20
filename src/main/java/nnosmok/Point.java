package nnosmok;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Point_table")
public class Point {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long pointId;
    private Long userId;
    private Integer pointValue;

    @PostPersist
    public void onPostPersist(){
        RegisteredPoints registeredPoints = new RegisteredPoints();
        BeanUtils.copyProperties(this, registeredPoints);
        registeredPoints.publishAfterCommit();


    }

    @PostUpdate
    public void onPostUpdate(){
        AccumulatedPoints accumulatedPoints = new AccumulatedPoints();
        BeanUtils.copyProperties(this, accumulatedPoints);
        accumulatedPoints.publishAfterCommit();


        DeductedPoints deductedPoints = new DeductedPoints();
        BeanUtils.copyProperties(this, deductedPoints);
        deductedPoints.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getPointId() {
        return pointId;
    }

    public void setPointId(Long pointId) {
        this.pointId = pointId;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }




}
