package teddywilson.animationspractice;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Theodore Wilson on 4/3/17.
 * © Toeboat LLC
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Activity mActivity;

    public Adapter(Activity activity) {
        mActivity = activity;
    }

    @Override
    public int getItemCount(){
        return 5;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.row_anim_type, viewGroup, false);
        return new ViewHolder((CardView) v);
    }

    @Override
    public void onBindViewHolder(ViewHolder vh, int pos){
        switch (pos){
            case 0:
                vh.tv.setText("Fade in/out");
                break;

            case 1:
                vh.tv.setText("Dots animations");
                break;

            case 2:
                vh.tv.setText("Scale animation");
                break;

            case 3:
                vh.tv.setText("View pager");
                break;

            case 4:
                vh.tv.setText("Expanding FAB");
                break;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        CardView parent;
        TextView tv;

        ViewHolder(CardView root){
            super(root);
            parent = root;
            tv = (TextView) root.findViewById(R.id.text_view);
        }

    }
}
