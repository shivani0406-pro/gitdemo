package stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner sj = new StringJoiner(",");
		sj.add("Hello");
		System.out.println(sj.hashCode());
		sj.add("World");
		System.out.println(sj.toString());
		System.out.println(sj.hashCode());
	}

}
