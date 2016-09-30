package devCamp.WebApp;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisPoolConfig;
 
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {
 
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
    		JedisPoolConfig poolConfig = new JedisPoolConfig();
    		poolConfig.setMaxTotal(5);
    		poolConfig.setTestOnBorrow(true);
    		poolConfig.setTestOnReturn(true);
    		JedisConnectionFactory ob = new JedisConnectionFactory(poolConfig);
    		ob.setUsePool(true);
    		ob.setHostName("incidentcacheqv3jp6zfymlau.redis.cache.windows.net");
    		ob.setPort(6380);
    		ob.setPassword("In15/AeKlSCZjOILDb+Yp6+JMz1Q2igZBrvXeZkRAYg=");
    		return ob;
    	}
    	 
    @Bean(name="redisTemplate")
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(cf);
        return redisTemplate;
    }
 
    @Bean
    public CacheManager cacheManager() {
        return new RedisCacheManager(redisTemplate(redisConnectionFactory()));
    }
 
}


  