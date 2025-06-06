package com.devops.commonpropertiesapi.repositories;

import com.devops.commonpropertiesapi.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface PropertyRepository extends MongoRepository<Property, String> {
	/**
	 * Finds a single property by its entity, entityId, and key.
	 * Spring Data automatically implements this based on the method name.

	 * @return An Optional containing the Property if found, or empty.
	 */
	Optional<Property> findByEntityAndEntityIdAndKey(String entity, String entityId, String key );

	/**
	 * @return a list containing the properties for the given entity and entityId
	 */
	List<Property> findByEntityAndEntityId(String entity, String entityId);

	
}
