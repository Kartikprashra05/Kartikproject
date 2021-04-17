
package com.random.news22;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView mimageview;
    TextView mtexview, mdes;
    /*  ItemClickListner itemClickListener;*/


    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mimageview = itemView.findViewById(R.id.image);
        this.mtexview = itemView.findViewById(R.id.Title);
        this.mdes = itemView.findViewById(R.id.description);
       /* itemView.setOnClickListener(this);
*/
    }
}

  /*  @Override
    public void onClick(View V) {
        this.itemClickListener.onItemClickListner(V, getLayoutPosition());


}
   public void setItemClickListener(ItemClickListner ic){
        this.itemClickListener = ic;
   }


}
*/




