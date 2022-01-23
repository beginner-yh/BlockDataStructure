package com.block.datastructure.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseArray
import com.block.datastructure.R

/**
 * 稀松数组
 * SparseArray 映射整数到对象，和一般的数组不同，索引可以包含空白。
 * SparseArray 是为了提高内存效率相对于 HashMap，
 * 1.它避免了自动装箱
 * 2.它的数据结构不依赖于额外的入口对象为每个映射(HashMap 的 Entry 内存消耗)
 *
 *
 * 注意这个容器在数组数据结构中保持它的映射使用二分查找来查找键。
 * 该实现并不打算适合于数据结构可能包含大量的项目。
 * 它通常比 HashMap 慢，因为查找需要二分查找
 * 添加和删除需要插入和删除数据中的条目。
 * 对于能装几百件物品的集装箱，性能差异小于50%。
 *
 * 为了提高性能，容器在移除时包含了一个优化keys，而不是立即压缩它的数组。
 * 它留下标记被删除的条目，然后，可以为相同的键重用改条目，或稍后在对所有被移除的条目进行一次垃圾收集。
 * 这垃圾收集必须在数组需要增长时执行，或者当映射大小或检索条目。
 *
 * 可以使用
 * keyAt(int):与索引的升序值返回键按升序排列
 * valueAt(int):值对应的键将按升序返回
 */
class SparseArrayActivity : AppCompatActivity() {

    val sparseArray = SparseArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sparse_array)
    }

    /**
     * 插入的时间复杂度 O(logn)
     */
    fun addData() {
        sparseArray.put(0, "Android")
    }

    /**
     * 查找的时间复杂度 O(logn)
     */
    fun getData() {
        sparseArray.get(0)
    }


    fun deleteData(key: Int) {
        sparseArray.remove(key);
    }

}