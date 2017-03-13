package me.hourui.echo1;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author of2603 hourui
 * @date 2017-03-10
 */
@Service(version = "1.0.0")
public class EchoService1Impl implements EchoService1 {

    @Override
    public String echo(String str) {
        System.out.println("客户端连过来咯...");
        return str;
    }

}
