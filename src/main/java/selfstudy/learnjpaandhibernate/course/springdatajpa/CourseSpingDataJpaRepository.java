package selfstudy.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import selfstudy.learnjpaandhibernate.course.Course;

public interface CourseSpingDataJpaRepository extends JpaRepository<Course, Long> {

}
