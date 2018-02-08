package chapter08.classExecutionEngine;

import java.io.Serializable;

/**
 * 方法静态分派的重要提现——重载（多态）
 * 重载方法匹配优先级
 * 
 * 	静态分配发生在编译阶段，因此确定静态分派的动作实际上不是由虚拟机来执行的。
 * 另外，编译器虽然能确定出方法的重载版本，但在很多情况下这个重载版本并不是“唯一的”，
 * 往往只能确定一个“更加合适的”的版本。
 * 
 * 	产生这种模糊结论的主要原因：是字面量不需要定义，所以字面量没有显式的静态类型，
 * 它的静态类型只能通过语言上的规则去理解和推断。
 * 
 * @author kaiyun
 */
public class Overload {

	public static void sayHello(Object arg) {
		System.out.println("hello Object");
	}

	public static void sayHello(int arg) {
		System.out.println("hello int");
	}

	public static void sayHello(long arg) {
		System.out.println("hello long");
	}

	public static void sayHello(Character arg) {
		System.out.println("hello Character");
	}

	public static void sayHello(char arg) {
		System.out.println("hello char");
	}

	public static void sayHello(char... arg) {
		System.out.println("hello char ...");
	}

	public static void sayHello(Serializable arg) {
		System.out.println("hello Serializable");
	}

	public static void main(String[] args) {
		sayHello('a');
	}
}
