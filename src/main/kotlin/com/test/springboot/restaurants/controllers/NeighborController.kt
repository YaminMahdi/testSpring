package com.test.springboot.restaurants.controllers

import com.test.springboot.restaurants.entities.Neighbor
import com.test.springboot.restaurants.services.NeighborService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject


@RestController
@RequestMapping("/api/v1/restaurants")
class NeighborController {

    @Inject  //@Autowired
    lateinit var neighborService : NeighborService


    @GetMapping("/neighbor")
    fun getAllNeighborhoods() =
        ResponseEntity.ok(neighborService.getAllNeighborhoods())

}