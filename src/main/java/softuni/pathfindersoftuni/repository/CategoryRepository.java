package softuni.pathfindersoftuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfindersoftuni.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
