fun main(args: Array<String>) {
    println(texto())
}

fun texto(): Int {
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