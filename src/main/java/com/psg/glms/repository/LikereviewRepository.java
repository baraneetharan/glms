package com.psg.glms.repository;

import java.util.List;

import com.psg.glms.model.Likereview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikereviewRepository extends JpaRepository<Likereview, Long>{
    public List<Likereview> findByUserid(Long userid);
}
