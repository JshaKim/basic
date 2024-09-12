package com.ohgiraffers.exam_ex.board.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "board_table")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_no")
    private int postNo;

    @Column(name = "username", unique = true, nullable = false)
    private String postUername;

    @Column(name = "title", nullable = false)
    private String post_title;

    @Column(name = "content", nullable = false)
    private String post_content;

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    public String getPostUername() {
        return postUername;
    }

    public void setPostUername(String postUername) {
        this.postUername = postUername;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "postNo=" + postNo +
                ", postUername='" + postUername + '\'' +
                ", post_title='" + post_title + '\'' +
                ", post_content='" + post_content + '\'' +
                '}';
    }
}

