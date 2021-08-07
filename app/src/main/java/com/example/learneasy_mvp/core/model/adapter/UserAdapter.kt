package com.example.learneasy_mvp.core.model.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learneasy_mvp.R
import com.example.learneasy_mvp.core.model.Category
import com.example.learneasy_mvp.core.model.User

class UserAdapter val users: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>()
{

    var onItemClick: ((User) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_users_layout_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bindItems(users[position])

    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // execute
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(users[adapterPosition])
            }
        }

        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.userName) as TextView
            val textViewRole = itemView.findViewById(R.id.userRole) as TextView
            textViewName.text = user.name
            textViewRole.text = user.roleName
        }
    }
}