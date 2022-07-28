package projeto.start.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.start.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
