package kr.spring.practice;

import java.util.List;

public class ScoreOutput {
	// 프로퍼티
	private List<Double> score;

	public void setScore(List<Double> score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ScoreOutput [score=" + score + "]";
	}

}
