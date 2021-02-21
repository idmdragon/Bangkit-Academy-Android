fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )
    val ibuKota = mapOf(
        "Jatim" to "Surabaya",
        "Jabar" to "Bandung"
    )
    println(ibuKota.values)
    println(ibuKota.getValue("Jabar"))

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}