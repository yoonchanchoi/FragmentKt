package com.example.view.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn_fragment1 : Button
    private lateinit var btn_fragment2 : Button
    private lateinit var btn_fragment3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fragment1 = findViewById(R.id.btn_fragment1)
        btn_fragment2 = findViewById(R.id.btn_fragment2)
        btn_fragment3 = findViewById(R.id.btn_fragment3)


        setFrag(0)

        btn_fragment1.setOnClickListener{
            setFrag(0)
        }
        btn_fragment2.setOnClickListener{
            setFrag(1)
        }
        btn_fragment3.setOnClickListener{
            setFrag(2)
        }

    }
    private fun setFrag(fragNum : Int){
        val ft =supportFragmentManager.beginTransaction()
        when(fragNum){
            0->{
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1->{
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2->{
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }

    }
}