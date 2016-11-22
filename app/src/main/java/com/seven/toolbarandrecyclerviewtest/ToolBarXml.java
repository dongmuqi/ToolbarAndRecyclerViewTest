package com.seven.toolbarandrecyclerviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Administrator on 2016/11/22.
 */

public class ToolBarXml extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.xml_tool_bar);
    Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
    toolbar.inflateMenu(R.menu.base_toolbar_menu);

  }
}
