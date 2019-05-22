package ga.egarcia.eshop.ui

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.text.util.LinkifyCompat
import android.text.util.Linkify
import ga.egarcia.eshop.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupListeners()
    }

    private fun setupListeners() {
        section_1.setOnClickListener {
            val intent = Intent(this, SectionOneActivity::class.java)
            startActivity(intent)
        }

        LinkifyCompat.addLinks(contact, Linkify.ALL)
        contact.setLinkTextColor(Color.WHITE)

    }
}
