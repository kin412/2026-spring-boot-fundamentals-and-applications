package hello;

import hello.config.MyDatasourceEnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyDatasourceEnvConfig.class)
//hello.config에 설정파일을 단걔적으로 계속 추가할건데 이 설정파일들을 중복으로 적용하지 않기 위해서
@SpringBootApplication(scanBasePackages = "hello.datasource")
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
