package com.mm.dao;

import com.mm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by machu on 2017-06-10.
 */
@Transactional
public interface StudentRepository extends JpaRepository<Student,Long> {
}
