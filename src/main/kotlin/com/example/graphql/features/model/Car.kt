package com.example.graphql.features.model

data class Car(override val name: String, val price: Int, val engineType: String) : Vehicle
