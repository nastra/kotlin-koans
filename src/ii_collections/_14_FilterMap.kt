package ii_collections

import java.util.stream.Collectors

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
    println(this.customers.map { it -> it.city }.toSet())
    return this.customers.stream().map { it -> it.city }.collect(Collectors.toSet())
}

fun Shop.getCustomersFromCity(city: City): List<Customer> {
    // Return a list of the customers who live in the given city
    return this.customers.filter { it.city.equals(city)}
}


