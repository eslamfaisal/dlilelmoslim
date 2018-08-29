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
import kotlinx.android.synthetic.main.activity_mirinnig.*


class mirinnig : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mirinnig)

        var z = 0
        fun sum(){
            z++
            if (z == 359){
                Toast.makeText(this,"يا حي يا قيوم برحمتك استغيث", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        /*------ --- ------    start on click ---------------------------- */
        txtreapetchar.setOnClickListener {
            reapet(txtreapetnumchar,txtreapetnumchar,txtchare,txtreapetchar,b)
            sum()
        }
        txtreapeteklass.setOnClickListener {
            reapet(txtreapetnumeklass,txtreapetnumeklass,txteklass,txtreapeteklass,c)
            sum()

        }
        txtreapetfalk.setOnClickListener {
            reapet(txtreapetnumfalk,txtreapetnumfalk,txtfalk,txtreapetfalk,d)
            sum()
        }
        txtreapetnas.setOnClickListener {
            reapet(txtreapetnumnas,txtreapetnumnas,txtnas,txtreapetnas,e)
            sum()
        }
        txtreapetasbhna.setOnClickListener {
            reapet(txtreapetnumasbhna,txtreapetnumasbhna,txtasbhna,txtreapetasbhna,f)
            sum()
        }
        txtreapetalhm.setOnClickListener {
            reapet(txtalhmreapetnum,txtalhmreapetnum,txtalhm,txtreapetalhm,g)
            sum()
        }
        txtreapetrdit.setOnClickListener {
            reapet(txtreapetnumrdit,txtreapetnumrdit,txtrdit,txtreapetrdit,h)
            sum()
        }
        txtreapetalhmany.setOnClickListener {
            reapet(txtreapetnumalhmany,txtreapetnumalhmany,txtalhmany,txtreapetalhmany,i)
            sum()
        }
        txtreapetalhmma.setOnClickListener {
            reapet(txtreapetnumalhmma,txtreapetnumalhmma,txtalhmma,txtreapetalhmma,j)
            sum()
        }
        txtreapethaspy.setOnClickListener {
            reapet(txtreapetnumhaspy,txtreapetnumhaspy,txthaspy,txtreapethaspy,k)
            sum()
        }
        txtreapetbsm.setOnClickListener {
            reapet(txtreapetnumbsm,txtreapetnumbsm,txtbsm,txtreapetbsm,l)
            sum()
        }
        txtreapetalhmbek.setOnClickListener {
            reapet(txtreapetnumalhmbek,txtreapetnumalhmbek,txtalhmbek,txtreapetalhmbek,m)
            sum()
        }
        txtreapetasbhnaala.setOnClickListener {
            reapet(txtreapetnumasbhnaala,txtreapetnumasbhnaala,txtasbhnaala,txtreapetasbhnaala,n)
            sum()
        }
        txtreapetasbhnaalawabe.setOnClickListener {
            reapet(txtreapetnumasbhnaalawabe,txtreapetnumasbhnaalawabe,txtasbhnaalawabe,txtreapetasbhnaalawabe,o)
            sum()
        }
        txtreapetalhmafiny.setOnClickListener {
            reapet(txtreapetnumalhmafiny,txtreapetnumalhmafiny,txtalhmafiny,txtreapetalhmafiny,p)
            sum()
        }
        txtreapetalhmanyaoth.setOnClickListener {
            reapet(txtreapetnumalhmanyaoth,txtreapetnumalhmanyaoth,txtalhmanyaoth,txtreapetalhmanyaoth,q)
            sum()
        }
        txtreapetalhmanyasalk.setOnClickListener {
            reapet(txtreapetnumalhmanyasalk,txtreapetnumalhmanyasalk,txtalhmanyasalk,txtreapetalhmanyasalk,r)
            sum()
        }
        txtreapetyahy.setOnClickListener {
            reapet(txtreapetnumyahy,txtreapetnumyahy,txtyahy,txtreapetyahy,s)
            sum()
        }
        txtreapetalhmalm.setOnClickListener {
            reapet(txtreapetnumalhmalm,txtreapetnumalhmalm,txtalhmalm,txtreapetalhmalm,t)
            sum()
        }
        txtreapetaoth.setOnClickListener {
            reapet(txtreapetnumaoth,txtreapetnumaoth,txtaoth,txtreapetaoth,u)
            sum()
        }
        txtreapetalhmsly.setOnClickListener {
            reapet(txtreapetnumalhmsly,txtreapetnumalhmsly,txtalhmsly,txtreapetalhmsly,v)
            sum()
        }
        txtreapetlaelah.setOnClickListener {
            reapet(txtreapetnumlaelah,txtreapetnumlaelah,txtlaelah,txtreapetlaelah,w)
            sum()
        }
        txtreapetsobhanallah.setOnClickListener {
            reapet(txtreapetnumsobhanallah,txtreapetnumsobhanallah,txtsobhanallah,txtreapetsobhanallah,x)
            sum()
        }
        txtreapetastgfer.setOnClickListener {
            reapet(txtreapetnumastgfer,txtreapetnumastgfer,txtastgfer,txtreapetastgfer,y)
            sum()
        }
        /*------ --- ------    end on click ---------------------------- */

        fun font(tx:TextView){
            tx.typeface = Typeface.createFromAsset(assets,"fo.ttf")
        }
        font(txtchare)
        font(txteklass)
        font(txtfalk)
        font(txtfalk)
        font(txtnas)
        font(txtasbhna)
        font(txtalhm)
        font(txtrdit)
        font(txtalhmany)
        font(txtalhmma)
        font(txthaspy)
        font(txtbsm)
        font(txtalhmbek)
        font(txtasbhnaala)
        font(txtasbhnaalawabe)
        font(txtalhmafiny)
        font(txtalhmanyaoth)
        font(txtalhmanyasalk)
        font(txtyahy)
        font(txtalhmalm)
        font(txtaoth)
        font(txtalhmsly)
        font(txtlaelah)
        font(txtsobhanallah)
        font(txtastgfer)
    }

   private fun reapet (txtsize:TextView, txtnum:TextView, txtstr:TextView, txtreapetL:TextView, ts:LinearLayout){

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
                Toast.makeText(this,"يا حي يا قيوم برحمتك استغيث", Toast.LENGTH_SHORT).show()
               finish()
            }
            R.id.zoomin -> {
                s++
                if (s > 30){
                    s = 30
                    Toast.makeText(this,"لايمكن التكبير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = s.toString()
                txtchare.textSize = s.toFloat()
                txteklass.textSize = s.toFloat()
                txtfalk.textSize = s.toFloat()
                txtnas.textSize = s.toFloat()
                txtasbhna.textSize = s.toFloat()
                txtalhm.textSize = s.toFloat()
                txtrdit.textSize = s.toFloat()
                txtalhmany.textSize = s.toFloat()
                txtalhmma.textSize = s.toFloat()
                txthaspy.textSize = s.toFloat()
                txtbsm.textSize = s.toFloat()
                txtalhmbek.textSize = s.toFloat()
                txtasbhnaala.textSize = s.toFloat()
                txtasbhnaalawabe.textSize = s.toFloat()
                txtalhmafiny.textSize = s.toFloat()
                txtalhmanyaoth.textSize = s.toFloat()
                txtalhmanyasalk.textSize = s.toFloat()
                txtyahy.textSize = s.toFloat()
                txtalhmalm.textSize = s.toFloat()
                txtaoth.textSize = s.toFloat()
                txtalhmsly.textSize = s.toFloat()
                txtlaelah.textSize = s.toFloat()
                txtsobhanallah.textSize = s.toFloat()
                txtastgfer.textSize = s.toFloat()


            }
            R.id.zoomout -> {
                var v = Integer.parseInt(size.text.toString())
                v--

                if (v < 16){
                    v = 16
                    Toast.makeText(this,"لايمكن التصغير أكثر",Toast.LENGTH_SHORT).show()
                }
                size.text = v.toString()
                txtchare.textSize = v.toFloat()
                txteklass.textSize = v.toFloat()
                txtfalk.textSize = v.toFloat()
                txtnas.textSize = v.toFloat()
                txtasbhna.textSize = v.toFloat()
                txtalhm.textSize = v.toFloat()
                txtrdit.textSize = v.toFloat()
                txtalhmany.textSize = v.toFloat()
                txtalhmma.textSize = v.toFloat()
                txthaspy.textSize = v.toFloat()
                txtbsm.textSize = v.toFloat()
                txtalhmbek.textSize = v.toFloat()
                txtasbhnaala.textSize = v.toFloat()
                txtasbhnaalawabe.textSize = v.toFloat()
                txtalhmafiny.textSize = v.toFloat()
                txtalhmanyaoth.textSize = v.toFloat()
                txtalhmanyasalk.textSize = v.toFloat()
                txtyahy.textSize = v.toFloat()
                txtalhmalm.textSize = v.toFloat()
                txtaoth.textSize = v.toFloat()
                txtalhmsly.textSize = v.toFloat()
                txtlaelah.textSize = v.toFloat()
                txtsobhanallah.textSize = v.toFloat()
                txtastgfer.textSize = v.toFloat()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
