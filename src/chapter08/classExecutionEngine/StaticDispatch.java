package chapter08.classExecutionEngine;

/**
 * 方法静态分派演示
 * 	方法静态分派的重要提现——重载（多态）
 * 
 *  Human man = new Man();
 *  	"Human" 称为变量的静态类型
 *  	"Man" 称为变量的实际类型
 *  
 *  	静态类型和实际类型在程序中都可以发生一些变化，区别是静态类型的变化仅仅在使用时发生，
 *  变量本身的静态类型不会被改变，并且最终的静态类型是在【编译期】可知的；而实际类型变化的结果在
 *  【运行期】才可以确认。
 *  
 * 	所有依赖静态类型来定位方法执行版本的分派动作称为静态分派。
 * 
 * 	虚拟机（准确地说是编译器）在“重载”时是通过参数的静态类型而不是实际类型作为判断依据的。
 * 
 * @author kaiyun
 */
public class StaticDispatch {

	static abstract class Human {
	}

	static class Man extends Human {
	}

	static class Woman extends Human {
	}

	public void sayHello(Human guy) {
		System.out.println("hello,guy!");
	}

	public void sayHello(Man guy) {
		System.out.println("hello,gentleman!");
	}

	public void sayHello(Woman guy) {
		System.out.println("hello,lady!");
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		StaticDispatch sr = new StaticDispatch();
		// 实际类型变化
		sr.sayHello(man);
		sr.sayHello(woman);
		
		System.out.println("-----------------------");
		
		// 静态类型变化
		sr.sayHello((Man)man);
		sr.sayHello((Woman)woman);
	}
}
