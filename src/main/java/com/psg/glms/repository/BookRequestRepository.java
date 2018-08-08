package com.psg.glms.repository;

import java.util.List;
import java.util.stream.Stream;

import com.psg.glms.model.BookRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRequestRepository extends JpaRepository<BookRequest, Long>{
    public List<BookRequest> findByUserid(Long userid);
}
