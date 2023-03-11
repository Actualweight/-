package 蓝桥杯竞赛入门;
import java.util.Arrays;
//给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
//输入格式
//第一行为一个整数n。
//第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
import java.util.Scanner;
public class Tese2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[] = new int[n];
	for (int i = 0; i<n; i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i:a) {System.out.print(i+" ");}
	
}
}
