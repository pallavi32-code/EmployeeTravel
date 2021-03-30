package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.EmpRole;

@Repository
public interface RoleRepository extends CrudRepository<EmpRole, Integer> {

}
