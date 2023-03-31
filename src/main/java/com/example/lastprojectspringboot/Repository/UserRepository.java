package com.example.lastprojectspringboot.Repository;
import com.example.lastprojectspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

   User findByUserId(int userId);
   User save(User user);
   User findByUserMail(User userMail);
   User findByUserName(User userName);
}
