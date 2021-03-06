const    val opcion1 :String = "Hacer una Receta"
const    val opcion2 : String = "Ver mis recetas"
const    val opcion3 : String ="Salir"


fun main(args: Array<String>)
{
    val opciones = """
 **    :: Bienvenido a Recipe Maker ::
 **       Selecciona la opción deseada
 **       1. Hacer una Receta
 **       2. Ver mis recetas
 **       3. Salir
        
    """.trimIndent()


     do {
         println (opciones.trimMargin("**"))

         val response: String? = readLine()
        when (response){
            "1"-> {
                println("Seleccionaste :$opcion1")
            }

            "2" -> {
                println("Seleccionaste :$opcion2")
                var recetas = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

                for ((index,recetaindividual) in recetas.withIndex() )
                {
                    println("${index.plus(1)}.$recetaindividual")
                }
            }

            "3"  -> {
                println("Seleccionaste :$opcion3")
            }

            else -> {
                println("Opcion no valida")
            }


        }

    }while (!response.equals("3") )
}
