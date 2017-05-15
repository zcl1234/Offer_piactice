package offer;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void PrintNumBigInteger(int n)
	{
		BigInteger num=BigInteger.valueOf(1);
		for(int i=0;i<n;i++)
			num.multiply(BigInteger.TEN);
	    System.out.println(num);
		for(BigInteger i=BigInteger.ONE;i.compareTo(num)<0;i.add(BigInteger.ONE))
			System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
	
//		BigInteger m=BigInteger.valueOf(1);
//		for(int i=1;i<5;i++)
//			m=m.multiply(BigInteger.valueOf(i));
//		System.out.println(m);
//		int res=1;
//		for(int i=1;i<5;i++)
//			res*=i;
//		System.out.println(res);
		PrintNumBigInteger(3);
	}

}
