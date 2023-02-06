package com.tradehouse.lesson_6_4.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tradehouse.lesson_6_4.databinding.ActivityMainBinding
import com.tradehouse.lesson_6_4.fragment1.FirstFragment
import com.tradehouse.lesson_6_4.fragment2.CountFragment
import com.tradehouse.lesson_6_4.fragment3.HistoryFragment

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = FragmentAdapter(this)
        binding.viewPager.adapter = adapter
    }

    inner class FragmentAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            val fragment = FirstFragment()
            if (position == 0) {
                return fragment
            }
            if (position == 1) {
                return CountFragment()
            }
            if (position == 2) {
                return HistoryFragment()
            }
            return fragment
        }
    }
}
