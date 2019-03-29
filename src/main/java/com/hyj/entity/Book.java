package com.hyj.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @version 1.0
 * @Authord huangyujie  email: 190158792@qq.com
 * @Description
 * @Date Create by in 16:45 2018/2/26
 */
@Table
public class Book implements Serializable {

    private static final long serialVersionUID = -1856806539480994211L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String reader;

    private String isbn;

    private String title;

    private String author;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
