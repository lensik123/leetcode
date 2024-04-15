package org.example;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class ClientNode {
    static HazelcastInstance hazeclient;
    static Map<Long,String> map;
    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        GroupConfig groupConfig = clientConfig.getGroupConfig();
        groupConfig.setName("dev");
        groupConfig.setPassword("dev-pass");

        hazeclient = HazelcastClient.newHazelcastClient(clientConfig);
        map = hazeclient.getMap("data");

        for (Map.Entry<Long,String> entry : map.entrySet()){
            System.out.println("Key" + entry.getKey() + " value" + entry.getValue());
        }
    }

}
