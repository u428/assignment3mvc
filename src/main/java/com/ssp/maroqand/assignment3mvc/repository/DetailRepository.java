package com.ssp.maroqand.assignment3mvc.repository;

import com.ssp.maroqand.assignment3mvc.model.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {

    Detail findDetailByOrderIdAndProductId(Long orderIdid, Long productId);
}
