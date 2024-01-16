package com.mystudent.mystudent1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sqm.mutation.internal.cte.CteInsertStrategy;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private  String title;

    private  String  description;
    private  String content;

}