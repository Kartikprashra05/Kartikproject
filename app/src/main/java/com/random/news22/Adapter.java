

package com.random.news22;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Adapter  extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public Adapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        final Model temp = models.get(position);
        myHolder.mtexview.setText(models.get(position).getTitle());
        myHolder.mdes.setText(models.get(position).getDescription());
        myHolder.mimageview.setImageResource(models.get(position).getImage());


        myHolder.mtexview.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick (View v){
                Intent intent = new Intent(c,AnotherActivity.class);

                intent.putExtra("Image",temp.getImage());
                intent.putExtra("Title",temp.getTitle());
                intent.putExtra("des",temp.getDescription());

                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                c.startActivity(intent);
            }
        });









            }


            /*    String gtitle = models.get(position).getTitle();
                String gdes = models.get(position).getDescription();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) myHolder.mimageview.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();


                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();
                Intent intent = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gtitle);
                intent.putExtra("iDes", gdes);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);
            }

        });
        myHolder.setItemClickListener(new ItemClickListner() {
            @Override
            public void onItemClickListner(View v, int position) {
                if (models.get(position).getTitle().equals("Google is redefining mobile with artificial intelligence")) {
                }
                if (models.get(position).getTitle().equals("BJP Chief JP Nadda releases party's manifesto for Assam, makes 10 commitments")) {
                }
                if (models.get(position).getTitle().equals("Google is redefining mobile with artificial intelligence")) {
                }
                if (models.get(position).getTitle().equals("Google is redefining mobile with artificial intelligence")) {
                }
                if (models.get(position).getTitle().equals("Google is redefining mobile with artificial intelligence")) {
                }
                if (models.get(position).getTitle().equals("Google is redefining mobile with artificial intelligence")) {
                }

            }
        });
    }
*/

    @Override
    public int getItemCount() {
        return models.size();
    }
}











