package softuni.pathfindersoftuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfindersoftuni.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
