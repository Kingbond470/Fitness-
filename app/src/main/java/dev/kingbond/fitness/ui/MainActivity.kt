package dev.kingbond.fitness.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.navigation.NavigationView
import dev.kingbond.fitness.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        setContentView(R.layout.activity_main)

        bottomNavBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                R.id.attendance -> Toast.makeText(this, "Attendance", Toast.LENGTH_SHORT).show()
                R.id.profile -> Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            }
            true
        }

        sideBarNavigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.attendance -> Toast.makeText(this, "Attendance", Toast.LENGTH_SHORT).show()
                R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                R.id.profile -> Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            }

            true
        })


    }
}