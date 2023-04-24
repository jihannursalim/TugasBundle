package com.example.tugasbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasbundle.databinding.ActivityDuaBinding

class ActivityDua : AppCompatActivity() {

    lateinit var binding: ActivityDuaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ambil data
        val getBundle = intent.extras
        val nama = getBundle?.getString("nama")
        val lahir = getBundle?.getString("lahir")

        binding.txtNama.text = "Helo, " + nama
        binding.txtLahir.text = "Umur kamu adalah $lahir tahun"
    }
}