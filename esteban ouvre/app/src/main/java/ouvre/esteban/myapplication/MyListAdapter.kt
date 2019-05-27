package ouvre.esteban.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell.view.*

class MyListAdapter : RecyclerView.Adapter< MyListAdapter.ViewHolder >() {

    var list : List<Post> = emptyList()
    var userList : List<User> = emptyList()

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.cell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.cellText.text = list[position].title
        holder.itemView.cellTextUser.text = userList[list[position].userId-1].username
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

/*
   fun Dicho(list: List<User>, idpost: Int){

       var debut : Int
       var fin : Int
       var valeur : Int
       var t = list
       var trouve : Boolean
       var mil : Int

       debut = 0
       fin = list.count()
       trouve = false
       valeur = idpost


       while (trouve != true and debut <= fin){

           mil = (debut+fin)/2
           if (t[mil].id == valeur){
               trouve = true
               return valeur
           }else{
               if (valeur > t[mil].id){
                      debut = mil+1
                   }else{
                        fin = mil-1
               }
           }
           return valeur
       }
   }*/
}