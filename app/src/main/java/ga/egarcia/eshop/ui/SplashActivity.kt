package ga.egarcia.eshop.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ga.egarcia.eshop.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)

    }
}
