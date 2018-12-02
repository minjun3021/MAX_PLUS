package maxplus.kmj.com.maxplus.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;

import maxplus.kmj.com.maxplus.R;
import maxplus.kmj.com.maxplus.item.Item;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    ArrayList<Item> item;

    public RecyclerviewAdapter(ArrayList<Item> item) {
        this.item = item;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //뷰만드는곳
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_message, parent, false);
        ViewHolder viewholder = new ViewHolder(v);
        return viewholder;
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { //안에 값설정ㅎ
        holder.t1.setText(item.get(position).getName());
        holder.t2.setText(String.valueOf(item.get(position).getAmount()));
        holder.t3.setText(item.get(position).getCheck());
        holder.t4.setText(item.get(position).getDate());
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4;
        public ViewHolder(View view) {
            super(view);
            t1=view.findViewById(R.id.item_t1);
            t2=view.findViewById(R.id.item_t2);
            t3=view.findViewById(R.id.item_t3);
            t4=view.findViewById(R.id.item_t4);

        }
    }

}