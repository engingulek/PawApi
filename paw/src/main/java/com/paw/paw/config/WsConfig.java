/*package com.paw.paw.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer {
   @Override
   public void registerStompEndpoints(StompEndpointRegistry registry) {
          // message send
          // sunucu dinliyor
             registry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
   }

   
   @Override
   public void configureMessageBroker(MessageBrokerRegistry registry) {
          // message get
          // client dinliyor
           registry.enableSimpleBroker("/topic");
   }
}*/
