package pjh.mjc.createmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.BaseAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        /*
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
         */
        menu.add(0,1,3,"item1");
        menu.add(0,2,2,"item2");
        SubMenu submenu = menu.addSubMenu("submenu");
        submenu.add(0,3,0,"subitem1");
        submenu.add(0,4,1,"subitem2");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast.makeText(MainActivity.this, item.getItemId() + "is this item id", Toast.LENGTH_SHORT).show();
        return true;
    }
}