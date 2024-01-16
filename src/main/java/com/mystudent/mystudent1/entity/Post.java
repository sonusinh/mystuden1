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


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {

        return null;
    }

    public String getDescription() {
        return null;
    }

    public Object getContent() {
        return  null;
    }
}


