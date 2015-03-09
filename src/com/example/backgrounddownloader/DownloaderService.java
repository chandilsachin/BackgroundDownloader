package com.example.backgrounddownloader;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class DownloaderService extends IntentService {

	public static final String URL = "url";
	
	public DownloaderService() {
		super("Downloader");
		
	}

	@Override
	protected void onHandleIntent(Intent arg0) {
		// TODO Auto-generated method stub
		
		String Url = arg0.getStringExtra(URL);
		Toast.makeText(getApplicationContext(), Url, Toast.LENGTH_SHORT).show();
		synchronized (this) {
			try {
				wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Toast.makeText(getApplicationContext(), "Stoped", Toast.LENGTH_SHORT).show();
	}

}
