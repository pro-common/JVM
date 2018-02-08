package chapter08.classExecutionEngine;

/**
 * 单分派、多分派演示（代码清单8-10 单分派和多分派）
 * 	根据分派基于多少种宗量，可以将分派划分为单分派和多分派两种。
 * 	宗量的定义：方法的接受者与方法的参数统称为方法的宗量。
 * 	单分派：根据一个宗量对目标方法进行选择。
 * 	多分派：根据多于一个宗量对目标方法进行选择。
 * 
* @author zzm
 */
public class Dispatch {

	static class QQ {}

	static class _360 {}

	public static class Father {
		public void hardChoice(QQ arg) {
			System.out.println("father choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("father choose 360");
		}
	}

	public static class Son extends Father {
		public void hardChoice(QQ arg) {
			System.out.println("son choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("son choose 360");
		}
	}

	public static void main(String[] args) {
		Father father = new Father();
		Father son = new Son();
		father.hardChoice(new _360());
		son.hardChoice(new QQ());
	}
}
