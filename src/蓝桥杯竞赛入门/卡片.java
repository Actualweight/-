package 蓝桥杯竞赛入门;
//小蓝手里有0-9的卡片各有2021张，一共有20210张卡片
//请问小蓝从1开始拼最高可以拼到多少？
public class 卡片 {
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
