package cn.线程.例子2取钱;

public class Bank implements Runnable{

	private double money=500;//账号余额
	
	/**
	 * 取钱
	 */
	public void getMoney(){
		Bank bank = new Bank();
		Thread th = new Thread(bank,"张三用银行");
		Thread th2 = new Thread(bank,"李四用存折");
		
		th.start();
		th2.start();
	}
	
	@Override
	public void run() {
			synchronized (this) {//同步代码块
				System.out.println(Thread.currentThread().getName()+"开始取钱！");
				double yue = money-400;
				if(yue<0){
					System.out.println("余额不足！您要取：400.余额为:"+money);
				}else{
					money -= 400;
					System.out.println("取钱成功，余额为："+money);
				}
			}
	}

}
