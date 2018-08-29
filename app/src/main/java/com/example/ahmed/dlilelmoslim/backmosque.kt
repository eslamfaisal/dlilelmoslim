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
import kotlinx.android.synthetic.main.activity_backmosque.*

class backmosque : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backmosque)

        txtastgfer.text = "دعاء الذهاب الى المسجد \n" +
                " اذا ذهبت الى المسجد ادعو قائلا : \"اللهم اجعل في قلبي نوراً ، وفي لساني نوراً ، واجعل في سمعي نوراً ، واجعل في بصري نوراً ، من فوقي نوراً، ومن تحتي نوراً ،وعن يميني نوراً ،وعن شمالي نوراً ، ومن أمامي نوراً ، و في خلفي نوراً ،واجعل ،و اجعل في نفسي نوراً، وأعظم لي نوراً ، وعظم نوراً ، واجعل لي نوراً ، واجعلني نوراً " +
                "،اللهم أعطني نوراً ، واجعل في عصبي نوراً ، وفي لحمي نوراً ، وفي دمي نوراً ، وفي شعري نوراً ، وفي بشري نوراً \"\n".trim()

        txtsobhanallah.text = "دعاء الدخول الى المسجد \n" +
                "اذا دخلت المسجد ادعو قائلا \"أعوذ بالله العظيم ،وبوجهه الكريم ،وسلطانه القديم ،من الشيطان الرجيم  بسم الله ،والصلاة والسلام على رسول الله اللهم افتح لي أبواب رحمتك"

        txtlaelah.text = "دعاء الخروج من المسجد \n" +
                "اذا خرجت من المسجد ادعو قائلا : \"بِسمِ الله وَالصّلاةُ وَالسّلامُ عَلى رَسولِ الله، اللّهُـمَّ إِنّـي أَسْأَلُكَ مِـنْ فَضْـلِك، اللّهُـمَّ اعصِمْنـي مِنَ الشَّيْـطانِ الرَّجـيم.\" رواه مسلم وابن ماجه\n"

        var z = 0
        fun sum(){
            z++
            if (z == 3){
                Toast.makeText(this,"أستغفر الله وأتوب إليه", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        txtreapetastgfer.setOnClickListener {
            reapet(txtreapetnumastgfer,txtreapetnumastgfer,txtastgfer,txtreapetastgfer,y)
            sum()
        }
        txtreapetsobhanallah.setOnClickListener {
            reapet(txtreapetnumsobhanallah, txtreapetnumsobhanallah, txtsobhanallah, txtreapetsobhanallah, x)
            sum()
        }
        txtreapetlaelah.setOnClickListener {
            reapet(txtreapetnumlaelah,txtreapetnumlaelah,txtlaelah,txtreapetlaelah,w)
            sum()
        }

        fun font(tx:TextView){
            tx.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        }
        font(txtastgfer)
        font(txtsobhanallah)
        font(txtlaelah)
    }
     private   fun reapet (txtsize:TextView,txtnum:TextView,txtstr:TextView,txtreapetL:TextView,ts:LinearLayout){

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
                Toast.makeText(this,"أستغفر الله وأتوب إليه", Toast.LENGTH_SHORT).show()
             finish()
            }
            R.id.zoomin ->{
                s++
                if (s > 30 ){
                    s = 30
                    Toast.makeText(this,"لايمكن التكبير اكثر",Toast.LENGTH_SHORT).show()

                }
                size.text = s.toString()
                txtastgfer.textSize = s.toFloat()
                txtlaelah.textSize = s.toFloat()
                txtsobhanallah.textSize = s.toFloat()

            }
            R.id.zoomout ->{
                s--
                if (s < 16){
                    s = 16
                    Toast.makeText(this,"لايمكن التصغير اكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtastgfer.textSize = s.toFloat()
                txtlaelah.textSize = s.toFloat()
                txtsobhanallah.textSize = s.toFloat()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
