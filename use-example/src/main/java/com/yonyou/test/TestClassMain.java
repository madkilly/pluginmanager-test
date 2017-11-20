package com.yonyou.test;

import com.yonyou.cloud.ExtensionContext;
import com.yonyou.cloud.PluginManager;

public class TestClassMain {
	
	public static void main(String[] args) {
		//装配插件上下文
		ExtensionContext context = new ExtensionContext();
		context.ContextMap.put("myint", new Integer(10));
		
		System.out.println("star");
		System.out.println("logic");
		//显式调用插件运行链条
		PluginManager.runPlugins(context);
		
		System.out.println("end");
	}

}
