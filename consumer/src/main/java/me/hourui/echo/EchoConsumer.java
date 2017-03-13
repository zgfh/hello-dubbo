package me.hourui.echo;

import com.alibaba.dubbo.config.annotation.Reference;
import me.hourui.echo1.EchoService1;
import org.springframework.stereotype.Component;

/**
 * @author of2603 hourui
 * @date 2017-03-11
 */
@Component
public class EchoConsumer {

    @Reference(version = "1.0.0")
    private EchoService1 echoService1;

    public void test() {
        System.out.println(echoService1.echo("111111"));
    }

}
