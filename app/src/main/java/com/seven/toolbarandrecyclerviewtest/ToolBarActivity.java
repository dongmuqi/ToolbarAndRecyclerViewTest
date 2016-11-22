package com.seven.toolbarandrecyclerviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/22.
 */

public class ToolBarActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tool_bar);


    Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
    toolbar.setTitle("Title");
    toolbar.setSubtitle("subtitle");
    toolbar.setNavigationIcon(R.drawable.home);
    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent=new Intent(ToolBarActivity.this,MainActivity.class);
        startActivity(intent);

      }
    });
    toolbar.setLogo(R.mipmap.ic_launcher);
    toolbar.inflateMenu(R.menu.base_toolbar_menu);//设置右上角的填充菜单
    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
      @Override public boolean onMenuItemClick(MenuItem item) {
        int menuItemId = item.getItemId();
        if (menuItemId == R.id.action_search) {
          Toast.makeText(ToolBarActivity.this , "ck seach", Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_notification) {
          Toast.makeText(ToolBarActivity.this , "R.string.menu_notifications" , Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_item1) {
          Toast.makeText(ToolBarActivity.this , "R.string.item_01" , Toast.LENGTH_SHORT).show();

        } else if (menuItemId == R.id.action_item2) {
          Toast.makeText(ToolBarActivity.this ,"R.string.item_02" , Toast.LENGTH_SHORT).show();

        }
        return true;
      }
    });



  }
}
