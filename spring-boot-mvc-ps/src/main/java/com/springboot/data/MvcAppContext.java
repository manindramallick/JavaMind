/**
 * 
 */
package com.springboot.data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shivey.upadhyay
 *
 */
public class MvcAppContext {
	
	private Map<String, Object> hMap = null;
	
	private static MvcAppContext INSTANCE = null;
	
	private MvcAppContext() {
		hMap = new HashMap<String, Object>();
	}
	
	public static MvcAppContext getContext() {
		if(INSTANCE == null) {
			INSTANCE = new MvcAppContext();
		}
		return INSTANCE;
	}
	
	public void put(String key, Object value) {
		hMap.put(key, value);
	}
	
	public Object get(String key) {
		return hMap.get(key);
	}
	
	public void clear() {
		hMap.clear();
	}
}
