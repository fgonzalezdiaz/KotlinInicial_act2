package com.example.kotlininicial
data class Persona(val name : String, val age : Int, val entreteniments : List<String>)
fun botDeSeguretat(persona1 : Persona) : Boolean{
    if(persona1.name != "Francisco") return false;
    println("Exito")

    if(persona1.age in 0..17) {
        println("Es menor d'edat")
        return false
    } else if (persona1.age in 65..100){
        println("Es massa gran")
        return false
    }
    println("Exito")

    for(i in persona1.entreteniments){
            print(i + " ")
    }
    println()
    return true
}
fun main(){
    val persona1 = Persona("Francisco", 20, listOf("Gimnas", "Musica", "Festa"))
    if(botDeSeguretat(persona1) == true){
        print("TOT CORRECTE")
    } else {
        print("Acces denegat")
    }
}