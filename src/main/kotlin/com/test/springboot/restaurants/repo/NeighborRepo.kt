package com.test.springboot.restaurants.repo

import com.test.springboot.restaurants.entities.Neighbor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//@Repository
interface NeighborRepo : MongoRepository<Neighbor, String> {

//    fun getAllNeighborhoods() : List<Neighbor>
}