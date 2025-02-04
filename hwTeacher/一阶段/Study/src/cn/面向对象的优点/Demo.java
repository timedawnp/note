package cn.面向对象的优点;


/**
 * 面向对象的优点：
 * 		1.便于程序模拟现实世界中的实体
 * 					用类封装建模实体对象的属性和行为
 * 		2.隐藏细节
 * 					对象的行为和状态被封装在类中，外界不需要关注内部细节如何实现
 * 		3.可重用
 * 					可以通过类模板，创建多个对象实例，重用类的定义代码
 * 
 * Java垃圾回收器
 * 		Java运行时，系统有一个垃圾回收线程负责清除不再使用的对象，俗称垃圾回收器
 * 		垃圾回收器定期扫描内存，对于被使用的对象加上标记，按可能的路径扫描结果后清除未加标记的对象
 * 		被回收的对象是：
 * 					1.不再被任何变量引用的对象
 * 					2.人为将变量置为null
 * 					3.未被使用的对象
 * 
 * 			String str1 = "";
 * 			String str2 = null;
 * 	
 * 			if(str1.equals("123")){
 * 	
 * 			}
 * 			if(str2.equals("123")){
 * 	
 * 			}
 * 
 */
public class Demo {

	public static void main(String[] args) {
		Woman woman1 = new Woman();
		Woman woman2 = new Woman();
		Woman woman3 = new Woman();
		Woman woman4 = new Woman();
		Woman woman5 = new Woman();
		Woman woman6 = new Woman();
		Woman woman7 = new Woman();
		
		woman1 = null;
		woman1.beautyWoman();
	}
}
