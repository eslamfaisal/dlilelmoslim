package com.example.ahmed.dlilelmoslim

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ahmed.dlilelmoslim.databinding.ActivityAthkarBinding

class athkar : AppCompatActivity() {

    val binding by lazy { ActivityAthkarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athkar)


        var arrlist = arrayOf(
            "أذكار الصباح",
            "أذكار المساء",
            "أذكار الاستيقاظ",
            "أذكار النوم",
            "أذكار الوضوء",
            "أذكار المنزل",
            "أذكار الأذان",
            "أذكار المسجد",
            "الأذكار بعد الصلوات المفروضة"

        )
        binding.athkarlist.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrlist)

        var morinnig = Intent(this, mirinnig::class.java)
        var evning = Intent(this, evning::class.java)
        var wakeup = Intent(this, wakeup::class.java)
        var sleep = Intent(this, sleep::class.java)
        var beforwodoaa = Intent(this, beforewodoa::class.java)
        var outsidehome = Intent(this, outsidehome::class.java)
        var athan = Intent(this, athan::class.java)
        var mosque = Intent(this, backmosque::class.java)

        binding.athkarlist.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> startActivity(morinnig)
                1 -> startActivity(evning)
                2 -> startActivity(wakeup)
                3 -> startActivity(sleep)
                4 -> startActivity(beforwodoaa)
                5 -> startActivity(outsidehome)
                6 -> startActivity(athan)
                7 -> startActivity(mosque)
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.main, menu)
        return true


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.back -> {
                Toast.makeText(this, "لا إله لا أنت سبحانك إني كنت من الظالمين", Toast.LENGTH_SHORT)
                    .show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
