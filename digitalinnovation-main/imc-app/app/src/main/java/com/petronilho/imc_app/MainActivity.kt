package com.petronilho.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LifeCicle", "entrei no CREATE - estou criando a tela ")
    }
    override fun onStart(){
        super.onStart()
        Log.w("LifeCicle", "entrei no START - deixei a tela visivel para você")

    }

    override fun onResume() {
        super.onResume()
        Log.w("LifeCicle",  "entrei no RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifeCicle", "PAUSE - a tela perdeu o foco agora você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifeCicle" , "STOP - a tela bnão esta mais visível mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifeCicle", " \nRestart - a tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifeCicle", " \nDestroy - oh não a tela foi destroida")
    }
}