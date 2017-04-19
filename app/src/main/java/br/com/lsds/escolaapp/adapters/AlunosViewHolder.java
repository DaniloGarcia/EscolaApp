package br.com.lsds.escolaapp.adapters;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.models.Alunos;

/**
 * Created by Danilo on 01/04/2017.
 */

public class AlunosViewHolder extends ChildViewHolder {

    private TextView txAluno;

    public AlunosViewHolder(View itemView) {
        super(itemView);

        txAluno = (TextView) itemView.findViewById(R.id.tx_nome_aluno);
    }

    public void onBind(Alunos Alunos, ExpandableGroup group) {
        txAluno.setText(Alunos.getName());
    }

}
