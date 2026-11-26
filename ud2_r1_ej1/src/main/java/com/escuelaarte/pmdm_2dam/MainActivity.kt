package com.escuelaarte.pmdm_2dam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// TODO 2: modelo
data class Pelicula(val titulo: String, val anio: Int, val duracion: Int)

class MainActivity : AppCompatActivity() {

    // TODO 1: vistas
    private lateinit var etTitulo: EditText
    private lateinit var etAnio: EditText
    private lateinit var etDuracion: EditText
    private lateinit var btnAgregar: Button
    private lateinit var tvResumen: TextView
    private lateinit var lvPeliculas: ListView

    // TODO 2: datos y adaptador
    private val peliculas = mutableListOf<Pelicula>()
    private val filas = mutableListOf<String>()   // textos que ve el ListView
    private lateinit var adaptador: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1: findViewById de cada vista
        // etTitulo = findViewById(R.id.etTitulo)
        // ...

        // TODO 2: crear el adaptador con "filas" y asignarlo a lvPeliculas
        // adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, filas)
        // lvPeliculas.adapter = adaptador

        // TODO 3: evento del botón
        btnAgregar.setOnClickListener {
            // 1) leer los textos (trim al título)
            // 2) convertir año y duración con toIntOrNull()
            // 3) llamar a validarPelicula(...)
            // 4) si devuelve un mensaje: mostrar Toast y salir
            // 5) si devuelve null: peliculas.add(Pelicula(...)), limpiar campos
            // 6) actualizarPantalla()
        }

        // TODO 3: evento de pulsar una fila
        lvPeliculas.setOnItemClickListener { _, _, posicion, _ ->
            // peliculas.removeAt(posicion)
            // actualizarPantalla()
        }

        // TODO 5: pintar el estado inicial
        actualizarPantalla()
    }

    // TODO 3: devuelve el mensaje de error, o null si todo es correcto
    private fun validarPelicula(
        titulo: String, anio: Int?, duracion: Int?, existentes: List<Pelicula>
    ): String? {
        // título no vacío
        // anio no nulo y en 1900..2100
        // duracion no nula y en 1..500
        // título repetido: existentes.any { it.titulo.equals(titulo, true) }
        return null
    }

    // TODO 4: no toca widgets, recibe datos y devuelve resultado
    private fun duracionTotal(peliculas: List<Pelicula>): Int {
        return 0 // sumOf { it.duracion }
    }

    private fun formatearFila(p: Pelicula): String {
        return "" // "Título (año) · duración min"
    }

    // TODO 5: repinta lista y resumen
    private fun actualizarPantalla() {
        // filas.clear()
        // filas.addAll(peliculas.map { formatearFila(it) })
        // adaptador.notifyDataSetChanged()
        // tvResumen.text = "${peliculas.size} películas / ${duracionTotal(peliculas)} min"
    }
}
