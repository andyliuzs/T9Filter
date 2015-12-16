package duang.andyliuzs.t9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DuangT9 extends Activity implements OnClickListener {
	Button t9Btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duang_t9_main);
		initView();
	}

	private void initView() {
		t9Btn = (Button) findViewById(R.id.t9filter_main_btn);
		t9Btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.t9filter_main_btn:
			Intent intent =new Intent();
			intent.setClass(DuangT9.this, T9Page.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
