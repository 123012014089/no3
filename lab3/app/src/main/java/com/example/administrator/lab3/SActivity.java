package com.example.administrator.lab3;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.util.Log;
public class SActivity extends ListActivity {

    private static final int ITEM1 = Menu.FIRST;
    private static final int ITEM2 = Menu.FIRST+1;
    private static final int ITEM3 = Menu.FIRST+2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showListView();

        //为 ListView 的所有 item 注册 ContextMenu
        registerForContextMenu(getListView());
        //这里的registerForContextMenu()也可以用下面的语句替代
        //getListView().setOnCreateContextMenuListener(this);
    }

    private void showListView(){
        String[] mString = new String[]{
                "路飞-Monkey D Luffy",
                "奈美-Nami",
                "卓洛-Zoro",
                "山治-Sanji",
                "尼可·罗宾-Ms. All Sunday",
                "乌索普-usoppu",
                "托尼托尼·乔巴-Tony Tony Chopper",
        };
        ArrayAdapter<String> mla = new ArrayAdapter<String>(SActivity.this,
                R.layout.activity_s, mString);
        SActivity.this.setListAdapter(mla);
    }

    //上下文菜单，本例会通过长按条目激活上下文菜单
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("人物简介");
        //添加菜单项
        menu.add(0, ITEM1, 0, "特长");
        menu.add(0, ITEM2, 0, "战斗力");
        menu.add(0, ITEM3, 0, "经典语录");
    }

    //菜单单击响应
    @Override
    public boolean onContextItemSelected(MenuItem item){
        //获取当前被选择的菜单项的信息
        //AdapterContextMenuInfo info = (AdapterContextMenuInfo)item.getMenuInfo();
        //Log.i("braincol",String.valueOf(info.id));
        switch(item.getItemId()){
            case ITEM1:
                //在这里添加处理代码

                break;
            case ITEM2:
                //在这里添加处理代码

                break;
            case ITEM3:
                //在这里添加处理代码

                break;
        }
        return true;
    }

}