package com.psg.glms;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Properties
 */
@ConfigurationProperties(prefix = "library.books")
@Configuration
public class Properties {

    private Long morethan5;
    private Long  pointsperbook;
    private Long pointspercategory;
    private Long reviewpints;
    private Long likedpoints;
    private Long takenlikedbooks;

    /**
     * @param morethan5 the morethan5 to set
     */
    public void setmorethan5(Long morethan5) {
        this.morethan5 = morethan5;
    }
    /**
     * @return the morethan5
     */
    public Long getmorethan5() {
        return morethan5;
    }
    /**
     * @param pointsperbook the pointsperbook to set
     */
    public void setpointsperbook(Long pointsperbook) {
        this.pointsperbook = pointsperbook;
    }
    /**
     * @return the pointsperbook
     */
    public Long getpointsperbook() {
        return pointsperbook;
    }
    
    /**
     * @param pointspercategory the pointspercategory to set
     */
    public void setpointspercategory(Long pointspercategory) {
        this.pointspercategory = pointspercategory;
    }
    /**
     * @return the pointspercategory
     */
    public Long getpointspercategory() {
        return pointspercategory;
    }
    /**
     * @param reviewpints the reviewpints to set
     */
    public void setReviewpints(Long reviewpints) {
        this.reviewpints = reviewpints;
    }
    /**
     * @return the reviewpints
     */
    public Long getReviewpints() {
        return reviewpints;
    }
    /**
     * @param likedpoints the likedpoints to set
     */
    public void setLikedpoints(Long likedpoints) {
        this.likedpoints = likedpoints;
    }
    /**
     * @return the likedpoints
     */
    public Long getLikedpoints() {
        return likedpoints;
    }
    /**
     * @param takenlikedbooks the takenlikedbooks to set
     */
    public void setTakenlikedbooks(Long takenlikedbooks) {
        this.takenlikedbooks = takenlikedbooks;
    }
    /**
     * @return the takenlikedbooks
     */
    public Long getTakenlikedbooks() {
        return takenlikedbooks;
    }
}
