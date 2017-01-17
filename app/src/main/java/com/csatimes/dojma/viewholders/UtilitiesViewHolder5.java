package com.csatimes.dojma.viewholders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.csatimes.dojma.activities.UtilitiesMapsActivity;

/**
 * Created by Vikramaditya Kukreja on 22-07-2016.
 */

public class UtilitiesViewHolder5 extends RecyclerView.ViewHolder {

    public UtilitiesViewHolder5(final View itemView, final Context context) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UtilitiesMapsActivity.class);
                context.startActivity(intent);

            }
        });
    }

}
