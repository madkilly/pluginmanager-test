# pluginmanager-test

## testplugin 
ʾ����� �����򵥵���������������Բ���������Ƿ�����������

## testplugin2
ͬtestplugin�����΢�в��죬���Բ��ִ��˳��

## use-example
��������� ʹ��ʾ���� ͨ���������������ʾ�����


## ʹ��˵��

- ���������μ�testplugin�Ĵ���ṹ

- �����Ҫʵ��PluginExtensionItf�ӿ�

	public boolean run(ExtensionContext context)����ʵ�ֲ�������߼�
	public int order()��ò��ִ��˳�� ����Խ��Խ��ִ��
	public String getPluginName()//��ò��ִ������
	
	
- src\main\resources\META-INF\services\com.yonyou.cloud.itf.PluginExtensionItf
�ļ�������Ϊʵ��PluginExtensionItf�ӿڵ�����