import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import io.rohithram.flexmimic.R;

/**
 * Created by rohithram on 14/6/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.main1, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
