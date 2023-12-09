package com.example.myshoppinglist

data class ShoppingList(
    val id: Int,
    var name: String,
    var quantity: Int,
    var isEditing: Boolean = false
){

}
