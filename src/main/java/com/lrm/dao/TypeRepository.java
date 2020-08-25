package com.lrm.dao;

import com.lrm.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName TypeRepository.java
 * @Description TODO
 * @createTime 2020年08月25日 15:26:00
 */
public interface TypeRepository extends JpaRepository<Type, Long> {
}
