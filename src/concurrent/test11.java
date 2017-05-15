package concurrent;

import java.util.ArrayList;
import java.util.List;

public class test11 {

	public static void main(String[] args)
	{
		final int a=9;
	
		final List<person> list=new ArrayList<person>();
		list.add(new person("zhangsan",23));
		list.add(new person("lisi",12));
	    list.set(0, new person("wangba",13));
	}
	
}
class person
{
	String name;


	int age;
	public person(String name,int age) {
		this.name = name;
		this.age=age;
	}
}