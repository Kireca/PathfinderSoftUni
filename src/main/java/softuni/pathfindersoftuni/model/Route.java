package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.pathfindersoftuni.model.enums.Level;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "routes")
public class Route extends BaseEntity {


    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private User author;

    @Column(name = "video_url")
    private String videoUrl;

    @ManyToMany
    private Set<Category> categories = new HashSet<>();

}
