package com.coopone.androidflip;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView flipResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		flipResult = (TextView) findViewById(R.id.FlipResult);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void flipCoin(View view)
	{
		int randomNumber;
		System.out.println("Flip Coin Button Clicked");
		Random random = new Random();
		randomNumber = random.nextInt();
		System.out.println("Random Number :" +randomNumber);
		
		if ((randomNumber % 2) == 0)
		{
			flipResult.setText(R.string.heads);
		}
		else
		{
			flipResult.setText(R.string.tails);
		}
	}
}
