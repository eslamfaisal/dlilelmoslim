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
import kotlinx.android.synthetic.main.activity_graive.*


class graive : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graive)

        txtinout.text = "\" اللهم إني عبدك ابن عبدك ابن أمتك ناصيتي بيدك ، ماضِ في حكمك ، عدل في قضاؤك ، أسألك بكل اسم هو لك سميت به نفسك أو أنزلته في كتابك ، أو علمته أحداً من خلقك أو استأثرت به في علم الغيب عندك أن تجعل القرآن ربيع قلبي ، ونور صدري وجلاء حزني وذهاب همي \"\n" +
                "\n" +
                "\" اللهم إني أعوذ بك من الهم والحزن ، والعجز والكسل والبخل والجبن ، وضلع الدين وغلبة الرجال \"\n"
        txtreapetinout.setOnClickListener {
            reapet(txtreapetnuminout,txtreapetnuminout,txtinout,txtreapetinout,yx)
            Toast.makeText(this,"اللهم لك الحمد", Toast.LENGTH_SHORT).show()
            finish()
        }

        txtinout.typeface = Typeface.createFromAsset(assets,"fo.ttf")
    }

    private fun reapet(txtsize: TextView, txtnum: TextView, txtstr: TextView, txtreapetL: TextView, ts: LinearLayout) {

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
        var s = Integer.parseInt(size.text.toString())
        fun zoomin(txt:TextView){

            s++
            if (s > 30){
                s = 30
                Toast.makeText(this,"لايمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
            }
            size.text = s.toString()
            txtinout.textSize = s.toFloat()
        }
        fun zoomout(txt:TextView){
            s--
            if (s < 16){
                s = 16
                Toast.makeText(this,"لايمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
            }
            size.text = s.toString()
            txtinout.textSize = s.toFloat()
        }
        when(item?.itemId){
            R.id.goback ->{
                Toast.makeText(this,"اللهم لك الحمد", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin -> zoomin(txtinout)
            R.id.zoomout -> zoomout(txtinout)
        }
        return super.onOptionsItemSelected(item)
    }
}
