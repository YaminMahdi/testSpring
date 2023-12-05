package com.test.springboot


import com.mongodb.*
import org.bson.Document
import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import kotlinx.coroutines.flow.count
import org.bson.BsonInt64


object MongoClientConnection {

    var database: MongoDatabase? = null

    suspend fun setupConnection(databaseName: String = "sample_airbnb"): MongoDatabase? {
        // Replace the placeholders with your credentials and hostname
        val connectionString =
            "mongodb+srv://yamin_khan:yk00@testspring.ct8iosx.mongodb.net/?retryWrites=true&w=majority"

        val serverApi = ServerApi.builder()
            .version(ServerApiVersion.V1)
            .build()

        val mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(ConnectionString(connectionString))
            .serverApi(serverApi)
            .build()

        // Create a new client and connect to the server
        val mongoClient = MongoClient.create(mongoClientSettings)
        return try {
            database = mongoClient.getDatabase("sample_restaurants")
            // Send a ping to confirm a successful connection
            val command = Document("ping", BsonInt64(1))
            database?.runCommand(command)
            println("Pinged your deployment. You successfully connected to MongoDB!")
            database
        } catch (me: MongoException) {
            System.err.println(me)
            database = null
            null
        }

    }



}
