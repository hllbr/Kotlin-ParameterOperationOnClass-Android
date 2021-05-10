package com.hllbr.parameteroperationonclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val homer = Simpson()//Constructor eklediğim için bu şekilde ifade edemem
        homer.age = 50
        homer.job = "Nuclear"
        homer.name = "Homer Simpson"*/
        val homer = Simpson(50,"Homer Simpson","Nuclear")
        println(homer.age)
        homer.age = 65
        println(homer.age)
        homer.hairColor = "Yellow"

        println(homer.hairColor)
        homer.changedHairColor()
        println(homer.hairColor)
        /*
        Direkt obje oluşturlduğunda gerekli parametreleri girerek harcanan eforu azami seviyeye indirme imkanım bulunuyor

         */
    }
}