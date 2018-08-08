package com.kg.library.Repository;

import java.util.List;

import com.kg.library.model.Bookreview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookreviewRepository extends JpaRepository<Bookreview, Long>{

}