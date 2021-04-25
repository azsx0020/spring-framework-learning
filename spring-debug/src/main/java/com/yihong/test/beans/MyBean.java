package com.yihong.test.beans;

public class MyBean {
	private MyAnotherBean myAnotherBean;

	public void setMyThirdBean(MyThirdBean myThirdBean) {
		this.myThirdBean = myThirdBean;
	}

	private MyThirdBean myThirdBean;

	public MyBean() {
	}

	public MyAnotherBean getMyAnotherBean() {
		return myAnotherBean;
	}

	public void setMyAnotherBean(MyAnotherBean myAnotherBean) {
		this.myAnotherBean = myAnotherBean;
	}
}
