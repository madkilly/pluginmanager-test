package com.yonyou.cloud.impl;

import com.yonyou.cloud.ExtensionContext;
import com.yonyou.cloud.itf.PluginExtensionItf;
import com.yonyou.cloud.logic.PluginLogic2;

/**
 * @author zhukai
 *该类作为插件中暴露出来的功能提供类,如果使用jar包隔离器的话该类应该为public包的内容
 */
public class PluginTestImpl2 implements PluginExtensionItf{

	//运行逻辑
	@Override
	public boolean run(ExtensionContext context) {
		PluginLogic2 logic = new PluginLogic2();
		String mystr = (String)context.ContextMap.get("mystr");
		logic.doprint("zhukai test");
		System.out.println("mystr="+mystr);
		return true;
	}
	
	//获得插件执行顺序 数字越大越先执行
	@Override
	public int order() {
		
		return 2;
	}
	
	//获得插件执行名称
	@Override
	public String getPluginName() {
		
		return "testplugin2";
	}

}
