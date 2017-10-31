package br.com.infomind.knoweaj;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**

 */

public class PontosInteresseF1 extends Fragment {
    private List<PontoInteresse> pontoInteresseArrayList =  new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.pontos_interesse, container, false);
        Context c = getContext();
        //logica do fragment

        final RecyclerView recyclerView = v.findViewById(R.id.recyclerview);

        carregaPontos();

        PontosInteresseAdapter  frutaAdapter = new PontosInteresseAdapter(c, pontoInteresseArrayList);
        recyclerView.setAdapter(frutaAdapter);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(c, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        recyclerView.addOnItemTouchListener(new RecyclerPontoInteresse(getContext(), recyclerView, new RecyclerPontoInteresse.OnItemClickListener() {

            @Override
            public void onItemClick(View view, final int position) {
                //Log.i("click", "clicou: "+listaSetor.get(position).getNome());

                TextView nome, desc, resp, email, tele, hor, lati, longi;
                Button button;
                ImageView imageView;

                Activity activity = getActivity();
                PontoInteresse p = pontoInteresseArrayList.get(position);

                final TabLayout tabLayout = activity.findViewById(R.id.tab);

                nome = activity.findViewById(R.id.nome);
                desc = activity.findViewById(R.id.desc);
                resp = activity.findViewById(R.id.responsavel);
                email = activity.findViewById(R.id.email);
                tele = activity.findViewById(R.id.telefone);
                hor = activity.findViewById(R.id.horario);
                //lati = activity.findViewById(R.id.lati);
                //longi = activity.findViewById(R.id.logi);
                imageView = activity.findViewById(R.id.im);


                nome.setText(p.getNome());
                desc.setText(p.getDescricao());
                resp.setText("Responsável: " + p.getResponsavel());
                email.setText("E-mail: " + p.getEmail());
                tele.setText("Telefone: " + p.getTelefone());
                hor.setText("Horário: " + p.getHorario());
                imageView.setImageResource(p.getImagem());

                //ACHEI NO STACKOVERFLOW
                //https://stackoverflow.com/questions/32306136/switch-tabs-from-fragment
                tabLayout.getTabAt(1).select();

            }

            @Override
            public void onItemLongClick(View view, int position) {
                Snackbar.make((View) view.getParent(), "Tente so clicar", Snackbar.LENGTH_SHORT).show();
            }
        }));

        return v;
    }

    public void carregaPontos(){

        PontoInteresse p1 = new PontoInteresse(1, R.drawable.info, -5.885786, -35.365748, "Prédio da Informatica",
        "Coordena todas as atividades dos cursos tecnológicos oferecidos pela EAJ (TADS-Graduação e Técnico em Informática)"
               ,"Leonardo Teixeira/Taniro Rodrigues",
        "eajInformatica@eaj.urfn.br", "(84) 555-1385", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p1);

        PontoInteresse p2 = new PontoInteresse(11, R.drawable.diretoria, -5.886449, -35.362213, "Diretoria", "A diretoria da EAJ/UFRN coordena todas as atividades " +
        "realizadas na escolas. Sua autonomia abrange os Cursos Técnicos de Ensino Médio, bem como as graduações oferecidas pela escola nas áreas agrícolas e demais áreas."+
        "Também realiza a gestão de toda infraestrutura da escola, manutenção, construções, e ainda a operacionalização do RU.",
        "Julio César", "eajDirecao@eaj.ufrn.br", "(84) 3222-2311", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p2);

        PontoInteresse p3 = new PontoInteresse(4, R.drawable.biblio, -5.885911, -35.366131, "Biblioteca",
        "Biclioteca da UFRN/EAJ disponível aos alunos do médio e graduação. " + "Dispõe de estrutura confortável com Ar-condicionado e Wifi. ", "Petunia Dolores Silva", "eajBiblioteca@eaj.ufrn.br", "(84) 6666-6666", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p3);

        PontoInteresse p4 = new PontoInteresse(6, R.drawable.agroi, -5.885453, -35.366123, "Agroindustria", "Prédio do Curso Técnico de Agroindústria."
        , "Joaquim José da Silva Xavier",
        "eajAgroindustria@eaj.ufrn.br", "84 6666-6161", "7h-17h");
        pontoInteresseArrayList.add(p4);

        PontoInteresse p5 = new PontoInteresse(3, R.drawable.cvt, -5.884567, -35.364924, "CVT", "O Centro Vocacional Tecnologico, conta com laboratorios " +
        "preparados para o ensino de graduação e Ensino Médio, Quimica, fisica, biologia e Agroidustria.", "André Stuwart", "eajCVT@eaj.ufrn.br", "84 3221-3245", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p5);

        PontoInteresse p6 = new PontoInteresse(2, R.drawable.medio, -5.885205, -35.364782, "Ensino Médio",
        "Setor de Ensino Médio para alunos integrados com algum curso técnico possam estudar as materias de " +
                "Ensino Médio.", "Ligia Pereira",
        "eajMedio@eaj.ufrn.br", "(84) 3234-3234", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p6);

        PontoInteresse p7 = new PontoInteresse(5, R.drawable.aqui, -5.887602, -35.361685, "Aquicultura", "O Setor de Aquicultura é onde o curso de " +
        "mesmo nome é ministrado com o foco em criação de peixes em cativeiro.",
        "Paulo Faria", "eajAquicultura@eaj.ufrn.br", "(84) 3232-3443", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p7);

        PontoInteresse p8 = new PontoInteresse(8, R.drawable.apicultura, 5.885880, -35.362644, "Apicultura", "O setor de Apicultura é onde o curso de " +
        "mesmo nome é ministrado por professores exepcionais e uma das melhores fabricas de mel caseiro da escola",
        "Apicultorino Peixoto", "eajApicultura@eaj.ufrn.br", "88 8888-8888", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p8);

        PontoInteresse p9 = new PontoInteresse(12, R.drawable.etec, -5.885260, -35.366496, "E-Tec", "Através da Escola Agrícola de Jundiaí (EAJ) da Universidade Federal do Rio Grande do Norte (UFRN), o e-Tec/EAJ está presente em 30 municípios: Acari, Apodi, Areia Branca, Assu, Caicó, Caraúbas, Ceará-Mirim, Currais Novos, Goianinha, Ipanguaçu, Itajá, Jaçanã, João Câmara, Lajes, Macaíba, Macau, Martins, Monte Alegre, Mossoró, Natal, Nova Cruz, Parelhas, Parnamirim, Santa Cruz, São Gonçalo do Amarante, São João do Sabugi, São José de Mipibu, São Paulo do Potengi, Touros e Vera Cruz.", "Max Lacerda", "eajEtec@eaj.ufrn.br", "12 1212-1212", "7h-17h");
        pontoInteresseArrayList.add(p9);

        PontoInteresse p10 = new PontoInteresse(13, R.drawable.ru, -5.885471, -35.362908, "RU", "Restaurante Universitário(RU) oferece cardápios diferentes para cada dia da semana," +
        " possui uma boa infraestrutura, conta com coordenação de um nutricionista e está disponível a todos alunos e professores da escola." +
        " Possui uma taxa de R$ 7,00 paara cada refeição.",
        "Agropecuariano Firmino", "eajAgropecuaria@eaj.ufrn.br", "(84)3231-5589", "07:00 às 17:00h");
        pontoInteresseArrayList.add(p10);


    }
}