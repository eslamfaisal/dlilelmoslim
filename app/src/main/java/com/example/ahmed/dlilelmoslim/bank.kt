package com.example.ahmed.dlilelmoslim

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bank.*

class bank : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)


        add.setOnClickListener {
            var s = Integer.parseInt(txtnum.text.toString())
            s++
            txtnum.text  = s.toString()
             when(s){
                30 ->Toast.makeText(this,"أحسنت صنعاً هيا اكمل",Toast.LENGTH_SHORT).show()
                 50 -> Toast.makeText(this,"هذا رائع! لقد وصلت الخمسين",Toast.LENGTH_SHORT).show()
                 100 ->Toast.makeText(this,"مذهل!",Toast.LENGTH_SHORT).show()
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
                Toast.makeText(this,"اللهم صلي على محمد",Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
