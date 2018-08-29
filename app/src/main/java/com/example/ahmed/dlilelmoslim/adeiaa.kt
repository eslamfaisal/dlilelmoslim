package com.example.ahmed.dlilelmoslim

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_adeiaa.*


class adeiaa : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adeiaa)
        var arradieaa = arrayOf(
                "دعاء صلاة الاستخارة",
                "دعاء الهم والحزن",
                "الدعاء قبل الطعام",
                "الدعاء بعد الطعام",
                "دعاء السفر",
                "الدعاء عند الغضب",
                "دعاء دخول السوق"
        )

        adieaa.adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_activated_1,
                arradieaa)

        var estikarapray = Intent(this, estikarapray::class.java)
        var graive = Intent(this, graive::class.java)
        var beforeat  = Intent(this, beforeat::class.java)
        var aftereat = Intent(this, aftereat::class.java)
        var travilling = Intent(this, travilling::class.java)
        var angery = Intent(this, angery::class.java)
        var entermarket = Intent(this, entermarket::class.java)

        adieaa.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> startActivity(estikarapray)
                1 -> startActivity(graive)
                2 -> startActivity(beforeat)
                3 -> startActivity(aftereat)
                4 -> startActivity(travilling)
                5 -> startActivity(angery)
                6 -> startActivity(entermarket)

            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.main,menu)
        return true


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.back ->{
                Toast.makeText(this,"لا إله لا الله", Toast.LENGTH_SHORT).show()
                var int = Intent(this, MainActivity::class.java)
                startActivity(int)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
