package com.citi.blog;

import com.citi.blog.model.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogMockedData {

    private List<Blog> blogs;

    private static BlogMockedData instance = null;

    public static BlogMockedData getInstance(){
        if(instance == null)
        {
            instance = new BlogMockedData();
        }
        return instance;
    }

    public BlogMockedData(){
        blogs = new ArrayList<Blog>();
        blogs.add(new Blog( "How to win friends and influence people","Amazing book review, one of the highest best sellers."));
        blogs.add(new Blog( "Loose 10 pounds in a week","Eat less and excercise. No shortcuts."));
    }

    public List<Blog> fetchBlogs(){
        return blogs;
    }
}
