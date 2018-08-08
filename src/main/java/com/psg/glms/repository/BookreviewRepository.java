package com.psg.glms.repository;

import java.util.List;

import com.psg.glms.model.Bookreview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookreviewRepository extends JpaRepository<Bookreview, Long>{

}
