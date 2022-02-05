package com.example.jokesofchucknorrisapp.jokes.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.jokesofchucknorrisapp.jokes.data.Joke

object JokeDiffUtilCallback: DiffUtil.ItemCallback<Joke>() {
    override fun areItemsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.jokeName == newItem.jokeName
    }

}
