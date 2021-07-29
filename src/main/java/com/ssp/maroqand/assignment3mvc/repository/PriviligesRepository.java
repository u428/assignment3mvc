package com.ssp.maroqand.assignment3mvc.repository;

import com.ssp.maroqand.assignment3mvc.model.entity.role.Priviliges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriviligesRepository extends JpaRepository<Priviliges, Long> {

    List<Priviliges> findAllByRoleId(Long id);
}
