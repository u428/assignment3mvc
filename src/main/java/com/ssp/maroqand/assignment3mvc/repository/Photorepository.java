package com.ssp.maroqand.assignment3mvc.repository;

import com.ssp.maroqand.assignment3mvc.model.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Photorepository extends JpaRepository<Photo, Long> {

}
