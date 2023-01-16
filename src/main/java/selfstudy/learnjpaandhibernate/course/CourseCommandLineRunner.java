package selfstudy.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import selfstudy.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import selfstudy.learnjpaandhibernate.course.jpa.CourseJPARepository;
import selfstudy.learnjpaandhibernate.course.springdatajpa.CourseSpingDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJPARepository repository;
    @Autowired
    private CourseSpingDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS now!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure now!", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps now!", "in28minutes"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

    }
}
