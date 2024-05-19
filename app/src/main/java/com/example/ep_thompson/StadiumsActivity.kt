package com.example.ep_thompson

import Fragment.model.ContactoAdapter
import Fragment.model.ContactoModel
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StadiumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stadiums)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Cambiado de view.findViewById a findViewById
        val rvContacto: RecyclerView = findViewById(R.id.rvStadiums)

        // Cambiado de requireContext() a this
        rvContacto.layoutManager = LinearLayoutManager(this)
        rvContacto.adapter = ContactoAdapter(ContactosList())
    }
    private fun ContactosList(): List<ContactoModel>{
        val lstContacto: ArrayList<ContactoModel> = ArrayList()

        lstContacto.add(
            ContactoModel(1,R.drawable.estadio1,"Estadio1","Lima","10000")
        )

        lstContacto.add(
            ContactoModel(1,R.drawable.estadio2,"Estadio2","Munich","25000")
        )

        lstContacto.add(
            ContactoModel(1,R.drawable.estadio3,"Estadio3","Sao Paulo","45000")
        )

        lstContacto.add(
            ContactoModel(1,R.drawable.estadio4,"Estadio4","DF","38000")
        )

        return  lstContacto;
    }
}