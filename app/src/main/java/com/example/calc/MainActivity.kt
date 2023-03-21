package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = this.findViewById(R.id.textSalida)
        boton = this.findViewById(R.id.pruebaButton)

        //traer botones 10 de calc
        //hacer layout
        boton.setOnClickListener{
            text.setText("🖖")
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)

        val inflater: MenuInflater = menuInflater
        //asi le pusimos en res
        inflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //return super.onOptionsItemSelected(item)
        return when (item.itemId){
            R.id.salir -> {
                exitProcess(0)
                true
            }
            R.id.acercade->{
                //instancia de la clase
                var intent = Intent(this,Acercade::class.java)
                startActivity(intent)
                true
            }
            R.id.calculadora->{
                var intent = Intent(this,CalcLayout::class.java)
                startActivity(intent)
                true
            }
            R.id.cientifica->{
                var intent = Intent(this,Cientifica::class.java)
                startActivity(intent)
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}