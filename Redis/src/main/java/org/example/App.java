package org.example;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Jedis jedis = new Jedis("localhost");
        System.out.println("Метод для добавления словаря");
        System.out.println(jedis.hset("TestSetKey","Field","Value"));
        System.out.println(jedis.hset("TestSetKey","another", "testvalue"));

        System.out.println(jedis.hget("TestSetKey","Field"));
        System.out.println(jedis.hgetAll("TestSetKey"));

        Map<String, String> fields = jedis.hgetAll("TestSetKey");


        for (String field : fields.keySet()){
            System.out.println(field);
        }

        System.out.println(fields.get("another"));

        System.out.println(jedis.del("TestSetKey"));


    }
}
