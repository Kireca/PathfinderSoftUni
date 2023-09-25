package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.pathfindersoftuni.model.enums.CategoryNames;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CategoryNames name;


    @Column(columnDefinition = "TEXT")
    private String description;


}
