package me.hourui.echo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import me.hourui.echo.provider.Echo;
import org.springframework.stereotype.Component;

@Component
public class EchoConsumer {

    @Reference(version = "1.0.0")
    private Echo echo;

    public void test() {
        String name = "hello, world";
        System.out.println("I send something to provider: " + name);
        echo.echo(name);
    }

}
