package com.example.timestamp;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "kv", path = "kv")
public interface KeyValueRepository extends CrudRepository<KeyValue, Long> {
    
    // Prevent DELETE method
    @RestResource(exported = false)
    void deleteById(Long id);
    
    KeyValue findByKey(@Param("key") String key);
    List<KeyValue> findByValue(String value);
}
