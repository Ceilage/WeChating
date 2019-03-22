package cn.buaa.myweixin;
//Download by htp://www.codefans.net
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;


public class Appstart extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	new Handler().postDelayed(new Runnable(){
		@Override
		public void run(){
			Intent intent = new Intent (Appstart.this,Welcome.class);			
			startActivity(intent);			
			Appstart.this.finish();
		}
	}, 1000);
   }
}