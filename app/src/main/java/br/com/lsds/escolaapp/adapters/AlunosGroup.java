package br.com.lsds.escolaapp.adapters;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.List;
import br.com.lsds.escolaapp.models.Alunos;

public class AlunosGroup extends ExpandableGroup<Alunos> {

    public AlunosGroup(String title, List<Alunos> items) {
        super(title, items);
    }
}