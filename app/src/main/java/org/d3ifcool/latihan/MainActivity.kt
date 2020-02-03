package org.d3ifcool.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.d3ifcool.latihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.buttonSatu.setOnClickListener{
            var dosen1 = Dosen("Diki","DKI","Dugong")

            binding.myDosen = dosen1
        }

        binding.buttonDua.setOnClickListener{
            var dosen2 = Dosen("Maudy Jelle", "MDY","Agama")

            binding.myDosen = dosen2
        }
         //TODO: note from local
    }
}
