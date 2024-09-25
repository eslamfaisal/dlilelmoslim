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
import kotlinx.android.synthetic.main.activity_beforewodoa.*

class beforewodoa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beforewodoa)

        txtbefore.text = "الذكر قبل الوضوء\n" +
                "قبل الوضوء: \"بِسْمِ ٱللّٰهِ\". "
        txtafter.text = "الذكر بعد الوضوء\n" +
                "\"أشْهَدُ أن لا إله إلا الله وحْدَهُ لا شريكَ لهُ ، وأشْهَدُ أنَّ محمداً عَبدُهُ ورسُولُه\". \n" +
                "\"اللَّهُمَّ اجْعَلْني مِنَ التَّوَّابينَ واجْعَلْنِي من المُتَطَهِّرِينَ\". \n" +
                "\"سُبْحَانَكَ اللَّهُمَّ وبَحَمْدكَ أشْهدُ أنْ لا إلهَ إلا أنْتَ أَسْتَغْفِرُكَ وأتُوبُ إِلَيْكَ\""


        txtbefore.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        txtafter.typeface = Typeface.createFromAsset(assets,"fo.ttf")

        var z = 0
        fun sum (){
            z++
            if (z == 2){
                Toast.makeText(this,"اللهم يا مقلب القلوب ثبت قلبي على دينك", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        txtreapetbefore.setOnClickListener {
            reapet(txtreapetnumbefore,txtreapetnumbefore,txtbefore,txtreapetbefore,y)
            sum()

        }
        txtreapetafter.setOnClickListener {
            reapet(txtreapetnumafter,txtreapetnumafter,txtafter,txtreapetafter,x)
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


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var s = Integer.parseInt(size.text.toString())
        when(item?.itemId){
            R.id.goback ->{
                Toast.makeText(this,"اللهم يا مقلب القلوب ثبت قلبي على دينك", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin ->{
                s++
                if (s > 30){
                    s = 30
                    Toast.makeText(this,"لا يمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtbefore.textSize = s.toFloat()
                txtafter.textSize = s.toFloat()

            }
            R.id.zoomout ->{
                s--
                if (s < 16){
                    s = 16
                    Toast.makeText(this,"لا يمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtbefore.textSize = s.toFloat()
                txtafter.textSize = s.toFloat()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
