package selfstudy.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import selfstudy.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import selfstudy.learnjpaandhibernate.course.jpa.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJPARepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS now!", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure now!", "in28minutes"));
        repository.insert(new Course(3, "Learn DevOps now!", "in28minutes"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
