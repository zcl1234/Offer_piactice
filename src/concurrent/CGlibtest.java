package concurrent;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangchenlin on 17/5/16.
 */
public class CGlibtest implements MethodInterceptor {

    private Enhancer enhancer=new Enhancer();
    public Object getProxy(Class clazz)
    {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return  enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

            System.out.println("前置代理");
            //通过代理类调用父类中的方法
            Object result = methodProxy.invokeSuper(obj, objects);
            System.out.println("后置代理");
            return result;
        }


        public static void main(String[] args)
        {
            CGlibtest cGlibtest=new CGlibtest();
            cglib cglib2=(cglib)cGlibtest.getProxy(cglib.class);
            cglib2.sayHello();
        }
}

class cglib
{
    public void sayHello()
    {
        System.out.print("hello");
    }
}