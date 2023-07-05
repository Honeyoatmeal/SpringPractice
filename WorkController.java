package kr.spring.practice;

public class WorkController {
	// 프로퍼티
	private long customer;
	private BurgerSender burger;
	
	public void setCustomer(long customer) {
		this.customer = customer;
	}
	public void setBurger(BurgerSender burger) {
		this.burger = burger;
	}
	
	@Override
	public String toString() {
		return "WorkController [customer=" + customer + ", burger=" + burger + "]";
	}
}
