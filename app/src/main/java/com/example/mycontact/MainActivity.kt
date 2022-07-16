package com.example.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ContactsRvAdapter.ContactsRvAdapter
import com.example.mycontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact1=Contact("Cudra","0797828610","cudra@gmail.com","Mali","https://images.unsplash.com/photo-1522529599102-193c0d76b5b6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var contact2=Contact("Aggy","0797928610","aggy@gmail.com","Kakuma","https://images.unsplash.com/photo-1523824921871-d6f1a15151f1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contact3=Contact("Marie","0797428610","marie@gmail.com","Eldy","https://images.unsplash.com/photo-1519076381129-b4234ae7e573?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=418&q=80")
        var contact4=Contact("Linda","0797848610","linda@gmail.com","karen","https://images.unsplash.com/photo-1605980776566-0486c3ac7617?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=449&q=80")
        var contact5=Contact("Pj","0797828650","pj@gmail.com","Rombo","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact6=Contact("Namba","0787828650","namba@gmail.com","Amboseli","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact7=Contact("Otieno","0797828650","otieno@gmail.com","Migori","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact8=Contact("Vincent","0793828650","vinny@gmail.com","Kisumu","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact9=Contact("Abonyo","0797128650","abonyo@gmail.com","Matisi","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact10=Contact("Ian","0727828650","ian@gmail.com","Kitale","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact11=Contact("Joy","0767828650","joy@gmail.com","Rombo","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact12=Contact("Wadi","0707828650","wadi@gmail.com","Lemongo","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact13=Contact("Aleky","0790828650","aleky@gmail.com","Rombo","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact14=Contact("Sepeko","0701909742","sepeko@gmail.com","Inkisanjani","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact15=Contact("Elsy","0790828652","elsy@gmail.com","Inkisanjani","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact16=Contact("Jane","0742604296","jane@gmail.com","Isinet","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact17=Contact("Oburu","0790517342","oburu@gmail.com","Kisumu","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact18=Contact("Rahab","0716457555","mraho@gmail.com","Parklands","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact19=Contact("Nav","0734927299","nav@gmail.com","Parklands","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact20=Contact("Lawrence","0791742933","law@gmail.com","Parklands","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact21=Contact("Lucy","0745549481","lucy@gmail.com","Inkisanjani","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact22=Contact("Conso","0704760186","conso@gmail.com","Inkisanjani","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact23=Contact("Happy","0746777246","happy@gmail.com","Iltilal","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")
        var contact24=Contact("Rose","0727685866","rose@gmail.com","Iltilal","https://images.unsplash.com/photo-1519763421920-f2d769e01a37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=429&q=80")


        var contactList=
            listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18,contact19,contact20,contact21,contact22,contact23,contact24)
        var contactAdapter=ContactsRvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter
    }
}
