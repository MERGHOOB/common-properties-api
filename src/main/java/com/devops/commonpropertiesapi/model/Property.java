package com.devops.commonpropertiesapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "properties") // Spring data mongoDB: Maps this class to a MangoDB collection "properties"
@CompoundIndex(def = "{'entity': 1, 'entityId': 1, 'key': 1}", unique = true) // ensure uniqueness of the combination
public class Property {

	@Id   //Spring data MongoDB: mark the following fields as a primary key
	private String id;  //MongoDB uses String IDs by default

	private String entity;  // user, company, feature
	private String entityId; // user-xyz, siemens, dark-toggle-button
	private String key;  //"theme", "notificationsEnabled", "circuitBreakerState"
	private String value; // the actual property value; can be stored as a string (can be JSON, boolean, number, etc.)


}
