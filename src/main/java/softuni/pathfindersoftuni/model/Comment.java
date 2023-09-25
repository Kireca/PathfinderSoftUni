package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

    @Column
    private Boolean approved;

    @Column
    private LocalDateTime created;

    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;


    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

}
