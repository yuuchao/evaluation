package com.evaluation.repository;

import com.evaluation.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    @Query(value = "select * from girl t where t.age = ?1", nativeQuery = true)
    Girl findByAge(Integer age);

}
