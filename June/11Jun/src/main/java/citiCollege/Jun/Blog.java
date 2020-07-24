package citiCollege.Jun;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    @Column(name="createddate")
    private Date createddate;

    public Date getCreatedDate() {
        return createddate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createddate = createdDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createddate +
                '}';
    }

    public Blog() {
    }

    public Blog(String title, String content, Date createdDate) {//
        this.title = title;
        this.content = content;
        this.createddate = createdDate;
    }

    public Blog(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
