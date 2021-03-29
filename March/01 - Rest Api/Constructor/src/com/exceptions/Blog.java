package com.exceptions;

public class Blog {
    int id;
    String title;
    String content;
    public Blog()
    {}

    public Blog(int idValue, String titleValue, String contentValue)
    {
        this.id = idValue;
        this.title = titleValue;
        this.content = contentValue;
    }

    @Override
    public String toString() {
        return "Identifier:"+id +" Title:"+title +" Content:"+content;
    }
}
