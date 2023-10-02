package com.example.checkyradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var chk : CheckBox
    lateinit var btnPulsame : Button
    lateinit var txtNumero : TextView
    lateinit var edNumero : EditText
    lateinit var rb1 : RadioButton
    lateinit var rb2 : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chk=findViewById(R.id.chk1)
        btnPulsame=findViewById(R.id.btnPulsame)
        txtNumero=findViewById(R.id.txtNumero)
        edNumero=findViewById(R.id.edNumero)
        rb1=findViewById(R.id.rb1)
        rb2=findViewById(R.id.rb2)

        btnPulsame.setOnClickListener {
            Log.d("ACSCO", "Entro en Pulsame")

            if (chk.isChecked){
                Toast.makeText(this, "Check Box Seleccionado", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Check Box No seleccionado", Toast.LENGTH_SHORT).show()
            }
            if (rb1.isChecked){
                edNumero.setText("Opción 1 seleccionada")
            }
            if (rb2.isChecked){
                edNumero.setText("Opción 2 seleccionada")
            }
        }

        chk.setOnClickListener{
            if (chk.isChecked){
                chk.text="Seleccionado"
            }
            else{
                chk.text="No Seleccionado"            }
        }
    }
}