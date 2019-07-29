package com.csatimes.dojma.viewholders;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.csatimes.dojma.activities.UtilitiesScannerActivity;


public class UtilitiesScannerViewHolder extends RecyclerView.ViewHolder {
	public UtilitiesScannerViewHolder(final View itemView, final Context context)
	{
		super(itemView);
		itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//Intent intent = new Intent(context, UtilitiesScannerActivity.class);
				Intent intent = new Intent(context, UtilitiesScannerActivity.class);
				context.startActivity(intent);

			}
		});
	}

}
