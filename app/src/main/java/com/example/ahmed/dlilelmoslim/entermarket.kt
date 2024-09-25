package com.example.ahmed.dlilelmoslim

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_entermarket.*


class entermarket : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entermarket)

        txtinout.text = "لا إله إلا الله وحده لا شريك له، له الملك وله الحمد يحيي ويميت وهو حي لا يموت، بيده الخير كله وهو على كل شيء قدير\n"

        txtreapetinout.setOnClickListener {
            reapet(txtreapetnuminout,txtreapetnuminout,txtinout,txtreapetinout,yx)
            Toast.makeText(this, "أستغفر الله العظيم", Toast.LENGTH_SHORT).show()
            finish()
        }

        txtinout.typeface = Typeface.createFromAsset(assets,"fo.ttf")

    }
    private fun reapet(txtsize: TextView,
                       txtnum: TextView,
                       txtstr: TextView,
                       txtreapetL: TextView,
                       ts: LinearLayout) {

        var size = Integer.parseInt(txtsize.text.toString())
        size--
        txtnum.text = size.toString()
        if (size == 0) {
            txtstr.visibility = View.GONE
            txtnum.visibility = View.GONE
            txtreapetL.visibility = View.GONE
            ts.visibility = View.GONE

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.menu,menu)
        return true


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var txtinout = findViewById<TextView>(R.id.txtinout)
        var size = findViewById<TextView>(R.id.size)
        var s = Integer.parseInt(size.text.toString())

        when (item?.itemId) {
            R.id.goback -> {
                Toast.makeText(this, "أستغفر الله العظيم", Toast.LENGTH_SHORT).show()
              finish()
            }
            R.id.zoomin -> {
                s++
                if (s > 30) {
                    s = 30
                    Toast.makeText(this, "لايمكن التكبير أكثر", Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtinout.textSize = s.toFloat()
            }
            R.id.zoomout -> {
                s--
                if (s < 16) {
                    s = 16
                    Toast.makeText(this, "لايمكن التصغير أكثر", Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtinout.textSize = s.toFloat()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
