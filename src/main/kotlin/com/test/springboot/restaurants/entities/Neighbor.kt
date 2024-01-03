package com.test.springboot.restaurants.entities

import org.bson.codecs.pojo.annotations.BsonProperty
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "neighborhoods")
data class Neighbor(
    val _id: ObjectId,
    @BsonProperty("geometry") val geometry: Geometry,
    @BsonProperty("name") val name: String
) {
    data class Geometry(
        @BsonProperty("coordinates") val coordinates: List<List<List<Double>>>,
        @BsonProperty("type") val type: String
    )
}