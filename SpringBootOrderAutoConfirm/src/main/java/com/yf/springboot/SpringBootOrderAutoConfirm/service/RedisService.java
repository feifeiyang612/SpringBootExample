package com.yf.springboot.SpringBootOrderAutoConfirm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: YangFei
 * @Description:
 * @create: 2019-11-19 09:04
 */
@Service
public class RedisService {
    @Autowired
	RedisTemplate<String, Object> redisTemplate;

	public <T> boolean set(String key, T value) {
		ValueOperations<String, Object> operations = redisTemplate.opsForValue();
		operations.set(key, value);
		return true;
	}

	@SuppressWarnings("unchecked")
	public <T> T get(String key, Class<T> value) {
		ValueOperations<String, Object> operations = redisTemplate.opsForValue();
		return (T) operations.get(key);
	}

	public <T> boolean delete(String key) {
		Boolean ret = redisTemplate.delete(key);
		return (ret != null && ret );
	}

	@SuppressWarnings("unchecked")
	public <T> boolean addToSet(String key, T value) {
		BoundSetOperations<String, T> operations = (BoundSetOperations<String, T>)redisTemplate.boundSetOps(key);
		operations.add(value);
		return true;
	}

	public <T>boolean deleteFromSet(String key, T value) {
		BoundSetOperations<String, Object> operations = redisTemplate.boundSetOps(key);
		operations.remove(value);
		return true;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> getFromSet(String key, Class<T> valueClazz ) {
		BoundSetOperations<String, T> operations = (BoundSetOperations<String, T>)redisTemplate.boundSetOps(key);
		Set<T> mems = operations.members();
		return new ArrayList<T>(mems);
	}
}
