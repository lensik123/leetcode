package org.example;

import com.hazelcast.core.*;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class ServerNode
{
    public static void main( String[] args )
    {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        Map<Long, String> map = hazelcastInstance.getMap("data");
        IdGenerator idGenerator = hazelcastInstance.getIdGenerator("newid");
        for (int i = 0; i < 20; i++){
            map.put(idGenerator.newId(), "message" + i);
        }

        System.out.println("turpal");

    }
}
