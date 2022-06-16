package com.ortmecatronica.appmecatronica.menuFeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.ortmecatronica.appmecatronica.R
import com.ortmecatronica.appmecatronica.databinding.ActivityMenuBinding

//@AndroidEntryPoint
class MenuActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment
    private lateinit var binding : ActivityMenuBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    private val topLevelDestinations = setOf(
        R.id.areasFragment,
        R.id.infoFragment,
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        //setSupportActionBar(binding.toolbar)
        appBarConfiguration = AppBarConfiguration.Builder(topLevelDestinations).build()
        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        bottomNavigationView = findViewById(R.id.bottomNavView)
        NavigationUI.setupActionBarWithNavController(this, navHostFragment.navController, appBarConfiguration)
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.navController)
        bottomNavigationView.labelVisibilityMode= NavigationBarView.LABEL_VISIBILITY_LABELED
    }
}