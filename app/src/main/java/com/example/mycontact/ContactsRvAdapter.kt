package com.example.ContactsRvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontact.Contact
import com.example.mycontact.R

class ContactsRvAdapter (var contactList: List<Contact>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item, parent, false)
        var ContactsViewHolder  = ContactsViewHolder(itemView)
        return ContactsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text = currentContact.name
        holder.tvNumber.text = currentContact.phoneNumber
        holder.tvEmail.text = currentContact.Email
        holder.tvAddress.text = currentContact.address



    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvNumber = itemView.findViewById<TextView>(R.id.tvcont)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
    var ivContact = itemView.findViewById<ImageView>(R.id.ivContact)


}