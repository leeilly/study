package readinglist;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ReadingListServletInitializer extends SpringBootServletInitializer{
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(ReadingListApplication.class);
		//application.class만 등록해도 application class에서 부트스트랩 클래스(main() 포함)와 스프링 구성 클래스 역할을 모두 제공.
		//ReadingListApplication.class 의 @SpringBootApplication 이 컴포넌트 검색을 명시적으로 활성화 하기 때문에 다른 구성 클래스가 있어도 sources() 로 등록할 필요 없음.
	}
	
	
}
