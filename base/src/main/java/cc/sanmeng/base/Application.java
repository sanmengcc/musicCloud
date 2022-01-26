package cc.sanmeng.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：胡侯东
 * @Date：2022/1/26 10:02 AM
 * @Desc:
 */
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class);
        log.info("Application启动成功......");
    }
}