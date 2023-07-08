package kr.spring.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Advice {
	// 요청 URL과 실행 메서드 연결
	@RequestMapping("/advice.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		// 뷰 이름 지정
		mav.setViewName("advice");
		// 뷰에서 사용할 데이터 세팅
		mav.addObject("advice", "hello");
		return mav; // DispatherServlet에서 반환
		}

}
