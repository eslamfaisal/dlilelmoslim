package com.example.ahmed.dlilelmoslim

import android.graphics.Typeface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ahmed.dlilelmoslim.databinding.ActivityBeforeatBinding
import kotlinx.android.synthetic.main.activity_beforeat.*


class beforeat : AppCompatActivity() {

    val binding by lazy { ActivityBeforeatBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beforeat)

        binding.txtinout.text =
            "بِسْمِ اللهِ. \n" + "فإنْ نسي في أَوَّلِهِ، فَليَقُلْ: \n" + "بِسْمِ اللَّه أَوَّلَهُ وَآخِرَهُ."

        binding.txtreapetinout.setOnClickListener {
            reapet(
                binding.txtreapetnuminout,
                binding.txtreapetnuminout,
                binding.txtinout,
                binding.txtreapetinout,
                binding.yx
            )
            Toast.makeText(this, "أستغفر الله العظم", Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.txtinout.typeface = Typeface.createFromAsset(assets, "fo.ttf")
    }

    private fun reapet(
        txtsize: TextView,
        txtnum: TextView,
        txtstr: TextView,
        txtreapetL: TextView,
        ts: LinearLayout
    ) {

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
        infl.inflate(R.menu.menu, menu)
        return true


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var s = Integer.parseInt(binding.size!!.text.toString())

        when (item.itemId) {
            R.id.goback -> {
                Toast.makeText(this, "أستغفر الله العظم", Toast.LENGTH_SHORT).show()
                finish()
            }

            R.id.zoomin -> {
                s++
                if (s > 30) {
                    s = 30
                    Toast.makeText(this, "لايمكن التكبير أكثر", Toast.LENGTH_SHORT).show()
                }
                binding.size!!.text = s.toString()
                binding.txtinout.textSize = s.toFloat()
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
