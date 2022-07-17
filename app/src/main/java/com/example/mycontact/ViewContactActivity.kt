package com.example.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontact.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        val image=extras?.getString("IMAGE","")
        Picasso.get()
            .load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(150,150)
            .into(binding.imgperson)


        val name=extras?.getString("NAME","")
        var  email=extras?.getString("EMAIL","")
        var  adress=extras?.getString("ADDRESS","")
//        var image=binding.imgperson



        Toast.makeText(this,"$name: $email",Toast.LENGTH_LONG).show()

        binding.tvNam.text=name
        binding.tvAdres.text=adress
        binding.tvEmai.text=email
//        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)

    }
}