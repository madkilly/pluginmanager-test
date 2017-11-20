# pluginmanager-test

## testplugin 
示例插件 包含简单的输出功能用来测试插件管理器是否能正常运作

## testplugin2
同testplugin相比略微有差异，测试插件执行顺序

## use-example
插件管理器 使用示例， 通过插件管理器调用示例插件


## 使用说明

- 插件制作请参见testplugin的大体结构

- 插件类要实现PluginExtensionItf接口

	public boolean run(ExtensionContext context)方法实现插件运行逻辑
	public int order()获得插件执行顺序 数字越大越先执行
	public String getPluginName()//获得插件执行名称
	
	
- src\main\resources\META-INF\services\com.yonyou.cloud.itf.PluginExtensionItf
文件的内容为实现PluginExtensionItf接口的类名