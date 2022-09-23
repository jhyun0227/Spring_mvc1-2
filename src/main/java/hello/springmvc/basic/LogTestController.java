package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j //log 객체의 자동 생성
@RestController //PDF에서 @Controller와의 차이점 다시 한번 확인하기
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        //걍 다뜸
        System.out.println("name = " + name);

        //application.properties 파일에서 단계에 따른 로그 기록 설정 가능
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        //로그의 연산 사용법 (하지만 절대 사용해서는 안됌 이유는 PDF참고 / 연산이 일어나면서 메모리와 CPU사용 쓸모없는 리소스)
        log.info("info log=" + name);

        return "ok";
    }
}
