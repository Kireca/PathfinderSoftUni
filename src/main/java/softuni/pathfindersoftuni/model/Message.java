package softuni.pathfindersoftuni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "messages")
public class Message extends BaseEntity {


    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "text_content")
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;

}
