package kg.mcom17.CBM.repository;

import kg.mcom17.CBM.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    
}
