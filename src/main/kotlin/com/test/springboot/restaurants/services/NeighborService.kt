package com.test.springboot.restaurants.services

import com.test.springboot.restaurants.entities.Neighbor
import com.test.springboot.restaurants.repo.NeighborRepo
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import javax.inject.Inject;
import org.springframework.stereotype.Service

@Service
class NeighborService {

    @Autowired  //@Autowired
    lateinit var repo : NeighborRepo

    fun getAllNeighborhoods(): MutableList<Neighbor> = repo.findAll()

    fun addNeighbor(neighbor: Neighbor): Neighbor = repo.insert(neighbor.copy(_id = ObjectId.get()))

}