package 蓝桥杯竞赛入门;

import java.util.Arrays;
import java.util.Scanner;

public class 字母排列 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char[] Str = s.toCharArray();
	Arrays.sort(Str);
	System.out.println(Str);
	
	
	
}
}
