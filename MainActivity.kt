package com.example.precios

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numerako:Int=0
        numerako++
        var contador:Int=0






        calculadora.setOnClickListener {
            //val cantidad:Double=visor.text.toString().toDouble()

            contador++
            val intent= Intent(this,Calculadora::class.java)
            //intent.putExtra(Konstantes.CANTIDAD,cantidad)
            startActivity(intent)



        }


            /*val valorqueguardo2:SharedPreferences=getSharedPreferences(Konstantes.CANTIDAD,Context.MODE_PRIVATE)
            visor.setText(valorqueguardo2.getString("valorstring",null))*/


            val mibundle:Bundle?=intent.extras
            val miresultado: String? =intent.getStringExtra(Konstantes.CANTIDAD)
            visor.setText(miresultado)

        grabar.setOnClickListener {
            var lacantidad:String=visor.text.toString()
            val valorqueguardo:SharedPreferences=getSharedPreferences(Konstantes.CANTIDAD,Context.MODE_PRIVATE)
            with(valorqueguardo.edit()){
                putString("valorstring",lacantidad).apply()
            }
        }




    }

}