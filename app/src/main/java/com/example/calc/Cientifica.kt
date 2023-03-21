package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.mariuszgromada.math.mxparser.Expression


//class Cientifica : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cientifica)
//    }
//}

//sen, cos , tan ( ), raíz cuadrada , exponencial

class Cientifica : CalcLayout() {


    lateinit var botonParentesisIzq: Button
    lateinit var botonParentesisDer: Button

    lateinit var botonSen: Button
    lateinit var botonCos: Button
    lateinit var botonTan: Button
    lateinit var botonRaizCuadrada: Button
    lateinit var botonExp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cientifica)

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
        botonPunto = this.findViewById(R.id.button36)

        botonBorrar = this.findViewById(R.id.button)

        botonParentesisIzq = this.findViewById(R.id.button13)
        botonParentesisDer = this.findViewById(R.id.button14)

        botonSen = this.findViewById(R.id.button34)
        botonCos = this.findViewById(R.id.button2)
        botonTan = this.findViewById(R.id.button3)
        botonRaizCuadrada = this.findViewById(R.id.button4)
        botonExp = this.findViewById(R.id.button5)


        boton7.setOnClickListener{
            if(resultado.text.toString() == "0"){
                resultado.setText("7")
            }
            else {
                resultado.setText(resultado.text.toString() + "7")
            }
        }
        boton8.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("8")
            }
            else {
                resultado.setText(resultado.text.toString() + "8")
            }
        }

        boton9.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("9")
            }
            else {
                resultado.setText(resultado.text.toString() + "9")
            }
        }

        boton6.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("6")
            }
            else {
                resultado.setText(resultado.text.toString() + "6")
            }
        }

        boton5.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("5")
            }
            else {
                resultado.setText(resultado.text.toString() + "5")
            }
        }

        boton4.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("4")
            }
            else {
                resultado.setText(resultado.text.toString() + "4")
            }
        }

        boton3.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("3")
            }
            else {
                resultado.setText(resultado.text.toString() + "3")
            }
        }

        boton2.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("2")
            }
            else {
                resultado.setText(resultado.text.toString() + "2")
            }
        }

        boton1.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("1")
            }
            else {
                resultado.setText(resultado.text.toString() + "1")
            }
        }

        boton0.setOnClickListener{

            

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

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "+")
            }
        }

        botonRestar.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "-")
            }
        }

        botonMultiplicar.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "*")
            }
        }

        botonDivision.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + "/")
            }
        }

        botonPunto.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + ".")
            }
        }

        botonIgual.setOnClickListener{

            

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                val expression = Expression(resultado.getText().toString())

                resultado.setText(expression.calculate().toString())
            }
        }
        // REVISAR
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

        botonParentesisIzq.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("(")
            }
            else {
                resultado.setText(resultado.text.toString() + "(")
            }
        }

        botonParentesisDer.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("0")
            }
            else {
                resultado.setText(resultado.text.toString() + ")")
            }
        }

        botonSen.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("sin(")
            }
            else {
                resultado.setText(resultado.text.toString() + "sin(")
            }
        }

        botonCos.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("cos(")
            }
            else {
                resultado.setText(resultado.text.toString() + "cos(")
            }
        }

        botonTan.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("tan(")
            }
            else {
                resultado.setText(resultado.text.toString() + "tan(")
            }
        }

        botonRaizCuadrada.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("sqrt(")
            }
            else {
                resultado.setText(resultado.text.toString() + "sqrt(")
            }
        }

        botonExp.setOnClickListener{

            if(resultado.text.toString() == "0"){
                resultado.setText("^")
            }
            else {
                resultado.setText(resultado.text.toString() + "^")
            }
        }

        
    }
}