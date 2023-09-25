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

    @Column(name = "age")
    private int age;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "full_name")
    private String fullName;


    @Column(nullable = false)
    private String password;

    @Column(unique = true ,nullable = false)
    private String username;


    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    private Level level;
}
