package kr.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Clerk {
	@Autowired
	private Worker worker;
	
	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public void addUnit() {
		worker.work();
	}
}
