package com.example.marymathauser.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.marymathauser.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;
    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_mat,"Phd Mathematics","The Mary Matha College's Department of Mathematics succeeds admirably in both advancing science and extending fundamental knowledge. It is recognized as a research center by Kannur University and research in the department in the fundamental core subjects of algebra, analysis, geometry, and topology is prolific, highly visible and internationally recognized. Our faculty maintain active research programs that have let to regular publications in mathematics."));
        list.add(new BranchModel(R.drawable.ic_fly,"Phd Zoology","The Research Centre Zoology, attached to the Biological Techniques Department, is actively involved in guiding students for their doctoral thesis. The Faculty-in-Charge of the Department and Research Centre, Dr Sudha Devi A R, is a recognized Research Guide of Kannur University.The research Lab is well equipped with major instruments for research. The Centre also outsources the infrastructural facilities of academic and research institutions in and outside the state like Sophisticated Instrumentation Centre for Applied Research and Testing (SICART) Ahmedabad, National Institute of Mental Health And Neuro Sciences (NIMHANS) Bangalore, Sophisticated Analytical Instrument Facility of IIT Madras,  Zoological Survey of India, Pune and Kerala Veterinary and Animal Sciences University (KVASU), Wayanad."));
        list.add(new BranchModel(R.drawable.ic_pc," MSc Computer Science","MSc Computer Science is a 4 semester aided programme affiliated to Kannur University that includes the core areas of Computer Science. The objective of the course is to mould students to acquire analytical, creative and problem solving skills to meet industry standard and be well prepared for research activities. We offers programme as module based and students engage in intensive training through lecturers, supervised research and programming language training"));
        list.add(new BranchModel(R.drawable.ic_mat,"MSc Mathematics","Two Year Masters Programme in Mathematics aims at developing mathematical ability in students with acute and abstract reasoning."));
        list.add(new BranchModel(R.drawable.ic_pc,"BSc Computer Science","The B.Sc (CS) course mainly focuses on the mathematical and theoretical foundations of computing, rather than teaching specific technologies that may quickly become outdated. The course covers all aspects of computers right from the basic fundamentals of computers to database systems & advanced courses like C++, Java, Web Technology etc. It is specially designed for students looking to a career in computers, and it prepares you for higher education"));
        list.add(new BranchModel(R.drawable.ic_mat,"BSc Mathematics","This course covers the central ideas and developments of pure and applied mathematics. It offers an ideal start for anyone wanting to pursue a career in which a sound knowledge of the subject is essential. The degree is designed to develop your analytical and strategic thinking skills as well as equipping you with professional software experience and in applying mathematics to solve a wide variety of problems"));
        list.add(new BranchModel(R.drawable.ic_fly,"BSc Zoology","Zoology is literally ‘all about animals’. Students receive a thorough grounding in general zoology, exploring the diversity of animal form and function, and the evolution and ecology of the major animal groups. Through a series of individual modules which offer an element of choice, students will cover both invertebrate and vertebrate zoology and consider applied aspects such as parasitology. We offer several opportunities to carry out field studies, both home and abroad, and to work in a research laboratory"));
        list.add(new BranchModel(R.drawable.ic_ph,"BSc Physics","This course covers the central ideas and developments of pure and applied mathematics. It offers an ideal start for anyone wanting to pursue a career in which a sound knowledge of the subject is essential. The degree is designed to develop your analytical and strategic thinking skills as well as equipping you with professional software experience and in applying mathematics to solve a wide variety of problems"));
        list.add(new BranchModel(R.drawable.ic_ch,"BSc Chemistry","The B.Sc chemistry graduates have many options for their higher studies. Majority of these graduates opt for master’s degree in the same. But they can also choose various specialized areas in this field for the post graduation courses. Many universities offer the study of chemistry at post graduate and at doctoral levels."));
        list.add(new BranchModel(R.drawable.ic_bc,"BCom","hree year degree program is designed to provide an insight into the world of commerce. The program develops the managerial skills and focuses on the overall personality development of the students. This course also helps students to crack CPT, IPCC, ICWA, CS, Bank PO Exams and other competitive exams.  It has become an essential qualification for businesses and an important educational landmark. This is because it leads a student to higher education opportunities in the field of Business and commerce"));
        list.add(new BranchModel(R.drawable.ic_en,"BA Functional English","BA Functional English is a subject where practical methods of learning English like making conversations, knowledge about phonetics, grammar etc are taught. Also situations are given and students are asked to make conversations based on the situation, hence one who studies Functional English can speak english fluently. Practice in writing is also there"));

        adapter = new BranchAdapter(getContext(),list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Mary Matha Arts and Science College");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

}