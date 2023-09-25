package softuni.pathfindersoftuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfindersoftuni.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
