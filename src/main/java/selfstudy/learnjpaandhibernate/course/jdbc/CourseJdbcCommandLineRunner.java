package selfstudy.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import selfstudy.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS now!", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure now!", "in28minutes"));
        repository.insert(new Course(3, "Learn DevOps now!", "in28minutes"));

        repository.deleteById(1);
    }
}
