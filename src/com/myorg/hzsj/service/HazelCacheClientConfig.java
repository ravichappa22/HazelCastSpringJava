package com.myorg.hzsj.service;


import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

public class HazelCacheClientConfig {

  public HazelcastInstance hazelcastInstance() {

    ClientConfig clientConfig = new ClientConfig();
    clientConfig.getNetworkConfig().addAddress("host:port");
    clientConfig.setInstanceName("my-local-instance");
    clientConfig.setClusterName("my-local-cluster");
    return HazelcastClient.newHazelcastClient(clientConfig);

  }
}
