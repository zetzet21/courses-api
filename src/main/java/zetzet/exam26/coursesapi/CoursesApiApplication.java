package zetzet.exam26.coursesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoursesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApiApplication.class, args);
	}
}
