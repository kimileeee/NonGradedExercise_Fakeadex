package com.mobdeve.s12.lee.kim.fakemon_exercise

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FakeamonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val fakeamonImage: ImageView
    private val fakeamonName: TextView
    private val fakeamonDesc: TextView
    private val fakeamonSpecies: TextView
    private val fakeamonLocation: TextView
    val deleteButton: Button

    init {
        fakeamonImage = itemView.findViewById(R.id.imageView)
        fakeamonName = itemView.findViewById(R.id.nameTextView)
        fakeamonDesc = itemView.findViewById(R.id.descTextView)
        fakeamonSpecies = itemView.findViewById(R.id.speciesTextView)
        fakeamonLocation = itemView.findViewById(R.id.locTextView)
        deleteButton = itemView.findViewById(R.id.deleteButton)
    }

    fun setImageView(image: Int) {
        fakeamonImage.setImageResource(image)
    }

    fun setNameTextView(name: String) {
        fakeamonName.text = name
    }

    fun setDescTextView(name: String) {
        fakeamonDesc.text = name
    }

    fun setSpeciesTextView(name: String) {
        fakeamonSpecies.text = name
    }

    fun setLocationTextView(name: String) {
        fakeamonLocation.text = name
    }
}