package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDetailsRepository extends CrudRepository<FormDetailsRepository, Integer> {

}
