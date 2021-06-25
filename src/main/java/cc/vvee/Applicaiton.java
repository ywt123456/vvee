package cc.vvee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController()
public class Applicaiton {

    public static void main(String[] args) {
        log.info("=====开始启动======");
        SpringApplication.run(Applicaiton.class,args);
        log.info("=====启动完成======");
    }



    @GetMapping("/")

}
