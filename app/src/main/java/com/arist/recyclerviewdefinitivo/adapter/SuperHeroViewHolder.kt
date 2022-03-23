package com.arist.recyclerviewdefinitivo.adapter

import android.view.View
import android.widget.Toast
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.arist.recyclerviewdefinitivo.SuperHero
import com.arist.recyclerviewdefinitivo.databinding.ActivityMainBinding
import com.arist.recyclerviewdefinitivo.databinding.ItemSuperheroBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.init
import java.lang.System.load
import kotlin.coroutines.coroutineContext


class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHero: SuperHero) {
        binding.tvRealName.text = superHero.realName
        binding.tvPublisher.text = superHero.publisher
        binding.tvSuperHero.text = superHero.superHero
        Glide.with(binding.ivSuperHero.context)
            .load(superHero.photon)
            .centerCrop()
            .into(binding.ivSuperHero)


//que hace la app cuando pulsas un items del recycleView
        binding.items.setOnClickListener {
            Toast.makeText(
                binding.ivSuperHero.context,
                "Soy ${binding.tvSuperHero.text} y te voy a matar. Estos son mis poderes: ${binding.tvRealName.text}\n¿Qué poderes tienes tu?",
                Toast.LENGTH_LONG
            ).show()

         /*   when (binding.tvRealName.text) {
                "hola" -> Toast.makeText(
                    binding.ivSuperHero.context,
                    binding.tvRealName.text,
                    Toast.LENGTH_LONG
                ).show()
                "Pedro" -> Toast.makeText(
                    binding.ivSuperHero.context,
                    binding.tvRealName.text,
                    Toast.LENGTH_LONG
                ).show()
                else -> {
                    Toast.makeText(binding.ivSuperHero.context, "ni puta idea", Toast.LENGTH_LONG)
                        .show()
                }
            }

          */
        }

    }
}