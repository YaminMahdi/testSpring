package com.test.springboot.restaurants.controllers

import com.test.springboot.restaurants.entities.Neighbor
import com.test.springboot.restaurants.services.NeighborService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject


@RestController
@RequestMapping("/api/restaurants")
class NeighborController {

    @Autowired  //@Autowired
    lateinit var neighborService : NeighborService


    @GetMapping("/neighbor/all")
    fun getAllNeighborhoods() =
        neighborService.getAllNeighborhoods()

    @PostMapping("/neighbor/add")
    fun addNeighbor(@RequestBody neighbor: Neighbor) = neighborService.addNeighbor(neighbor)

}