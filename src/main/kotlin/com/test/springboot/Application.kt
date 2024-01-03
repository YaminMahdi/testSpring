package com.test.springboot

import com.mongodb.*
import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import com.test.springboot.restaurants.entities.Neighbor
import com.test.springboot.restaurants.repo.NeighborRepo
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.runBlocking
import org.bson.BsonInt64
import org.bson.Document
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@SpringBootApplication
//@EnableAutoConfiguration( exclude=[MongoAutoConfiguration::class] )
//@EnableMongoRepositories
class Application
fun main(args: Array<String>) {

	runApplication<Application>(*args)

//	runBlocking{
//		val connection = MongoClientConnection.setupConnection()
//		if(connection != null)
//			listAllCollection(connection)
//	}
}

suspend fun listAllCollection(database: MongoDatabase) {
	database.getCollection<Neighbor>("neighborhoods")
	val count = database.listCollectionNames().count()
	println("Collection count $count")

	print("Collection in this database are -----------> ")
	database.listCollectionNames().collect { print(" $it") }
}





