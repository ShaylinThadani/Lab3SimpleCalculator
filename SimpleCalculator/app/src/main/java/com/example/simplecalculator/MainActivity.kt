package com.example.simplecalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private enum class Operator {
        none, add, minus, multiply, divide
    }

    private var data1 = 0.0
    private var data2 = 0.0
    private var optr = Operator.none
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn01Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "1")
    }

    fun btn02Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "2")
    }

    fun btn03Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "3")
    }

    fun btn04Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "4")
    }

    fun btn05Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "5")
    }

    fun btn06Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "6")
    }

    fun btn07Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "7")
    }

    fun btn08Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "8")
    }

    fun btn09Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "9")
    }

    fun btn00Click(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + "0")
    }

    fun btnAddClick(view: View?) {
        optr = Operator.add
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        data1 = eText.text.toString().toDouble()
        eText.setText("")
    }

    fun btnMinusClick(view: View?) {
        optr = Operator.minus
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        data1 = eText.text.toString().toDouble()
        eText.setText("")
    }

    fun btnMultiplyClick(view: View?) {
        optr = Operator.multiply
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        data1 = eText.text.toString().toDouble()
        eText.setText("")
    }

    fun btnDivideClick(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        optr = Operator.divide
        data1 = eText.text.toString().toDouble()
        eText.setText("")
    }

    fun btnClearClick(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText("")
    }

    fun btnDotClick(view: View?) {
        val eText = findViewById<View>(R.id.resultEdit) as EditText
        eText.setText(eText.text.toString() + ".")
    }

    fun btnResultClick(view: View?) {
        if (optr != Operator.none) {
            val eText = findViewById<View>(R.id.resultEdit) as EditText
            data2 = eText.text.toString().toDouble()
            var result = 0.0
            if (optr == Operator.add) {
                result = data1 + data2
            } else if (optr == Operator.minus) {
                result = data1 - data2
            } else if (optr == Operator.multiply) {
                result = data1 * data2
            } else if (optr == Operator.divide) {
                result = data1 / data2
            }
            optr = Operator.none
            data1 = result
            if (result - result.toInt() != 0.0) {
                eText.setText(result.toString())
            } else {
                eText.setText(result.toInt().toString())
            }
        }
    }
}