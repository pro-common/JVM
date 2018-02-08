package chapter08.classExecutionEngine;

/**
 * 方法动态分派演示
 * 	方法动态分派的重要提现——重写（多态）
 * 
 * 	在运行期根据实际类型确定方法执行版本的分派过程称为动态分派。
 * 
 * @author zzm
 */
public class DynamicDispatch {

	static abstract class Human {
		protected abstract void sayHello();
	}

	static class Man extends Human {
		@Override
		protected void sayHello() {
			System.out.println("man say hello");
		}
	}

	static class Woman extends Human {
		@Override
		protected void sayHello() {
			System.out.println("woman say hello");
		}
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		man.sayHello();
		woman.sayHello();
		man = new Woman();
		man.sayHello();
	}
}
