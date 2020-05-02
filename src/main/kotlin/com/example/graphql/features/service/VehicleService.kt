package com.example.graphql.features.service

import com.example.graphql.features.model.Bike
import com.example.graphql.features.model.Car
import com.example.graphql.features.model.Vehicle
import org.springframework.stereotype.Service

@Service
class VehicleService {
    fun getVehicles(): List<Vehicle> {
        return listOf(
                Car("BMW X1", 45000, "PETROL"),
                Bike("Ducati", 90000)
        )
    }
}