package com.devil.NewsBroadcast.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue
    private int newsId;
    private String heading;
    @Column(columnDefinition = "TEXT")
    private String newsDesc;
    private LocalDate createdAt;
    private int likes;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


}
