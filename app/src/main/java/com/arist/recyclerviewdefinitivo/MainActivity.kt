package com.arist.recyclerviewdefinitivo

import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.arist.recyclerviewdefinitivo.SuperHeroProvide.Companion.superHeroList
import com.arist.recyclerviewdefinitivo.adapter.SuperHeroAdapter
import com.arist.recyclerviewdefinitivo.databinding.ActivityMainBinding
import com.arist.recyclerviewdefinitivo.databinding.ItemSuperheroBinding
import com.google.android.material.animation.Positioning
import java.util.*

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerview()
    }

    private fun initRecyclerview() {
        val manager = LinearLayoutManager(this)
        val decoratio = DividerItemDecoration(applicationContext, manager.orientation)
        binding.recycleView.layoutManager = manager
        binding.recycleView.adapter = SuperHeroAdapter(SuperHeroProvide.superHeroList)

        binding.recycleView.addItemDecoration(decoratio)

    }


}