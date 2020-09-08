package com.example.memcached;

import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

public class Memcached {
    public static void main(String[] args) {
        try {


        MemcachedClient mt= new MemcachedClient(new InetSocketAddress("127.0.0.1",11211));
        System.out.println("连接成功");
        mt.flush();
       Future fo=mt.set("nan",1000,"huichideminzu");
       System.out.println(fo.get());
       System.out.println(mt.get("nan"));
       mt.append("nan","nanmimi");
       System.out.println(mt.get("nan"));
       mt.replace("nan",1000,"nanciacia");
       System.out.println(mt.get("nan"));


        mt.shutdown();
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }

}
