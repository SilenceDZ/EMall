package com.emall.utils;

public class WebUtils {
	/**
	 * @Title:parseInt
	 * @Description:将字符串数据转换为int类型
	 * @param str 要转换的字符串
	 * @param def 默认值
	 * @return int
	 * @throws 
	 */
	public static int parseInt(String str,int def){
		int result=def;
		try{
			result=Integer.parseInt(str);			
		}catch(Exception e){
			return def;
		}
		return result;
	}
	/**
	 * @Title:isEmpty
	 * @Description:判断字符串是否为空
	 * @param str 要判断的字符串
	 * @return true为空,false不为空
	 * @throws
	 */
	public static boolean isEmpty(String str){
		if(str==null||"".equals(str)){
			return true;
		}
		return false;
	}
}
