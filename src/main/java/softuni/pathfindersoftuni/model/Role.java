package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.pathfindersoftuni.model.enums.UserRoles;


@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRoles name;


}
