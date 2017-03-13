package me.hourui.echo.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoImpl implements Echo {

    @Override
    public String echo(String str) {
        System.out.println("The consumer has connected here...");
        System.out.println("The consumer send somrthing here: " + str);
        return str;
    }

}
