package com.example.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@ConfigurationProperties(prefix = "connection")
public class ValueDemo2 {

    private String username;
    private String remoteAddress;
    private String password ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PostConstruct
    public void run2(){
        System.out.println("===username======"+username);
        System.out.println("===remoteAddress======"+remoteAddress);
        System.out.println("===password======"+password);
    }


}
