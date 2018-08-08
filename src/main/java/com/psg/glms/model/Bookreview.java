package com.psg.glms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Bookreview
 */

@Entity
public class Bookreview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long bookrevid;
    @Column
    private Long bookid;
  
    @Column
    private String review;
@Column
private Long userid;
    /**
     * @param bookrevid the bookrevid to set
     */
    public void setBookrevid(Long bookrevid) {
        this.bookrevid = bookrevid;
    }

    /**
     * @return the bookrevid
     */
    public Long getBookrevid() {
        return bookrevid;
    }
/**
 * @param bookid the bookid to set
 */
public void setBookid(Long bookid) {
    this.bookid = bookid;
}
/**
 * @return the bookid
 */
public Long getBookid() {
    return bookid;
}

    /**
     * @param review the review to set
     */
    public void setreview(String review) {
        this.review = review;
    }

    /**
     * @return the review
     */
    public String getreview() {
        return review;
    }
/**
 * @param userid the userid to set
 */
public void setUserid(Long userid) {
    this.userid = userid;
}
/**
 * @return the userid
 */
public Long getUserid() {
    return userid;
}
    @Override
    public String toString() {
        return bookrevid+"  "+bookid+" "+review+"  "+userid;
    }

}
