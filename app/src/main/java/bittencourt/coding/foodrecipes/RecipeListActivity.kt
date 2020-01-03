package bittencourt.coding.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recipe_list.*
import java.util.*

class RecipeListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        test.setOnClickListener {
            showProgressBar(Random().nextBoolean())
        }
    }
}
