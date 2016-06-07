package edu.mayo.test;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class EnvironmentVariableTest {

	public EnvironmentVariableTest(){}
		
	public String printEVs(){
		
		String r = "";
		
		Map<String, String> envMap = System.getenv();
		SortedMap<String, String> sortedEnvMap = new TreeMap<String, String>(envMap);
		Set<String> keySet = sortedEnvMap.keySet();
		
		for (String key : keySet) {
			String value = envMap.get(key);
			// Build String for return
			r = r + "[" + key + "] " + value + "<br>";
		
		}
		return r;
	}

	public String getEV(){
		
		String r = "udev";
		
		Map<String, String> envMap = System.getenv();
		SortedMap<String, String> sortedEnvMap = new TreeMap<String, String>(envMap);
		Set<String> keySet = sortedEnvMap.keySet();
		
		for (String key : keySet) {
			String value = envMap.get(key);
			if (key.equalsIgnoreCase("DB_PORT_6379_TCP_ADDR")){
				r = value;
			}
			
		}
		return r;
	}
}