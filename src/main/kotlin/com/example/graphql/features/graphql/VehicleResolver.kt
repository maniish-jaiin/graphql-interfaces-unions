package com.example.graphql.features.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.graphql.features.model.Vehicle
import com.example.graphql.features.service.VehicleService
import org.springframework.stereotype.Component

@Component
class VehicleResolver(private val vehicleService: VehicleService) : GraphQLQueryResolver {
    fun getVehicles(): List<Vehicle> {
        return vehicleService.getVehicles()
    }
}