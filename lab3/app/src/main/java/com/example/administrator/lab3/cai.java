package com.example.administrator.lab3;


        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Toast;

public class cai extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hhh, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch(item.getItemId()){
            case R.id.menu_about:
                Toast.makeText(cai.this, ""+"关于", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_settings:

                Toast.makeText(cai.this, ""+"设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_quit:

                Toast.makeText(cai.this, ""+"退出", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
//         Toast.makeText(MainActivity.this, ""+item.getItemId(), Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }

}