package citiCollege.Jun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
    List<Blog> findByIdGreaterThan(Integer number);
    //"SELECT * FROM blog WHERE title like '%title 1%' OR content like 'title 1'"
    //"SELECT * FROM blog WHERE findById = 5"
}
