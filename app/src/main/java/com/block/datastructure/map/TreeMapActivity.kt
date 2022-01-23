package com.block.datastructure.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.block.datastructure.R
import java.util.*

class TreeMapActivity : AppCompatActivity() {
    /**
     * 基于二叉树
     */
    lateinit var mTreeMap: TreeMap<String, String>
    lateinit var tvIntro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree_map)
        supportActionBar?.title = "HashTable"
        mTreeMap = TreeMap()
        tvIntro = findViewById(R.id.tv_intro)
        tvIntro.text = "键：不能重复 \n值：可以重复 \n线程安全：不安全"
    }
}