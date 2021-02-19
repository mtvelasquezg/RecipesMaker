const val exitMenu: Int = 3
const val exitIngredients: Int = 9
const val menu ="""
:: Bienvenido a Recipe Maker ::
             
Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir
"""

const val ingredients = """
:: Menu Ingredientes ::

Selecciona la opción deseada e ingrese la cantidad deseada
1. Agua
2. Leche
3. Carne
4. Verduras
5. Frutas
6. Cereal
7. Huevos
8. Aceite
9. Salir
"""

fun main(args: Array<String>) {
    var responseMenu: Int
    var responseIngredient: Int
    do{
        responseMenu = selectMenu()
        when(responseMenu){
            1 -> do {
                    responseIngredient =makeRecipe()
                }while (!responseIngredient.equals(exitIngredients))
            2 -> println(viewRecipe())
            3 -> println("Saliendo... \nGracias!")
            else -> println("*** La opcion ingresada no es valida ***")
        }
    }while(!responseMenu.equals(exitMenu))
}


fun selectMenu(): Int {
    val responseNum : Int

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

fun makeRecipe(): Int {
    val responseNum : Int

    // print ingredients and read the answer
    println(ingredients)
    val response:String = readLine() ?: ""

    responseNum = try {
        response.toInt()
    } catch (e:NumberFormatException){
        -1
    }

    return responseNum
}

fun viewRecipe(): String {
    return "Aun no puedes ver tus recetas, por favor intenta más tarde"
}