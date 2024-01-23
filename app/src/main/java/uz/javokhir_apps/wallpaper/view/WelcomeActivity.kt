package uz.javokhir_apps.wallpaper.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import uz.javokhir_apps.wallpaper.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
            val i = Intent(
                this@WelcomeActivity,
                WallPaperActivity::class.java
            )
            startActivity(i)
            finish()
        }, 2000)
    }
}
