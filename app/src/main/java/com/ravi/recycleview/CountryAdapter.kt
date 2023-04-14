package com.ravi.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
     var context: Context) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {


    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView){
        var textViewCountryname : TextView = itemView.findViewById(R.id.textViewCountry)
        var textViewDetails : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageView : CircleImageView = itemView.findViewById(R.id.imageView)

        var cardview : CardView = itemView.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryNameList.size

    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        holder.textViewCountryname.text = countryNameList.get(position)
        holder.textViewDetails.text = detailsList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

        holder.cardview.setOnClickListener {
            Toast.makeText(context,"You selected the ${countryNameList.get(position)}",Toast.LENGTH_LONG).show()
        }

    }



}