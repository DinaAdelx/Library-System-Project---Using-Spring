package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.sql.SQLException;
@SpringBootApplication

@EnableSwagger2

public class LibraryProjectMain {

    public static void main (String[] args) throws IOException, SQLException {

        //RUNNING SPRING BOOT
        SpringApplication.run(LibraryProjectMain.class, args);

    }
}
