package com.devil.NewsBroadcast.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;


    private String username;
    private String password;
    private String gender;

    @Column(columnDefinition = "BIGINT")
    private Long mobileNo;
    private String email;
    private String nationality;

    @OneToMany(mappedBy = "user")
    private List<News> newsList;

}
