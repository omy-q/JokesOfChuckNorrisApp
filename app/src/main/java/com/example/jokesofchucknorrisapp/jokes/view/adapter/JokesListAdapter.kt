package com.example.jokesofchucknorrisapp.jokes.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jokesofchucknorrisapp.databinding.ItemRecyclerViewJokeBinding

class JokesListAdapter : RecyclerView.Adapter<JokeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        return JokeViewHolder(
            ItemRecyclerViewJokeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}