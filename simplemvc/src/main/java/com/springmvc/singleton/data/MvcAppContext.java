package com.springmvc.singleton.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MvcAppContext {
	
	private Map<String, Object> ctxMap = null;
	
	private static MvcAppContext instance = null;
	
	private MvcAppContext() {
		ctxMap = new HashMap<String, Object>();
	}
	
	public static MvcAppContext getContext() {
		if(instance == null) {
			instance = new MvcAppContext();
		}
		return instance;
	}
	
	public void put(String key, Object value) {
		ctxMap.put(key, value);
	}
	
	public Object get(String key) {
		return ctxMap.get(key);
	}

}
