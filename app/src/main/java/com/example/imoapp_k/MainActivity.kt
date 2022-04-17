package com.example.imoapp_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoapp_k.adapter.ChatAdapter
import com.example.imoapp_k.model.Chat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(recyclerView, getAllChats())
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>){
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.user2, "John Smith", 1))
        chats.add(Chat(R.drawable.user3, "Henry Cavil", 3))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        chats.add(Chat(R.drawable.user2, "John Smith", 1))
        chats.add(Chat(R.drawable.user3, "Henry Cavil", 3))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        chats.add(Chat(R.drawable.user2, "John Smith", 1))
        chats.add(Chat(R.drawable.user3, "Henry Cavil", 3))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        chats.add(Chat(R.drawable.user2, "John Smith", 1))
        chats.add(Chat(R.drawable.user3, "Henry Cavil", 3))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        chats.add(Chat(R.drawable.user2, "John Smith", 1))
        chats.add(Chat(R.drawable.user3, "Henry Cavil", 3))
        chats.add(Chat(R.drawable.user2, "Mark Thopmson", 0))
        return chats
    }
}