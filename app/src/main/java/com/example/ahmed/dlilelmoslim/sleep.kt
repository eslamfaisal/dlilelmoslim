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
import kotlinx.android.synthetic.main.activity_sleep.*


class sleep : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep)
        txtreapetalhmd2.setOnClickListener {
            reapet(txtreapetnumalhmd2,txtreapetnumalhmd2,txtalhmd2,txtreapetalhmd2,z)
        }
        txtreapetalhmd3.setOnClickListener {
            reapet(txtreapetnumalhmd3,txtreapetnumalhmd3,txtalhmd3,txtreapetalhmd3,x)
        }
        txtreapetalhmd4.setOnClickListener {
            reapet(txtreapetnumalhmd4,txtreapetnumalhmd4,txtalhmd4,txtreapetalhmd4,y)
        }
        txtreapetalhmd5.setOnClickListener {
            reapet(txtreapetnumalhmd5,txtreapetnumalhmd5,txtalhmd5,txtreapetalhmd5,w)
        }
        txtreapetalhmd6.setOnClickListener {
            reapet(txtreapetnumalhmd6,txtreapetnumalhmd6,txtalhmd6,txtreapetalhmd6,v)
        }
        txtreapetalhmd7.setOnClickListener {
            reapet(txtreapetnumalhmd7,txtreapetnumalhmd7,txtalhmd7,txtreapetalhmd7,u)
        }
        txtreapetalhmd8.setOnClickListener {
            reapet(txtreapetnumalhmd8,txtreapetnumalhmd8,txtalhmd8,txtreapetalhmd8,t)
        }
        txtreapetalhmd9.setOnClickListener {
            reapet(txtreapetnumalhmd9,txtreapetnumalhmd9,txtalhmd9,txtreapetalhmd9,s)
        }
        txtreapetalhmd10.setOnClickListener {
            reapet(txtreapetnumalhmd10,txtreapetnumalhmd10,txtalhmd10,txtreapetalhmd10,r)
        }
        txtreapetalhmd11.setOnClickListener {
            reapet(txtreapetnumalhmd11,txtreapetnumalhmd11,txtalhmd11,txtreapetalhmd11,q)
        }
        txtreapetalhmd12.setOnClickListener {
            reapet(txtreapetnumalhmd12,txtreapetnumalhmd12,txtalhmd12,txtreapetalhmd12,p)
        }
        txtreapetalhmd13.setOnClickListener {
            reapet(txtreapetnumalhmd13,txtreapetnumalhmd13,txtalhmd13,txtreapetalhmd13,o)
        }
        txtreapetalhmd14.setOnClickListener {
            reapet(txtreapetnumalhmd14,txtreapetnumalhmd14,txtalhmd14,txtreapetalhmd14,n)
        }

        fun font(tx:TextView){
            tx.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        }
        font(txtalhmd2)
        font(txtalhmd3)
        font(txtalhmd4)
        font(txtalhmd5)
        font(txtalhmd6)
        font(txtalhmd7)
        font(txtalhmd8)
        font(txtalhmd9)
        font(txtalhmd10)
        font(txtalhmd11)
        font(txtalhmd12)
        font(txtalhmd13)
        font(txtalhmd14)


    }
    private fun reapet (txtsize:TextView, txtnum:TextView, txtstr:TextView, txtreapetL:TextView, ts: LinearLayout){

        var size = Integer.parseInt(txtsize.text.toString())
        size--
        txtnum.text = size .toString()
        if (size == 0){
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

        var s = Integer.parseInt(size.text.toString())
        when(item?.itemId){
            R.id.goback ->{
                Toast.makeText(this,"اللهم تب علي", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin ->{
                s++
                if (s > 30){
                    s = 30
                    Toast.makeText(this,"لا يمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtalhmd2.textSize = s.toFloat()
                txtalhmd3.textSize = s.toFloat()
                txtalhmd4.textSize = s.toFloat()
                txtalhmd5.textSize = s.toFloat()
                txtalhmd6.textSize = s.toFloat()
                txtalhmd7.textSize = s.toFloat()
                txtalhmd8.textSize = s.toFloat()
                txtalhmd9.textSize = s.toFloat()
                txtalhmd10.textSize = s.toFloat()
                txtalhmd11.textSize = s.toFloat()
                txtalhmd12.textSize = s.toFloat()
                txtalhmd13.textSize = s.toFloat()
                txtalhmd14.textSize = s.toFloat()
            }
            R.id.zoomout ->{
                s--
                if (s < 16){
                    s = 16
                    Toast.makeText(this,"لا يمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtalhmd2.textSize = s.toFloat()
                txtalhmd3.textSize = s.toFloat()
                txtalhmd4.textSize = s.toFloat()
                txtalhmd5.textSize = s.toFloat()
                txtalhmd6.textSize = s.toFloat()
                txtalhmd7.textSize = s.toFloat()
                txtalhmd8.textSize = s.toFloat()
                txtalhmd9.textSize = s.toFloat()
                txtalhmd10.textSize = s.toFloat()
                txtalhmd11.textSize = s.toFloat()
                txtalhmd12.textSize = s.toFloat()
                txtalhmd13.textSize = s.toFloat()
                txtalhmd14.textSize = s.toFloat()
            }
        }


        return super.onOptionsItemSelected(item)
    }
}
