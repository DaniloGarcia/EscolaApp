package br.com.lsds.escolaapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.models.Alunos;

/**
 * Created by Danilo on 01/04/2017.
 */

public class AlunosAdapter extends ExpandableRecyclerViewAdapter<LocaisViewHolder, AlunosViewHolder> {

    private Activity activity;

    public AlunosAdapter(Activity activity, List<? extends ExpandableGroup> groups) {
        super(groups);
        this.activity = activity;
    }

    @Override
    public LocaisViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_alunos_group_local_holder, parent, false);

        return new LocaisViewHolder(view);
    }

    @Override
    public AlunosViewHolder onCreateChildViewHolder(ViewGroup parent, final int viewType) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_alunos_group_aluno_holder, parent, false);

        return new AlunosViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(AlunosViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Alunos Alunos = ((AlunosGroup) group).getItems().get(childIndex);
        holder.onBind(Alunos,group);
    }

    @Override
    public void onBindGroupViewHolder(LocaisViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGroupName(group);
    }
}
