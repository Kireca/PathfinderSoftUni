package softuni.pathfindersoftuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.pathfindersoftuni.model.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
}
