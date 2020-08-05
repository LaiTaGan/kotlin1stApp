package com.example.ghost

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counterNum=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eye=findViewById<ImageView>(R.id.eyeghost)
        val name=findViewById<TextView>(R.id.ghostName)
        val animation = AnimationUtils.loadAnimation(this, R.anim.opacityout)
        eye.startAnimation(animation)
        name.startAnimation(animation)
        val umbrella=findViewById<ImageView>(R.id.umbrella)
        umbrella.startAnimation(animation)
        val femaleHantu=findViewById<ImageView>(R.id.Femalehantu)
        femaleHantu.startAnimation(animation)

        val grass=findViewById<ImageView>(R.id.grass2)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.grass)
        grass.startAnimation(animation2)

        val grass2=findViewById<ImageView>(R.id.grass3)
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.grass2)
        grass2.startAnimation(animation3)

        val body=findViewById<ConstraintLayout>(R.id.body)
        val ghost=findViewById<ImageView>(R.id.eyeghost)

        val hide = AnimationUtils.loadAnimation(this, R.anim.opacityin)
        val number=findViewById<TextView>(R.id.number)

        val btn1=findViewById<Button>(R.id.number1)
        btn1.setOnClickListener {
            moon.clearAnimation()
            ghost.setImageResource(R.drawable.female)
            body.setBackgroundColor(Color.parseColor("navy"))
            incrementNum()
            val flyAnim=AnimationUtils.loadAnimation(this,R.anim.fly)
            ghost.startAnimation(flyAnim)
            val moon=findViewById<ImageView>(R.id.moon)
            val move = AnimationUtils.loadAnimation(this, R.anim.moonmove)
            moon.startAnimation(move)
            femaleHantu.startAnimation(hide)
            umbrella.startAnimation(hide)
        }

        val btn2=findViewById<Button>(R.id.number2)
        btn2.setOnClickListener {
            moon.clearAnimation()
            ghost.setImageResource(R.drawable.eye)
            body.setBackgroundColor(Color.parseColor("black"))
            incrementNum()
            val jump=AnimationUtils.loadAnimation(this,R.anim.jump)
            ghost.startAnimation(jump)
            femaleHantu.startAnimation(hide)
            umbrella.startAnimation(hide)
        }

        val btn3=findViewById<Button>(R.id.number3)
        btn3.setOnClickListener {
            moon.clearAnimation()
            ghost.setImageResource(R.drawable.umbella)
            body.setBackgroundColor(Color.parseColor("red"))
            incrementNum()
            val walk=AnimationUtils.loadAnimation(this,R.anim.walk)
            ghost.startAnimation(walk)
            femaleHantu.startAnimation(hide)
            umbrella.startAnimation(hide)
        }

        val btn4=findViewById<Button>(R.id.number4)
        btn4.setOnClickListener {
            moon.clearAnimation()
            ghost.setImageResource(R.drawable.anablle)
            body.setBackgroundColor(Color.parseColor("green"))
            incrementNum()
            val zoom=AnimationUtils.loadAnimation(this,R.anim.zoom)
            ghost.startAnimation(zoom)
            femaleHantu.startAnimation(hide)
            umbrella.startAnimation(hide)
        }

        val home=findViewById<Button>(R.id.home)
        home.setOnClickListener {
            ghost.clearAnimation()
            moon.clearAnimation()
            ghost.setImageResource(R.drawable.eye)
            name.startAnimation(animation)
            umbrella.startAnimation(animation)
            femaleHantu.startAnimation(animation)
            body.setBackgroundColor(Color.parseColor("black"))
            counterNum=0
            number.text=counterNum.toString()
            grass.startAnimation(animation2)
            grass2.startAnimation(animation3)
        }

    }
    private fun incrementNum(){
        counterNum++
        number.text=counterNum.toString()
        println(counterNum)
    }

}
