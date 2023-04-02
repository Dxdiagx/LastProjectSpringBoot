package com.example.lastprojectspringboot.Repository;
import com.example.lastprojectspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   User findByUserId(int userId);
   User save(User user);
   User findByUserMail(User userMail);
   User findByUserName(User userName);
}
