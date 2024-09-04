package com.example.kakaoxmlexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.kakaoxmlexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        SetUi()
    }

    private fun SetUi() {
        binding.run {
            btnSearch.setOnClickListener {
                SetFragment(SearchFragment())
            }

            btnFavorite.setOnClickListener {
                SetFragment(FavoriteFragment())
            }
        }
    }

    private fun SetFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.frameLayout, fragment)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }
}