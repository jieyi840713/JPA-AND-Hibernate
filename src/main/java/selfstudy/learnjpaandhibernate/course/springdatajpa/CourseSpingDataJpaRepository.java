package selfstudy.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import selfstudy.learnjpaandhibernate.course.Course;

import java.util.List;

public interface CourseSpingDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
