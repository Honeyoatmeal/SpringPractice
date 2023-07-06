package kr.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScoreMain {
	public static void main(String[] args) {
		// 컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_score.xml");
		// List 타입 프로퍼티 설정
		ScoreOutput output = (ScoreOutput)context.getBean("scoreOutput");
		System.out.println(output);
		
		// 자원 정리
		context.close();
	}
}
