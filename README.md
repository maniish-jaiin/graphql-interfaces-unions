# graphql-interfaces-unions

This is bare minimum implementation of GraphQL with Spring Boot.

### Running the app
Clone the repository:
```$ git clone git@github.com:maniish-jaiin/graphql-interfaces-unions.git```

Change directory into the cloned repo and run the application.

```
$ cd graphql-interfaces-unions
$ ./gradlew bootRun
```

Once the application is up and running, go to `http://localhost:8080/playground`

## Query
It support one query names `getVehicles`

You can trigger this query in the playground console.

```query{
  getVehicles{
    ... on Car{
      name
      price
      engineType
    }
    ... on Bike{
      name
      price
    }
  }
}```

Response

```{
  "data": {
    "getVehicles": [
      {
        "name": "BMW X1",
        "price": 45000,
        "engineType": "PETROL"
      },
      {
        "name": "Ducati",
        "price": 90000
      }
    ]
  }
}```
