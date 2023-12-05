package com.test.springboot.restaurants.services

import com.test.springboot.restaurants.entities.Neighbor
import com.test.springboot.restaurants.repo.NeighborRepo
import javax.inject.Inject;
import org.springframework.stereotype.Service

@Service
class NeighborService {

    @Inject  //@Autowired
    lateinit var repo : NeighborRepo

    fun getAllNeighborhoods(): MutableList<Neighbor> = repo.findAll()

}