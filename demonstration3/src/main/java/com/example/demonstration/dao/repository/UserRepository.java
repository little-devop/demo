package com.example.demonstration.dao.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demonstration.entities.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByLastName(String lastName);
  
  User findByEmail(String email);
  
  /*List<User> findByTexte (TexteRepository titre);
  List<User> findByNationality (String nationality);
  User findById(long id);*/
  @Query(" select u from User u " +
          " where u.username = ?1")
  Optional<User> findUserWithName(String username);

  
  
 /* User user = userRepository.findUserWithName(username)
          .orElseThrow(() -> new UsernameNotFoundException("User not found"));*/
}
