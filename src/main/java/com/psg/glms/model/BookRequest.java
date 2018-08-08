package com.psg.glms.model;

import javax.persistence.*;

@Entity
public class BookRequest{
    // bookreqid,bookid, userid, status (Q/I/R)
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookreqid;
    @Column
    private Long userid;
    @Column
    private String category;
    @Column
    private String book;
	@Column
    private String status;

    /**
     * @return the bookreqid
     */
    public Long getBookreqid() {
        return bookreqid;
    }
    /**
     * @param bookreqid the bookreqid to set
     */
    public void setBookreqid(Long bookreqid) {
        this.bookreqid = bookreqid;
    }
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }/**
     * @return the book
     */
    public String getBook() {
        return book;
    }
    /**
     * @param book the book to set
     */
    public void setBook(String book) {
        this.book = book;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}