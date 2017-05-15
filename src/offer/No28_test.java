package offer;

import java.util.Scanner;

public class No28_test {
	static int count=0; 
	   public static void main(String[] arg) { 
	       Scanner r=new Scanner(System.in); 
	       String s=r.nextLine(); 
	       Pailie(s, " "); 
	       System.out.println("共有 "+count+"种情况"); 
	     } 
	   static void Pailie(String s,String p)   { 
	       if(s.length()<1)   { 
	       System.out.println(p);//字符串长度小于1，换行 
	       count++; 
	       } 
	       else{ 
	          int index[]=new int[s.length()]; 
	          for(int i=0;i<s.length();i++)
	             //该循环将所有字符的第一次出现的位置记录在数组index中 
	          index[i]=s.indexOf(s.charAt(i)); 
	          for(int i=0;i<s.length();i++){ 
	             if(i==index[i])
	               //只有当循环数与第一次记录数相等时才递归，保证相同字符中的第一个调用 
	             Pailie(s.substring(1),p+s.substring(0,1));//递归，打印其它字符 
	             s=s.substring(1)+s.substring(0,1);//循环移位 
	             } 
	          } 
	      } 
}
