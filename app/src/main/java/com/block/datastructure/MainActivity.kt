package com.block.datastructure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.block.datastructure.map.HashMapActivity
import com.block.datastructure.map.HashTableActivity
import com.block.datastructure.map.TreeMapActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnHashMap: AppCompatButton
    lateinit var btnHashTable: AppCompatButton
    lateinit var btnTreeMap: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHashMap = findViewById(R.id.btn_hash_map)
        btnHashTable = findViewById(R.id.btn_hash_table)
        btnTreeMap = findViewById(R.id.btn_tree_map)
        btnHashMap.setOnClickListener {
            startActivity(Intent(this, HashMapActivity::class.java))
        }
        btnHashTable.setOnClickListener {
            startActivity(Intent(this, HashTableActivity::class.java))
        }
        btnTreeMap.setOnClickListener {
            startActivity(Intent(this, TreeMapActivity::class.java))
        }
    }
}