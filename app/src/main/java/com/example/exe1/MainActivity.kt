package com.example.exe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCal=findViewById<Button>(R.id.buttonCalculate)
        val buttonReset=findViewById<Button>(R.id.buttonReset)
        val CarPrice=findViewById<EditText>(R.id.editTextCarPrice)
        val Payment=findViewById<EditText>(R.id.editTextDownPayment)
        val Loan=findViewById<EditText>(R.id.editTextLoanPeriod)
        val Interest=findViewById<EditText>(R.id.editTextInterestRate)
        val disloan=findViewById<TextView>(R.id.textViewLoan)
        val disInt=findViewById<TextView>(R.id.textViewInterest)
        val disRate=findViewById<TextView>(R.id.textViewMonthlyRepayment)

        buttonCal.setOnClickListener {
            try{
                var douCar=CarPrice.text.toString()
                var douPay=Payment.text.toString()
                var douLoan=Loan.text.toString()
                var douInt=Interest.text.toString()
                var showloan=douCar.toDouble()-douPay.toDouble()
                var showInt=showloan*douLoan.toDouble()*douInt.toDouble()/100
                var showpay=(showloan+showInt)/douInt.toDouble()/12


                disloan.setText(showloan.toString())
                disInt.setText(showInt.toString())
                disRate.setText(showpay.toString())
            }catch (ex :Exception){

            }


        }
        buttonReset.setOnClickListener {
            CarPrice.setText("")
            Payment.setText("")
            Loan.setText("")
            Interest.setText("")

        }

    }

}
