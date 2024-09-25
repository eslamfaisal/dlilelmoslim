package com.example.ahmed.dlilelmoslim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.ahmed.dlilelmoslim.databinding.ActivityBankBinding

class bank : AppCompatActivity() {

    val binding by lazy { ActivityBankBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)

        binding.add.setOnClickListener {
            var s = Integer.parseInt(binding.txtnum.text.toString())
            s++
            binding.txtnum.text = s.toString()
            when (s) {
                30 -> Toast.makeText(this, "أحسنت صنعاً هيا اكمل", Toast.LENGTH_SHORT).show()
                50 -> Toast.makeText(this, "هذا رائع! لقد وصلت الخمسين", Toast.LENGTH_SHORT).show()
                100 -> Toast.makeText(this, "مذهل!", Toast.LENGTH_SHORT).show()
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
                Toast.makeText(this, "اللهم صلي على محمد", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
