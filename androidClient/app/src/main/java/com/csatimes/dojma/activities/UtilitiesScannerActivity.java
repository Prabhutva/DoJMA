package com.csatimes.dojma.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.csatimes.dojma.R;
import com.google.android.gms.vision.barcode.Barcode;
import com.notbytes.barcode_reader.BarcodeReaderActivity;
public class UtilitiesScannerActivity extends AppCompatActivity {

	public static TextView tvresult;
	int BARCODE_READER_ACTIVITY_REQUEST=250;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_utility_scanner);

		tvresult = (TextView) findViewById(R.id.scanresult);

		Button btn = (Button) findViewById(R.id.scanbtn);

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent launchIntent = BarcodeReaderActivity.getLaunchIntent(v.getContext(), true, false);
				startActivityForResult(launchIntent, BARCODE_READER_ACTIVITY_REQUEST);
			}
		});


	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (resultCode != Activity.RESULT_OK) {
			Toast.makeText(this, "error in  scanning", Toast.LENGTH_SHORT).show();
			return;
		}

		if (requestCode == BARCODE_READER_ACTIVITY_REQUEST && data != null) {
			Barcode barcode = data.getParcelableExtra(BarcodeReaderActivity.KEY_CAPTURED_BARCODE);
			Toast.makeText(this, barcode.rawValue, Toast.LENGTH_SHORT).show();
		}

	}
}
