package com.rmrodrigues.network.wol;

import com.rmrodrigues.network.wol.exceptions.UnableToWakeUpWOLNodeException;

public class Main {

    public static void main(String[] args) throws UnableToWakeUpWOLNodeException {
        //广播地址是一个关键参数
        String broadcastAddress = NetUtil.getBroadcastAddress("10.6.6.133", "255.255.255.0");

        WOLNode node = new WOLNode("F875A4156DF4", broadcastAddress, 7);
        node.wakeUP();

        System.out.printf("broadcast:%s", broadcastAddress);
    }
}
