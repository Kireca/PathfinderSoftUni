package softuni.pathfindersoftuni.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;


    @Email
    @Column(name = "email")
    private String email;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Level level;
}
