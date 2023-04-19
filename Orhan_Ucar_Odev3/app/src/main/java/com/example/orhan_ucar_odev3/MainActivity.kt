package com.example.orhan_ucar_odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.orhan_ucar_odev3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Anasayfa())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.anasayfa -> replaceFragment(Anasayfa())
                R.id.hakkimda -> replaceFragment(Hakkimda())
                R.id.iletisim -> replaceFragment(Iletisim())
                R.id.galeri -> replaceFragment(Galeri())
                R.id.blog -> replaceFragment(Blog())

                else -> {}
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}