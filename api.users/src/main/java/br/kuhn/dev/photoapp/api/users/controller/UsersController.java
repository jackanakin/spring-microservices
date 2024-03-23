package br.kuhn.dev.photoapp.api.users.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String serverName;

    @GetMapping("/status/check")
    public String status() throws UnknownHostException {
        LocalDateTime now = LocalDateTime.now();

        StringBuilder sb = new StringBuilder();

        sb.append("/users api working");
        sb.append(" at ");
        sb.append(serverName + ":" + InetAddress.getLocalHost().getHostName());
        sb.append(" on ");
        sb.append(now.toString());

        return sb.toString();
    }
}
