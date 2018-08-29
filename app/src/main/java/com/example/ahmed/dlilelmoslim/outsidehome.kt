package com.example.ahmed.dlilelmoslim

import android.graphics.Typeface
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_outsidehome.*


class outsidehome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outsidehome)

        txtin.text = "أذكار الدخول إلى المنزل\n" +
                "بِسْـمِ اللهِ وَلَجْنـا، وَبِسْـمِ اللهِ خَـرَجْنـا، وَعَلـى رَبِّنـا تَوَكّلْـنا. "
        txtout.text = "أذكار الخروج من المنزل\n" +
                "بِسْمِ اللهِ ، تَوَكَّلْـتُ عَلى اللهِ وَلا حَوْلَ وَلا قُـوَّةَ إِلاّ بِالله.\n" +
                "اللّهُـمَّ إِنِّـي أَعـوذُ بِكَ أَنْ أَضِـلَّ أَوْ أُضَـل ، أَوْ أَزِلَّ أَوْ أُزَل ، أَوْ أَظْلِـمَ أَوْ أَُظْلَـم ، أَوْ أَجْهَلَ أَوْ يُـجْهَلَ عَلَـيّ."


        txtin.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        txtout.typeface = Typeface.createFromAsset(assets,"fo.ttf")

        var x1 = 0
        fun sum(){
            x1++
            if (x1 == 2){
                Toast.makeText(this,"اللهم اغفر لوالدي و للمسلمين", Toast.LENGTH_SHORT).show()
                finish()}
        }

            txtreapetout.setOnClickListener {
                reapet(txtreapetnumout, txtreapetnumout, txtout, txtreapetout, y)
                sum()
            }
            txtreapetin.setOnClickListener {
                reapet(txtreapetnumin, txtreapetnumin, txtin, txtreapetin, x)
                sum()
            }

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
                Toast.makeText(this,"اللهم اغفر لوالدي و للمسلمين", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin ->{
                s++
                if (s > 30){
                 s = 30
                    Toast.makeText(this,"لا يمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtin.textSize = s.toFloat()
                txtout.textSize = s.toFloat()
            }
            R.id.zoomout ->{
                s--
                if (s < 16){
                    s = 16
                    Toast.makeText(this,"لا يمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtin.textSize = s.toFloat()
                txtout.textSize = s.toFloat()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
