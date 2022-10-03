package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)   //기존에 만들어 놓은거랑 충돌하는 걸 방지하기 위해 필터 처리, 실무에서는 원래꺼 다 지우는게 나음!
public class AutoAppConfig {
}
