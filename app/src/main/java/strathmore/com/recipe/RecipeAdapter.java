package strathmore.com.recipe;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mambo on 10/10/2017.
 */

public class RecipeAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Recipe> mDataSource;

    public RecipeAdapter(Context context, ArrayList<Recipe> items){
        mContext = context;
        mDataSource = items;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return  mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position ) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get view for row item
        TextView title, subTitle;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_recipe, parent, false);
            title = convertView.findViewById(R.id.recipe_list_title);
            subTitle = convertView.findViewById(R.id.recipe_list_subtitle);

        }
        Recipe recipe = mDataSource.get(position);


        return convertView;
    }
}

