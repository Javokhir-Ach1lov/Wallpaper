package uz.javokhir_apps.wallpaper.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import uz.javokhir_apps.wallpaper.MainActivity
import uz.javokhir_apps.wallpaper.R
import uz.javokhir_apps.wallpaper.model.WallPaperData

class WallPaperAdapter(var c:Context,val wallImgList:ArrayList<WallPaperData>)
    :RecyclerView.Adapter<WallPaperAdapter.WallPaperViewHolder>()

{
        inner class WallPaperViewHolder(val v : View):RecyclerView.ViewHolder(v){
            val wallPaperImg=v.findViewById<ImageView>(R.id.wall_img)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallPaperViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val v=inflater.inflate(R.layout.wall_paper_item,parent,false)
        return WallPaperViewHolder(v)
    }
    override fun onBindViewHolder(holder: WallPaperViewHolder, position: Int) {
        val newListWall=wallImgList[position]
        holder.wallPaperImg.setImageResource(newListWall.wallImg)
        holder.wallPaperImg.setOnClickListener {
            val wallInt=Intent(c,MainActivity::class.java)
            wallInt.putExtra("wallImg",newListWall.wallImg)
            c.startActivity(wallInt)
        }
    }
    override fun getItemCount(): Int =wallImgList.size
}