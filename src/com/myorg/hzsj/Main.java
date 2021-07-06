package com.myorg.hzsj;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;

public class Main {

    public static void main(String[] args) {
        //this creates embedded Hazel cast
        Config config = new Config();
        config.setInstanceName("webcapture");
        config.setClusterName("dev");
        Hazelcast.getOrCreateHazelcastInstance(config);
    }
}
