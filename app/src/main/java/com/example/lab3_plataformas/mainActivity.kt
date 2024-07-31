//Fernando Ruíz
//Lab 3 Plataformas Móviles
//Carné 23065

package com.example.lab3_plataformas

//TASK 1
abstract class Food(val name: String, val price: Double) {
    abstract fun cook(): String
}

//TASK 2
class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "How to cook a burger: " +
                "1. Preheat an outdoor grill for high heat and lightly oil grate.\n" +
                "2. Whisk together egg, salt, and pepper in a medium bowl. ...\n" +
                "3. Add ground beef and bread crumbs and mix with your hands or a fork until well blended. ...\n" +
                "4. Form into four 3/4-inch-thick patties. ...\n" +
                "5. Place patties on the preheated grill. ...\n" +
                "6. Serve hot and enjoy!"
    }
}

class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "How to cook a pizza: " +
                "1. Make Dough: Mix flour, yeast, salt, and water. Knead and let rise.\n" +
                "2. Shape Dough: Roll out the dough.\n" +
                "3. Add Sauce: Spread tomato sauce.\n" +
                "4. Add Toppings: Sprinkle cheese and add toppings.\n" +
                "5. Bake: Preheat oven to 475°F (245°C) and bake for 10-15 minutes.\n" +
                "6. Serve: Slice and enjoy!"
    }
}

//TASK 3
interface Dessert {
    fun eat(): String
}

//TASK 4
class IceCream(name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "How to freeze ice cream: " +
                "1. Mix Ingredients: Combine milk, cream, sugar, and flavorings.\n" +
                "2. Chill Mixture: Refrigerate until cold.\n" +
                "3. Churn: Pour into an ice cream maker and churn.\n" +
                "4. Freeze: Transfer to a container and freeze until firm.\n" +
                "5. Serve: Scoop into bowls.\n" +
                "6. Enjoy: Eat and savor!"
    }

    override fun eat(): String {
        return "How to eat ice cream: " +
                "1. Scoop: Scoop the ice cream into a bowl or cone.\n" +
                "2. Hold: Hold the bowl or cone.\n" +
                "3. Lick/Bite: Lick or bite the ice cream.\n" +
                "4. Taste: Savor the flavor.\n" +
                "5. Repeat: Continue until finished.\n" +
                "6. Enjoy: Relish the treat!"
    }
}

//TASK 5
abstract class Drink(name: String, price: Double) : Food(name, price) {
    abstract fun pour(): String
}

//TASK 6
class Juice(name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "How to pour juice: " +
                "1. Pick: Pick up the juice container.\n" +
                "2. Position: Hold it above a glass.\n" +
                "3. Tilt: Tilt the container.\n" +
                "4. Pour: Pour juice into the glass.\n" +
                "5. Stop: Stop when the glass is full.\n" +
                "6. Serve: Enjoy your juice!"
    }

    override fun cook(): String {
        return "How to make juice: " +
                "1. Cut: Cut the fruit in half.\n" +
                "2. Position: Place the fruit on a juicer.\n" +
                "3. Press: Press and twist the fruit.\n" +
                "4. Collect: Collect the juice in a container.\n" +
                "5. Strain: Strain the juice if needed.\n" +
                "6. Serve: Pour into a glass and enjoy!"
    }
}

//TASK 7
fun Food.discountedPrice(discountPercentage: Double): Double {
    return this.price * (1 - discountPercentage / 100)
}

fun main() {
    //TASK 8
    val burger = Burger("Burger", 5.0)
    val pizza = Pizza("Pizza", 10.0)
    val iceCream = IceCream("Ice cream", 7.0)
    val juice = Juice("Juice", 3.0)

    println(burger.cook())
    println()

    println(pizza.cook())
    println()

    println(iceCream.cook())
    println()

    println(juice.cook())
    println()

    //TASK 9
    println(iceCream.eat())
    println()

    //TASK 10
    println("Price with discount of the burger: ${burger.discountedPrice(10.0)}")
}
