package io.github.maxsanttos.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.maxsanttos.course.entities.User;


public interface UserRepository extends JpaRepository<User,Long>{
    
    

}
