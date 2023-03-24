package sv.edu.udb.guia08app.datos

class Persona {
    fun key(key: String?) {
    }

    var dui: String? = null
    var nombre: String? = null
    var fecha: String? = null
    var genero: String? = null
    var peso: Float? = null
    var altura: Float? = null
    var key: String? = null
    var per: MutableMap<String, Boolean> = HashMap()

    constructor() {}
    constructor(dui: String?, nombre: String?,fecha:String?,genero:String?,peso:Float?,altura:Float?) {
        this.dui = dui
        this.nombre = nombre
        this.fecha = fecha
        this.genero = genero
        this.peso = peso
        this.altura = altura
    }

    fun toMap(): Map<String, Any?> {
        return mapOf(
            "dui" to dui,
            "nombre" to nombre,
            "fecha" to fecha,
            "genero" to genero,
            "peso" to peso,
            "altura" to altura,
            "key" to key,
            "per" to per
        )
    }
}