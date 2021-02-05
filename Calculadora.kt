package com.example.precios

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculadora.*

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        var kantidad:String="0.0"
        val trece2:Double=13.0
        val diez2:Double=10.0
        val domicilio2:Double=16.0
        val local2:Double=12.0
        val quince2:Double=15.0
        var resultado:Double
        var cantidad:Double=0.0
        cifra.setText(cantidad.toString())
        val valorguardado2=getSharedPreferences("cantidad",Context.MODE_PRIVATE)
        cifra.setText(valorguardado2.getString("valorguardado",null))

        trece.setOnClickListener {
                cantidad=cifra.text.toString().toDouble()
               resultado= cantidad.toDouble()+trece2
                kantidad=resultado.toString()
                cifra.setText(kantidad)
                guardocosas()
        }
        diez.setOnClickListener {
                cantidad=cifra.text.toString().toDouble()
                resultado=cantidad+diez2
                kantidad=resultado.toString()
                cifra.setText(resultado.toString())
                guardocosas()
        }

        domicilio.setOnClickListener {
                cantidad=cifra.text.toString().toDouble()
                resultado=cantidad+domicilio2
                kantidad=resultado.toString()
                cifra.setText(resultado.toString())
            guardocosas()
        }
        local.setOnClickListener {
                cantidad=cifra.text.toString().toDouble()
                resultado=cantidad+local2
                kantidad=resultado.toString()
                cifra.setText(resultado.toString())
            guardocosas()
        }
        quince.setOnClickListener {
                cantidad=cifra.text.toString().toDouble()
                resultado=cantidad+quince2
                kantidad=resultado.toString()
                cifra.setText(resultado.toString())
            guardocosas()

        }

            volver.setOnClickListener {
                val intent2= Intent(this,MainActivity::class.java)

                intent2.putExtra(Konstantes.CANTIDAD,cifra.text.toString())
                startActivityForResult(intent2,0)

            }

        reset.setOnClickListener {

            cifra.setText("0.0")
            guardocosas()
        }

    }
    fun guardocosas(){

        val valorguardado=getSharedPreferences("cantidad",Context.MODE_PRIVATE)
        with (valorguardado.edit()){
            putString("valorguardado",cifra.text.toString()).apply()

        }

    }
}