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
import com.example.ahmed.dlilelmoslim.databinding.ActivityAthanBinding

class athan : AppCompatActivity() {

    val binding by lazy { ActivityAthanBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athan)

        binding.txtout.text =
            "ما يقال عند سماع الأذان\n" + "يَقُولُ مِثْلَ مَا يَقُولُ الـمُؤَذِّنُ إلاَّ فِي \"حَيَّ عَلَى الصَّلاةِ وَحَيَّ عَلَى الفَلاَحِ\" فَيَقُولُ: \"لاَ حَوْلَ وَلا قُوَّةَ إلاَّ باللَّهِ\"."
        binding.txtin.text =
            "ما يقال بعد سماع الأذان\n" + "اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ عَلَى سَيِّدِنَا مُحَمَّدٍ. \n" + "اللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّامَّةِ، والصَّلاةِ القَائِمَةِ، آتِ مُـحَمَّداً الوَسِيْلَةَ والفَضِيْلَةَ، وابْعَثْهُ مَقَاماً مَـحْمُوداً الَّذِي وَعَدْتَهُ، إنَّكَ لا تُخْلِفُ الـمِيْعَادِ."
        binding.txtinout.text =
            "ما يقال بين الأذان والإقامة\n" + "ما بين الأذان والإقامة فالدعاء عندئذٍ مرغّب فيه ومستحب. \n" + "قَالَ رَسُولُ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ: \"الدُّعَاءُ لَا يُرَدُّ بَيْنَ الْأَذَانِ وَالْإِقَامَةِ\". \n" + "قَالَ رَسُولُ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ: \"إِنَّ الدُّعَاءَ لَا يُرَدُّ بَيْنَ الْأَذَانِ وَالْإِقَامَةِ فَادْعُوا\"."

        fun font(Txt: TextView) {
            Txt.typeface = Typeface.createFromAsset(assets, "fo.ttf")
        }
        font(binding.txtout)
        font(binding.txtin)
        font(binding.txtinout)

        var z = 0
        fun sum() {
            z++
            if (z == 3) {
                Toast.makeText(this, "ربي اغفر لي وارحمني", Toast.LENGTH_SHORT).show()
                finish()
            }
        }


        binding.txtreapetout.setOnClickListener {
            reapet(
                binding.txtreapetnumout,
                binding.txtreapetnumout,
                binding.txtout,
                binding.txtreapetout,
                binding.x
            )
            sum()
        }
        binding.txtreapetin.setOnClickListener {
            reapet(
                binding.txtreapetnumin,
                binding.txtreapetnumin,
                binding.txtin,
                binding.txtreapetin,
                binding.y
            )
            sum()
        }
        binding.txtreapetinout.setOnClickListener {
            reapet(
                binding.txtreapetnuminout,
                binding.txtreapetnuminout,
                binding.txtinout,
                binding.txtreapetinout,
                binding.yx
            )
            sum()
        }

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
                Toast.makeText(this, "ربي اغفر لي وارحمني", Toast.LENGTH_SHORT).show()
                finish()
            }

            R.id.zoomin -> {
                s++
                if (s > 30) {
                    s = 30
                    Toast.makeText(this, "لايمكن التكبير أكثر", Toast.LENGTH_SHORT).show()
                }
                binding.size!!.text = s.toString()
                binding.txtin.textSize = s.toFloat()
                binding.txtout.textSize = s.toFloat()
                binding.txtinout.textSize = s.toFloat()
            }

            R.id.zoomout -> {
                s--
                if (s < 16) {
                    s = 16
                    Toast.makeText(this, "لايمكن التصغير أكثر", Toast.LENGTH_SHORT).show()
                }
                binding.size!!.text = s.toString()
                binding.txtin.textSize = s.toFloat()
                binding.txtout.textSize = s.toFloat()
                binding.txtinout.textSize = s.toFloat()
            }
        }


        return super.onOptionsItemSelected(item)
    }
}
