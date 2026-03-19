import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
                val rg = findViewById<RadioGroup>(R.id.rg)

                btn.setOnClickListener {

            val selectedId = rg.checkedRadioButtonId

            when (selectedId) {
                R.id.rb_and -> {
                    Toast.makeText(this, "Android 선택", Toast.LENGTH_SHORT).show()
                }

                R.id.rb_apl -> {
                    Toast.makeText(this, "Apple 선택", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}