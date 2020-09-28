package citiCollege.Jun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlogController {

    @Autowired
    BlogRepository blogRepositor;

    @GetMapping("/blog")
    public List<Blog> index()
    {
        return blogRepository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable String id)
    {
        int someId = Integer.parseInt(id);

        return blogRepository.findById(someId) ;
    }

    @GetMapping("/blog/greater/{id}")
    public List<Blog> greater(@PathVariable String num)
    {
        Integer someId = Integer.parseInt(num);

        return blogRepository.findByIdGreaterThan(someId) ;
    }


    @PostMapping("/blog")
    public Blog (@RequestBody Blog body) throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        //String title = body.get("title");
        //String content = body.get("content");
        Date today= new Date();
        Blog blog = new Blog(body.getTitle(),body.getContent(), today);

        return blogRepository.save(blog);
    }

    @PutMapping("/blog/{id}")
    public Blog update (@PathVariable int id, @RequestBody Blog body)
    {
        Optional<Blog> blog = blogRepository.findById(id);
        blog.get().setTitle(body.getTitle());
        blog.get().setContent(body.getContent());
        blog.get().setCreatedDate(new Date());
        return blogRepository.save(blog.get());
    }


    @DeleteMapping("/blog/{id}")
    public boolean delete(@PathVariable int id)
    {
        Optional<Blog> blog = blogRepository.findById(id);
        blogRepository.delete(blog.get());

        return true;
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body)
    {
        String searchTerm = body.get("text");
        return blogRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

}
