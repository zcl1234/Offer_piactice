package offer;
/**
 * 题目:实现函数 double Power(double base,int exponent),
 * 求 base 的 exponent 次方。不得使用库函数,同时不需要考虑大数问题。
 * 
 *  需要考虑的情况：
 * exponent小于0
 * base=0 exponent<0
 * 判断两个小数是否相等，只能判断它们之间的差的绝对值是不是在一个很小的范围内。
 * 
 * 
 * 在第二种递归的求法中，使用>>1来表示除以2运算，使用&1来表示％运算，可以提高效率  因为位运算的效率高很多
 * */
public class No11 {

	public static double Power(double base,int exponent) throws Exception
	{
		double res;
		if(equal(base,0.0)&&exponent<0)
		  throw new Exception("0的负次数幂没有意义");	
		if(exponent<0)
		{
			res=1.0/powerWithExpoment2(base, -exponent);
		}else
			res=powerWithExpoment2(base, exponent);
		
		return res;
	}
	//第一种循环的方法
	private static double powerWithExpoment(double base,int exponent)
	{
		if(exponent==0)
			return 1;
		if(exponent==1)
			return base;
		double result=1.0;
		for(int i=0;i<exponent;i++)
			result*=base;
		return result;
	}
	
	//第二种 递归的方法
	
	private static double powerWithExpoment2(double base,int exponent)
	{
		if(exponent==0)
		return 1;
		if(exponent==1)
		return base;
		double result=powerWithExpoment2(base, exponent>>1);
		
		result*=result;
		if((exponent & 1)==1)
		result*=base;
		return result;
	}
	
	//double 数不能用＝＝来判断是否相等
	private static boolean equal(double num1,double num2)
	{
		if((num1-num2)<0.00000001&&(num1-num2)<0.00000001)
		{
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) throws Exception
	{
	System.out.println(Power(4, 2));	
		
	}
	
	
}
