package softuni.pathfindersoftuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfindersoftuni.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
