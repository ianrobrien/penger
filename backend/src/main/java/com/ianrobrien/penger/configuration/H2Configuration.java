package com.ianrobrien.penger.configuration;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;

@Configuration
@Profile("dev")
public class H2Configuration {

  @Bean
  public Server h2TcpServer() throws SQLException {
    return Server.createTcpServer().start();
  }

  @Bean
  public Server h2WebServer() throws SQLException {
    return Server.createWebServer().start();
  }

}
