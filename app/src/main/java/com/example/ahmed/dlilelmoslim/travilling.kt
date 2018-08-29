package com.example.ahmed.dlilelmoslim

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_travilling.*


class travilling : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travilling)

        txtinout.text = "\"الله أكبر، الله أكبر، الله أكبر،{سُبْحانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ * وَإِنَّا إِلَى رَبِّنَا لَمُنقَلِبُونَ}  \"اللهم إنا نسألُكَ في سفرنا هذا البرَّ والتقوى، ومن العمل ما ترضى، اللهم هون علينا سفرنا هذا واطو عنا بعده، اللهم أنت الصاحب في السفر، والخليفة في الأهل، اللهم إني أعوذ بك من وعْثاءِ السفر، وكآبة المنظر وسوء المنقلب في المال والأهل\" وإذا رجع قالهن وزاد فيهن \"آيبون، تائبون، عابدون، لربنا حامدون\""

        txtreapetinout.setOnClickListener {
            reapet(txtreapetnuminout,txtreapetnuminout,txtinout,txtreapetinout,yx)
            Toast.makeText(this,"أستغفر الله العظيم", Toast.LENGTH_SHORT).show()
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

        when(item?.itemId){
            R.id.goback ->{
                Toast.makeText(this,"أستغفر الله العظيم", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin ->{
                s++
                if(s > 30){
                    s = 30
                    Toast.makeText(this,"لايمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtinout.textSize = s.toFloat()
            }
            R.id.zoomout -> {
                s--
                if (s < 16){
                    s = 16
                    Toast.makeText(this,"لايمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtinout.textSize = s.toFloat()
            }
        }



        return super.onOptionsItemSelected(item)
    }
}
