package com.example.ahmed.dlilelmoslim

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.ahmed.dlilelmoslim.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.athkar.setOnClickListener {
            var intent = Intent(this, athkar::class.java)
            startActivity(intent)
        }
        binding.adieaa.setOnClickListener {
            var intent1 = Intent(this, adeiaa::class.java)
            startActivity(intent1)
        }
        binding.bank.setOnClickListener {
            var int = Intent(this, bank::class.java)
            startActivity(int)
        }

        binding.athkar.typeface = Typeface.createFromAsset(assets, "fo.ttf")
        binding.adieaa.typeface = Typeface.createFromAsset(assets, "fo.ttf")
        binding.bank.typeface = Typeface.createFromAsset(assets, "fo.ttf")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var infl = menuInflater
        infl.inflate(R.menu.share, menu)
        return true

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.share -> {
                var intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "حمل الان تطبيق دليل المسلم " + "\n" + "حصنك من الاذكار والأدعية"
                )
                intent.type = "type/plain"
                intent.type = "*/*"
                startActivity(Intent.createChooser(intent, "share the app"))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

