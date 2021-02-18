const val exitMenu: Int = 3

fun main(args: Array<String>) {
    var responseMenu: Int
    do{
        responseMenu = menu()
        when(responseMenu){
            1 -> println("Escogio 1")
            2 -> println("Escogio 2")
            3 -> println("Saliendo... \nGracias!")
            else -> println("*** La opcion ingresada no es valida ***")
        }
    }while(!responseMenu.equals(exitMenu))
}


fun menu(): Int {
    val responseNum : Int
    val menu ="""
    :: Bienvenido a Recipe Maker ::
                 
    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    """.trimIndent()

    // print menu and read the answer
    println(menu)
    val response:String = readLine() ?: ""

    responseNum = try {
        response.toInt()
    } catch (e:NumberFormatException){
        -1
    }
    return responseNum
}