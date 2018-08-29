package com.example.ahmed.dlilelmoslim

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.ahmed.dlilelmoslim.R.id.adieaa
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        athkar.setOnClickListener {
            var intent = Intent(this, com.example.ahmed.dlilelmoslim.athkar::class.java)
            startActivity(intent)
        }
        adieaa.setOnClickListener {
            var intent1 = Intent(this, adeiaa::class.java)
            startActivity(intent1)
        }
        bank.setOnClickListener {
            var int = Intent(this,com.example.ahmed.dlilelmoslim.bank::class.java)
            startActivity(int)
        }

        athkar.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        adieaa.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        bank.typeface = Typeface.createFromAsset(assets,"fo.ttf")

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.share,menu)
        return true

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.share ->{
             var intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT,"حمل الان تطبيق دليل المسلم " +
                        "\n" +
                        "حصنك من الاذكار والأدعية")
                intent.type = "type/plain"
                intent.type = "*/*"
                startActivity(Intent.createChooser(intent,"share the app"))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

