package com.example.logowanie_DM;

public class Quotation {
    private String content;
    private String author;

    public Quotation() {
    }

    public Quotation(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
