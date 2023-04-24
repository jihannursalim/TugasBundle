package com.example.tugasbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.tugasbundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val etnama = findViewById<EditText>(R.id.etname)
            val etlahir = findViewById<EditText>(R.id.ettahun)
            val bundle = Bundle()

            val nama = etnama.text.toString()
            val lahir = etlahir.text.toString()

            bundle.putString("nama", nama)
            bundle.putString("lahir", lahir)

            val intent = Intent(this, ActivityDua::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}