package rey.jose.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label:TextView = findViewById(R.id.etiqueta) as TextView
        val down:Button = findViewById(R.id.down) as Button
        val up:Button = findViewById(R.id.up) as Button
        val generate:Button = findViewById(R.id.generate) as Button
        var limiteInf:Int = 0
        var limiteSup:Int = 100
        var num:Int = 0

        generate.setOnClickListener{
            num = Random.nextInt(0,100)
            label.setText("¿Tu número es? "+num.toString())
            txtWin.setText("")
            limiteInf = 0
            limiteSup = 100
        }
        up.setOnClickListener{
            limiteInf = num
            num = Random.nextInt(limiteInf,limiteSup)
            label.setText("¿Tu número es? "+num.toString())
        }
        down.setOnClickListener{
            limiteSup = num
            num = Random.nextInt(limiteInf,limiteSup)
            label.setText("¿Tu número es? "+num.toString())
        }

        ganar.setOnClickListener{
            txtWin.setText("¡Hemos adivinado el número!")
        }

    }

}
