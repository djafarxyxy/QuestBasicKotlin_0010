package com.example.noactifity

fun ContohList() {
    println("=== List ===")
    //List read-only
    val readOnlyAbjad = listOf("A", "B", "c")
    println(readOnlyAbjad)

    //lit Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangel")
    println(shape)

    //nambah data kedalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangel")
    println(shape)

    //mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//set adalah kumpulan data yg tidak memiliki posisi atau urutan dan hanya menyimpan data unik(tidak ada duplikat)
//set bersifat unordered, artinya data yg di masukan tidak memiliki posisi tertentu
//set bersifat mutable dan read-only, artinya data yg di masukan dapat di ubah dan tidak dapat di ubah
//set read-only menggunakan setOf
//set mutable menggukan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    //set read-only
    val readOnlyAbjad = setOf("a", "b", "c")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangel")
    println(shape)

    //menambahkan data ke dalam dset Mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari list set mutable
    shape.remove("Circle")
    println(shape)

    //set read-Only
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

//Map adalah kumpulan data yg disusun dalam pasangan key-value
//Map bersifat unordered
//Map berisfat mutable dan read-only
//Map read-Only menggunakan mapOf
//Map mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println("=== Map ===")
    //Map read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangel" to 3,)
    println(readOnlyShape)

    //Map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangel" to 3,)
    println(shape)

    //menambahkan data kedalam mutable
    shape["Rectangle"] = 4
    println(shape)

    //]menghapus data di dalam map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data di map mutable list
    shape["Square"] = 5
    println(shape)

    //map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}