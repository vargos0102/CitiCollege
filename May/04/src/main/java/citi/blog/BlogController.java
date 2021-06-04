package citi.blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
public class BlogController {

    @Autowired
    BlogRepository blogRepository ;
    //BlogMockedData blogMockedData = BlogMockedData.getInstance();

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
        //return blogMockedData.fetchBlogs();
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogRepository.findById(blogId);
    }

    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String,String> body)
    {
        String reqTitle =body.get("title");
        String reqContent =body.get("content");
        Blog b = new Blog();
        b.setTitle(reqTitle);
        b.setContent(reqContent);
        return blogRepository.save(b);
    }

    @PutMapping("/blog/{id}")
    public Blog update(@PathVariable String id, @RequestBody Map<String,String> body)
    {
        int blogId = Integer.parseInt(id);
        Optional<Blog> blog= blogRepository.findById(blogId);
        Blog b = new Blog();
        if(blog != null)
        {
            String reqTitle =body.get("title");
            String reqContent =body.get("content");
            b = blog.get();
            b.setTitle(reqTitle);
            b.setContent(reqContent);
            return blogRepository.save(b);
        }
        return b;
    }

    @DeleteMapping("/blog/{id}")
    public void delete(@PathVariable String id)
    {
        int blogId = Integer.parseInt(id);
        blogRepository.deleteById(blogId);
    }

}
