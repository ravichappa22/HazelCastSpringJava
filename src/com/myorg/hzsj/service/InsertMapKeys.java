package com.myorg.hzsj.service;

import com.hazelcast.map.IMap;

import java.util.concurrent.TimeUnit;

public class InsertMapKeys {

  public void createMapandKeys() {

    HazelCacheClientConfig hazelCacheClientConfig = new HazelCacheClientConfig();
    IMap map = hazelCacheClientConfig.hazelcastInstance().getMap("rchappa1_WC");
    map.put("principle", "rchappa1", 30, TimeUnit.MINUTES);

  }
}
