package edu.mayo.test;

import redis.clients.jedis.Jedis;

public class RedisString {

	public RedisString(){
	}

	public String testString(String host){
	    Jedis jedis = new Jedis(host);
	    String s = "";
	    System.out.println("Connection to server sucessfully");
		//Connecting to Redis server on localhost
	    //set the data in redis string
	    jedis.set("redis-key", "Redis Sample Connection");
	   // Get the stored data and print it
	   s = "Stored string in redis:: "+ jedis.get("redis-key");
	   return s;
	}

}
