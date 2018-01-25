package chapter02;

/**
 * VM Args：-Xss128k
 * @author zzm
 */
public class JavaVMStackSOF_2_4 {

	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF_2_4 oom = new JavaVMStackSOF_2_4();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:" + oom.stackLength);
			throw e;
		}
	}
}
