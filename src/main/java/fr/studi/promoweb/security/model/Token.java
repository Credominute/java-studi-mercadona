package fr.studi.promoweb.security.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_token;

    @Column(unique = true)
    private String token;

    private TokenType tokenType = TokenType.BEARER;

    private boolean revoked;

    private boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "id_user")
    private User user;

}
