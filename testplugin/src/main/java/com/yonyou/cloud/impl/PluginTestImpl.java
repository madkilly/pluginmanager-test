package com.yonyou.cloud.impl;

import com.yonyou.cloud.ExtensionContext;
import com.yonyou.cloud.itf.PluginExtensionItf;
import com.yonyou.cloud.logic.PluginLogic;

/**
 * @author zhukai
 *该类作为插件中暴露出来的功能提供类,如果使用jar包隔离器的话该类应该为public包的内容
 */
public class PluginTestImpl implements PluginExtensionItf{

	//运行逻辑
	@Override
	public boolean run(ExtensionContext context) {
		PluginLogic logic = new PluginLogic();
		int myint = (int)context.ContextMap.get("myint");
		logic.doprint("zhukai test");
		System.out.println("myint="+myint);
		return true;
	}
	
	//获得插件执行顺序
	@Override
	public int order() {
		
		return 1;
	}
	
	//获得插件执行名称
	@Override
	public String getPluginName() {
		
		return "testplugin";
	}

}
