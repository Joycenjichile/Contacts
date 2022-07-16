package com.example.ContactsRvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontact.Contact
import com.example.mycontact.R
import com.example.mycontact.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactsRvAdapter (var contactList: List<Contact>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var  binding=
        ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var ContactsViewHolder  = ContactsViewHolder(binding)
        return ContactsViewHolder

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvcont.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.Email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_person_24)
            .resize(300,350)
            .centerCrop()
            .into(holder.binding.ivContact)

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root){


}