package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

open class CalcLayout : AppCompatActivity() {

    lateinit var resultado: TextView
    lateinit var botonC: Button
    lateinit var botonDivision: Button
    lateinit var botonMultiplicar: Button
    lateinit var botonRestar: Button
    lateinit var botonSumar: Button
    lateinit var botonIgual: Button

    lateinit var boton7: Button
    lateinit var boton8: Button
    lateinit var boton9: Button
    lateinit var boton5: Button
    lateinit var boton6: Button
    lateinit var boton4: Button
    lateinit var boton3: Button
    lateinit var boton2: Button
    lateinit var boton1: Button
    lateinit var boton0: Button

    lateinit var botonBorrar: Button
    lateinit var botonPunto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_layout)

        resultado = this.findViewById(R.id.textView2)
        botonC = this.findViewById(R.id.button11)
        botonDivision = this.findViewById(R.id.button22)
        botonMultiplicar = this.findViewById(R.id.button15)
        botonRestar = this.findViewById(R.id.button28)
        botonSumar = this.findViewById(R.id.button33)
        botonIgual = this.findViewById(R.id.button37)

        boton7 = this.findViewById(R.id.button23)
        boton8 = this.findViewById(R.id.button19)
        boton9 = this.findViewById(R.id.button20)
        boton5 = this.findViewById(R.id.button24)
        boton6 = this.findViewById(R.id.button27)
        boton4 = this.findViewById(R.id.button18)
        boton3 = this.findViewById(R.id.button32)
        boton2 = this.findViewById(R.id.button31)
        boton1 = this.findViewById(R.id.button30)
        boton0 = this.findViewById(R.id.button35)

        botonBorrar = this.findViewById(R.id.button34)

        botonPunto = this.findViewById(R.id.button36)

        boton7.setOnClickListener{
            if(resultado.text.toString() == "0"){
                resultado.setText("7")
            }
            else {
                resultado.setText(resultado.text.toString() + "7")
            }
        }
        boton8.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("8")
            }
            else {
                resultado.setText(resultado.text.toString() + "8")
            }
        }

        boton9.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("9")
            }
            else {
                resultado.setText(resultado.text.toString() + "9")
            }
        }

        boton6.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("6")
            }
            else {
                resultado.setText(resultado.text.toString() + "6")
            }
        }

        boton5.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("5")
            }
            else {
                resultado.setText(resultado.text.toString() + "5")
            }
        }

        boton4.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("4")
            }
            else {
                resultado.setText(resultado.text.toString() + "4")
            }
        }

        boton3.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("3")
            }
            else {
                resultado.setText(resultado.text.toString() + "3")
            }
        }

        boton2.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("2")
            }
            else {
                resultado.setText(resultado.text.toString() + "2")
            }
        }

        boton1.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("1")
            }
            else {
                resultado.setText(resultado.text.toString() + "1")
            }
        }

        boton0.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "0")
            }
        }

        botonC.setOnClickListener{

            resultado.setText("0")
        }


        botonSumar.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "+")
            }
        }

        botonRestar.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "-")
            }
        }

        botonMultiplicar.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "*")
            }
        }

        botonDivision.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "/")
            }
        }

        botonPunto.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + ".")
            }
        }

        botonIgual.setOnClickListener{

            //resultado.setText("7")

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                val expression = Expression(resultado.getText().toString())

                resultado.setText(expression.calculate().toString())
            }
        }

        botonBorrar.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else if(resultado.text.toString().length == 1){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString().substring(0, resultado.text.toString().length - 1))
            }


        }
    }
}