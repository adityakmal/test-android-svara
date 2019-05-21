package com.example.testsvara;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter{
	Context context;
	String Menu[];
	int icon[];
	LayoutInflater inflater;
	
	public CustomAdapter(Context applicationContext, String[] Menu, int[] icon){
		this.context = context;
		this.Menu = Menu;
		this.icon = icon;
		inflater = (LayoutInflater.from(applicationContext));
	}
	
	@Override
	public int getCount(){
		return Menu.length;
	}
	
	@Override
	public Object getItem(int i){
		return null;
	}
	
	@Override
	public long getItemId(int i){
		return 0;
	}
	
	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		view = inflater.inflate(R.layout.tes, null);
		TextView menu = (TextView)view.findViewById(R.id.textView1);
		ImageView ikon = (ImageView) view.findViewById(R.id.icon);
		menu.setText(Menu[i]);
		ikon.setImageResource(icon[i]);
		return view;
	}
	
}
