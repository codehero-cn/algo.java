package algo.recursive;

/**
 *  递归算法：疯狂Java：codes\5\5.2\ Recursive.java
 * 功能:递归方法：已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
 */
public class Recursive
{
	public static int fn(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 4;
		}
		else
		{
			//方法中调用它自身，就是方法递归
			return 2 * fn(n - 1) + fn(n - 2);
		}
	}
	public static void main(String[] args) {
		//输出fn(10)的结果
		System.out.println(fn(10));
	}
}

