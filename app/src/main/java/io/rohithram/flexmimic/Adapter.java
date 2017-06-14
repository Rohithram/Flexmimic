package io.rohithram.flexmimic;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rohithram on 14/6/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  implements View.OnClickListener{
    Context context;
    List<String> cardcontent;
    List<String> carddate;
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.content_main, parent, false);
        return new ViewHolder(itemView);
    }
    public Adapter(Context context, List<String> cardcontent,List<String> carddate){
        this.context = context;
        this.cardcontent = cardcontent;
        this.carddate = carddate;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.tv_maindate.setText(carddate.get(holder.getAdapterPosition()));
        holder.tv_briefdes.setText(cardcontent.get(holder.getAdapterPosition()));

        holder.cv_content.setOnClickListener((View.OnClickListener) this.context);
        holder.bt_show.setOnClickListener((View.OnClickListener) this.context);
        holder.bt_share.setOnClickListener((View.OnClickListener) this.context);
        holder.bt_save.setOnClickListener((View.OnClickListener) this.context);
        holder.bt_sched.setOnClickListener((View.OnClickListener) this.context);
        holder.bt_contact.setOnClickListener((View.OnClickListener) this.context);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv_content: break;
            case R.id.bt_show: break;
            case R.id.bt_share: break;
            case R.id.bt_save: break;
            case R.id.bt_sched: break;
            case R.id.bt_contact: break;


        }

    }

    @Override
    public int getItemCount() {
        return cardcontent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv_content;
        TextView tv_maindate;
        TextView tv_briefdes;
        ImageButton bt_share,bt_save,bt_show,bt_sched,bt_contact;
        public ViewHolder(View itemView) {
            super(itemView);
            cv_content = (CardView)itemView.findViewById(R.id.cv_content);
            tv_maindate = (TextView)itemView.findViewById(R.id.tv_maindate);
            tv_briefdes =(TextView)itemView.findViewById(R.id.tv_briefdes);
            bt_share = (ImageButton)itemView.findViewById(R.id.bt_share);
            bt_save = (ImageButton)itemView.findViewById(R.id.bt_save);
            bt_sched = (ImageButton)itemView.findViewById(R.id.bt_sched);
            bt_contact = (ImageButton)itemView.findViewById(R.id.bt_contact);
            bt_show = (ImageButton)itemView.findViewById(R.id.bt_show);


        }
    }
}
