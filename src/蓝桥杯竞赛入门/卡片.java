package ���ű���������;
//С��������0-9�Ŀ�Ƭ����2021�ţ�һ����20210�ſ�Ƭ
//����С����1��ʼƴ��߿���ƴ�����٣�
public class ��Ƭ {
	public static void main(String[] args) {
		int count=0,a=0;
		while (true) {
			a++;
			if(a%10==1)
				count++;
			if(a/10%10==1)
				count++;
			if(a/100%10==1)
				count++;
			if(a/1000%10==1)
				count++;
			if(count==2021)
				break;
		}
		System.out.println(a);
	}
}
