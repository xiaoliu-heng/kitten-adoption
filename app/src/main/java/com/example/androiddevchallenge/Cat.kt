package com.example.androiddevchallenge

import android.graphics.drawable.Drawable

data class Cat(
    val id: Int,
    val name: String,
    val description: String,
    val pictures: Array<Drawable>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cat

        if (id != other.id) return false
        if (name != other.name) return false
        if (description != other.description) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + description.hashCode()
        return result
    }
}
