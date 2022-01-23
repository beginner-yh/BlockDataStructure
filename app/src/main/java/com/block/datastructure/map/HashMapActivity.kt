package com.block.datastructure.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.block.datastructure.R

class HashMapActivity : AppCompatActivity() {


    lateinit var mHashMap: HashMap<String, String>
    lateinit var tvIntro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hash_map)
        tvIntro = findViewById(R.id.tv_intro)
        supportActionBar?.title = "HashMap"
        tvIntro.text = "键：可以为null，不能重复 \n值：可以为null，可以重复 \n线程安全：不安全"
    }
}