package sv.edu.udb.guia08app

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import sv.edu.udb.guia08app.datos.Persona


class AdaptadorPersona(private val context: Activity, var personas: List<Persona>) :
    ArrayAdapter<Persona?>(context, R.layout.persona_layout, personas) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        // Método invocado tantas veces como elementos tenga la coleccion personas
        // para formar a cada item que se visualizara en la lista personalizada
        val layoutInflater = context.layoutInflater
        var rowview: View? = null
        // optimizando las diversas llamadas que se realizan a este método
        // pues a partir de la segunda llamada el objeto view ya viene formado
        // y no sera necesario hacer el proceso de "inflado" que conlleva tiempo y
        // desgaste de bateria del dispositivo
        rowview = view ?: layoutInflater.inflate(R.layout.persona_layout, null)
        val tvNombre = rowview!!.findViewById<TextView>(R.id.tvNombre)
        val tvDUI = rowview.findViewById<TextView>(R.id.tvDUI)
        val tvFecha = rowview.findViewById<TextView>(R.id.tvFecha)
        val tvGenero = rowview.findViewById<TextView>(R.id.tvGenero)
        val tvPeso = rowview.findViewById<TextView>(R.id.tvPeso)
        val tvAltura = rowview.findViewById<TextView>(R.id.tvAltura)
        tvNombre.text = "Nombre : " + personas[position].nombre
        tvDUI.text = "DUI : " + personas[position].dui
        tvFecha.text = "DUI : " + personas[position].fecha
        tvGenero.text = "DUI : " + personas[position].genero
        tvPeso.text = "DUI : " + personas[position].peso
        tvAltura.text = "DUI : " + personas[position].altura
        return rowview
    }
}
