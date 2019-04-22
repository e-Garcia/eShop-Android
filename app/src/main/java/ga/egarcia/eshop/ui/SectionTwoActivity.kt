package ga.egarcia.eshop.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import ga.egarcia.eshop.R
import ga.egarcia.eshop.model.Product
import ga.egarcia.eshop.ui.adapter.ProductAdapter
import kotlinx.android.synthetic.main.activity_section_two.*

class SectionTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section_two)

        content_list.adapter = ProductAdapter(mockProducts())
        content_list.layoutManager = LinearLayoutManager(this)
    }

    private fun mockProducts() : List<Product> {
        val mockProducts = mutableListOf<Product>()
        mockProducts.add(Product("Fruit Mix", "$1.00 - $85.00"))
        mockProducts.add(Product("Ranch", "$1.00 - $85.00"))
        mockProducts.add(Product("Cinnamon", "$1.00 - $85.00"))
        mockProducts.add(Product("Tender White", "$1.00 - $85.00"))
        mockProducts.add(Product("White Cheddar", "$1.00 - $85.00"))
        mockProducts.add(Product("Butter", "$1.00 - $85.00"))
        mockProducts.add(Product("Salt & Vinegar", "$1.00 - $85.00"))
        mockProducts.add(Product("Touch of Lime", "$1.00 - $85.00"))

        return mockProducts
    }
}
