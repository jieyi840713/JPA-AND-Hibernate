package selfstudy.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate SpringJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id,name,author)
                values(1,'Learn AWS', 'in28Minutes');
            """;

    public void insert(){
        SpringJdbcTemplate.update(INSERT_QUERY);
    }
}
