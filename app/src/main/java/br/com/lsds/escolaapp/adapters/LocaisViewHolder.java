package br.com.lsds.escolaapp.adapters;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import br.com.lsds.escolaapp.R;

/**
 * Created by Danilo on 01/04/2017.
 */

public class LocaisViewHolder extends GroupViewHolder {

    private TextView txLocal;

    public LocaisViewHolder(View itemView) {
        super(itemView);

        txLocal = (TextView) itemView.findViewById(R.id.tx_local);
    }

    @Override
    public void expand() {
        txLocal.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_up_black_24dp, 0);
        Log.i("Adapter", "expand");
    }

    @Override
    public void collapse() {
        Log.i("Adapter", "collapse");
        txLocal.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_down_black_24dp, 0);
    }

    public void setGroupName(ExpandableGroup group) {
        txLocal.setText(group.getTitle());
    }
}