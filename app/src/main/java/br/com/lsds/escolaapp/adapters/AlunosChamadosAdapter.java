package br.com.lsds.escolaapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.List;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.models.Alunos;

/**
 * Created by Danilo on 03/04/2017.
 */

public class AlunosChamadosAdapter extends RecyclerView.Adapter<AlunosChamadosAdapter.AlunosViewHolder> {

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    private Context context;
    private List<Alunos> alunos;
    private ListItemClickListener mOnClickListener;


    public AlunosChamadosAdapter(Context context, List<Alunos> alunos, ListItemClickListener listener) {
        this.context = context;
        this.alunos = alunos;
        this.mOnClickListener = listener;
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

    public class AlunosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtAluno;
        public AlunosViewHolder(final View itemView) {
            super(itemView);
            txtAluno = (TextView) itemView.findViewById(R.id.tx_nome_aluno);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }

    }
}
