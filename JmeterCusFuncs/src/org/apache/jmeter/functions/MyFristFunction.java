package org.apache.jmeter.functions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

public class MyFristFunction extends AbstractFunction{
	private static final List<String> desc = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> getArgumentDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
	
	

	@Override
	public String execute(SampleResult arg0, Sampler arg1) throws InvalidVariableException {
		// TODO Auto-generated method stub
		//本方法是提供一个在Jmeter函数助手显示的函数名称
		return "Jmeter高级技术交流群：572445436";
	}
	
	@Override
	public String getReferenceKey() {
		// TODO Auto-generated method stub
		//本方法是提供一个在Jmeter函数助手显示的函数名称
		return "CusStr";
	}

	@Override
	public void setParameters(Collection<CompoundVariable> arg0) throws InvalidVariableException {
		// TODO Auto-generated method stub
		//本方法是设置函数参数使用的！
		checkParameterCount(arg0, 0, 0);
	}
	

}
