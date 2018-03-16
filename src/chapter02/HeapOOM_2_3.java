package chapter02;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 限制Java堆的大小为20MB，不可扩展（将堆的最小值-Xms参数与最大值-Xmx参数设置为一样即可避免堆自动扩展）。
 * 通过参数-XX:+HeapDumpOnOutOfMemoryError可以让虚拟机再出现内存溢出异常时Dump出当前的内存堆转存储快照以便事后进行分析。
 * 
 * @author zzm
 */
public class HeapOOM_2_3 {

	static class OOMObject {
	}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();

		while (true) {
			list.add(new OOMObject());
		}
	}
}
