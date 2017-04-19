package br.com.lsds.escolaapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.models.Alunos;

/**
 * Created by Danilo on 03/04/2017.
 */

public class AlunosChamadosAdapter extends RecyclerView.Adapter<AlunosChamadosAdapter.AlunosViewHolder> {

    private Context context;
    private List<Alunos> alunos;

    public AlunosChamadosAdapter(Context context, List<Alunos> alunos) {
        this.context = context;
        this.alunos = alunos;
    }

    @Override
    public AlunosChamadosAdapter.AlunosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_alunos_chamados_card, parent, false);
        AlunosViewHolder holder = new AlunosViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(AlunosChamadosAdapter.AlunosViewHolder holder, int position) {
        Alunos aluno = alunos.get(position);
        holder.txtAluno.setText(aluno.getName());


    }

    @Override
    public int getItemCount() {
        return this.alunos != null ? this.alunos.size() : 0;
    }

    public class AlunosViewHolder extends RecyclerView.ViewHolder {
        TextView txtAluno;
        public AlunosViewHolder(View itemView) {
            super(itemView);
            txtAluno = (TextView) itemView.findViewById(R.id.tx_nome_aluno);
        }
    }
}
