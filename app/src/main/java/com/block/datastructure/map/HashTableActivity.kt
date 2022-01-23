package com.block.datastructure.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.block.datastructure.R
import java.util.*

/**
 *
 */
class HashTableActivity : AppCompatActivity() {

    lateinit var mHashTable: Hashtable<String, String>
    lateinit var tvIntro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hash_table)
        tvIntro = findViewById(R.id.tv_intro)
        supportActionBar?.title = "HashTable"
        tvIntro.text = "键：不可以为null，不能重复 \n值：不可以为null，可以重复 \n线程安全：安全"
    }
}