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
@NoArgsConstructor()

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "age")
    private int age;

    @Email
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "full_name")
    private String fullName;


    @Column(name = "password" ,nullable = false)
    private String password;

    @Column(name = "username" ,nullable = false)
    private String username;
    //(id, age, email, full_name, level, password, username)


    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Level level;
}
