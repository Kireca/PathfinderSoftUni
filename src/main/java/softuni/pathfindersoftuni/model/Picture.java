package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String url;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

}
