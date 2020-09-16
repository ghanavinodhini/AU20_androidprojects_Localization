package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingsTextView:TextView
    var name = "Ghana"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingsTextView= findViewById(R.id.textView)
    }

//Anpass app to swedish and english
    //Anpassa layout-xml, kotlin kod, bilder
    //Added strings.xml greetings text

fun btn_pressed(view: View)
{
Log.d("!!!","Button pressed")
    greetingsTextView.text = getString(R.string.great_text,name)
}

    //en -  Great Ghana!!
    //sv - Bra Jobbat Ghana!!


}