package ���ű���������;
import java.util.Arrays;
//����һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
//�����ʽ
//��һ��Ϊһ������n��
//�ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
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
