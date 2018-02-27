package com.javasampleapproach.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ComponentScan("com.javasampleapproach.redis")
public class RedisConfig {

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		
		  System.out.println("manindra 123");
		  JedisConnectionFactory factory = new JedisConnectionFactory();
		  factory.setHostName("172.16.22.1");
		  factory.setPort(6379);
		  factory.setUsePool(true);
		  JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
	      jedisPoolConfig.setMaxTotal(20);
	      jedisPoolConfig.setMaxIdle(10);
	      factory.setPoolConfig(jedisPoolConfig);
		  System.out.println("manindra 456");
		  return factory;
		
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		System.out.println("manindra 678");
		final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setEnableTransactionSupport(true);
		template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		System.out.println("manindra 943");
		return template;
	}
}
