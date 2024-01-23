package uz.javokhir_apps.wallpaper.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.javokhir_apps.wallpaper.R
import uz.javokhir_apps.wallpaper.adapter.WallPaperAdapter
import uz.javokhir_apps.wallpaper.model.WallPaperData

class WallPaperActivity : AppCompatActivity() {

    private lateinit var wallPaperAdapter: WallPaperAdapter
    private lateinit var wallImgList: ArrayList<WallPaperData>
    private lateinit var wallPaperRec: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall_paper)
        wallPaperRec = findViewById(R.id.wallRec)
        wallImgList = ArrayList()
        wallPaperAdapter = WallPaperAdapter(this, wallImgList)
        val layoutM = GridLayoutManager(applicationContext, 2)
        layoutM.orientation = LinearLayoutManager.VERTICAL
        wallPaperRec.layoutManager = layoutM
        wallPaperRec.adapter = wallPaperAdapter
        wallPaperList()
    }

    private fun wallPaperList() {
        wallImgList.add(WallPaperData(R.drawable.aa))
        wallImgList.add(WallPaperData(R.drawable.bb))
        wallImgList.add(WallPaperData(R.drawable.cc))
        wallImgList.add(WallPaperData(R.drawable.dd))
        wallImgList.add(WallPaperData(R.drawable.ff))
        wallImgList.add(WallPaperData(R.drawable.hh))
        wallImgList.add(WallPaperData(R.drawable.ii))
        wallImgList.add(WallPaperData(R.drawable.kk))
        wallImgList.add(WallPaperData(R.drawable.ll))
        wallImgList.add(WallPaperData(R.drawable.mm))
        wallImgList.add(WallPaperData(R.drawable.oo))
        wallImgList.add(WallPaperData(R.drawable.pp))
        wallImgList.add(WallPaperData(R.drawable.qq))
        wallImgList.add(WallPaperData(R.drawable.rr))
        wallImgList.add(WallPaperData(R.drawable.uu))
        wallImgList.add(WallPaperData(R.drawable.yy))
        wallImgList.add(WallPaperData(R.drawable.zz))
        wallImgList.add(WallPaperData(R.drawable.vv))
    }
}