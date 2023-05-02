package com.example.aoug

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editAlcool: EditText
    private lateinit var editGasolina: EditText
    private lateinit var textResultado: TextView
    private lateinit var switchCalculo: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editAlcool = findViewById(R.id.editAlcool)
        editGasolina = findViewById(R.id.editGasolina)
        textResultado = findViewById(R.id.textResultado)
        switchCalculo = findViewById(R.id.switchCalculo)
    }

    fun calcularPreco(view: View?) {
        val precoAlcool = editAlcool.text.toString().toDouble()
        val precoGasolina = editGasolina.text.toString().toDouble()
        

        val resultado = precoAlcool / precoGasolina
        val variavelCalculo = if (switchCalculo.isChecked) 0.75 else 0.7

        if (resultado <= variavelCalculo) {
            textResultado.text = "Abasteça com Álcool"
        } else {
            textResultado.text = "Abasteça com Gasolina"
        }
    }
}
