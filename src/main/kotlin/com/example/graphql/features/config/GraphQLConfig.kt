package com.example.graphql.features.config

import com.coxautodev.graphql.tools.SchemaParserDictionary
import com.example.graphql.features.model.Bike
import com.example.graphql.features.model.Car
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GraphQLConfig() {
    @Bean
    fun schemaParserDictionary(): SchemaParserDictionary {
        return SchemaParserDictionary()
                .add(Car::class)
                .add(Bike::class)
    }
}