package com.a1_1801040055.hellojapan;



import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ScrollView view1;
    ScrollView view2;
    TextView title1;
    TextView title2;
    Button Hiragana;
    Button Katakana;
    ImageButton btnA1;
    ImageButton btnI1;
    ImageButton btnU1;
    ImageButton btnE1;
    ImageButton btnO1;
    ImageButton btnKa1;
    ImageButton btnKi1;
    ImageButton btnKu1;
    ImageButton btnKe1;
    ImageButton btnKo1;
    ImageButton btnSa1;
    ImageButton btnShi1;
    ImageButton btnSu1;
    ImageButton btnSe1;
    ImageButton btnSo1;
    ImageButton btnTa1;
    ImageButton btnChi1;
    ImageButton btnTsu1;
    ImageButton btnTe1;
    ImageButton btnTo1;
    ImageButton btnNa1;
    ImageButton btnNi1;
    ImageButton btnNu1;
    ImageButton btnNe1;
    ImageButton btnNo1;
    ImageButton btnHa1;
    ImageButton btnHi1;
    ImageButton btnFu1;
    ImageButton btnHe1;
    ImageButton btnHo1;
    ImageButton btnMa1;
    ImageButton btnMi1;
    ImageButton btnMu1;
    ImageButton btnMe1;
    ImageButton btnMo1;
    ImageButton btnYa1;
    ImageButton btnYu1;
    ImageButton btnYo1;
    ImageButton btnRa1;
    ImageButton btnRi1;
    ImageButton btnRu1;
    ImageButton btnRe1;
    ImageButton btnRo1;
    ImageButton btnWa1;
    ImageButton btnWo1;
    ImageButton btnN1;
    ImageButton btnEmpty;
    ImageButton btnA2;
    ImageButton btnI2;
    ImageButton btnU2;
    ImageButton btnE2;
    ImageButton btnO2;
    ImageButton btnKa2;
    ImageButton btnKi2;
    ImageButton btnKu2;
    ImageButton btnKe2;
    ImageButton btnKo2;
    ImageButton btnSa2;
    ImageButton btnShi2;
    ImageButton btnSu2;
    ImageButton btnSe2;
    ImageButton btnSo2;
    ImageButton btnTa2;
    ImageButton btnChi2;
    ImageButton btnTsu2;
    ImageButton btnTe2;
    ImageButton btnTo2;
    ImageButton btnNa2;
    ImageButton btnNi2;
    ImageButton btnNu2;
    ImageButton btnNe2;
    ImageButton btnNo2;
    ImageButton btnHa2;
    ImageButton btnHi2;
    ImageButton btnFu2;
    ImageButton btnHe2;
    ImageButton btnHo2;
    ImageButton btnMa2;
    ImageButton btnMi2;
    ImageButton btnMu2;
    ImageButton btnMe2;
    ImageButton btnMo2;
    ImageButton btnYa2;
    ImageButton btnYu2;
    ImageButton btnYo2;
    ImageButton btnRa2;
    ImageButton btnRi2;
    ImageButton btnRu2;
    ImageButton btnRe2;
    ImageButton btnRo2;
    ImageButton btnWa2;
    ImageButton btnWo2;
    ImageButton btnN2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = findViewById(R.id.scrollView1);
        view2 = findViewById(R.id.scrollView2);
        title1 = findViewById(R.id.title1);
        title2 = findViewById(R.id.title2);
        Hiragana = findViewById(R.id.Hiragana);
        Katakana = findViewById(R.id.Katakana);
        btnA1 = findViewById(R.id.imageButtonA1);
        btnI1 = findViewById(R.id.imageButtonI1);
        btnU1 = findViewById(R.id.imageButtonU1);
        btnE1 = findViewById(R.id.imageButtonE1);
        btnO1 = findViewById(R.id.imageButtonO1);
        btnKa1 = findViewById(R.id.imageButtonKa1);
        btnKi1 = findViewById(R.id.imageButtonKi1);
        btnKu1 = findViewById(R.id.imageButtonKu1);
        btnKe1 = findViewById(R.id.imageButtonKe1);
        btnKo1 = findViewById(R.id.imageButtonKo1);
        btnSa1 = findViewById(R.id.imageButtonSa1);
        btnShi1 = findViewById(R.id.imageButtonShi1);
        btnSu1 = findViewById(R.id.imageButtonSu1);
        btnSe1 = findViewById(R.id.imageButtonSe1);
        btnSo1 = findViewById(R.id.imageButtonSo1);
        btnTa1 = findViewById(R.id.imageButtonTa1);
        btnChi1 = findViewById(R.id.imageButtonChi1);
        btnTsu1 = findViewById(R.id.imageButtonTsu1);
        btnTe1 = findViewById(R.id.imageButtonTe1);
        btnTo1 = findViewById(R.id.imageButtonTo1);
        btnNa1 = findViewById(R.id.imageButtonNa1);
        btnNi1 = findViewById(R.id.imageButtonNi1);
        btnNu1 = findViewById(R.id.imageButtonNu1);
        btnNe1 = findViewById(R.id.imageButtonNe1);
        btnNo1 = findViewById(R.id.imageButtonNo1);
        btnHa1 = findViewById(R.id.imageButtonHa1);
        btnHi1 = findViewById(R.id.imageButtonHi1);
        btnFu1 = findViewById(R.id.imageButtonFu1);
        btnHe1 = findViewById(R.id.imageButtonHe1);
        btnHo1 = findViewById(R.id.imageButtonHo1);
        btnMa1 = findViewById(R.id.imageButtonMa1);
        btnMi1 = findViewById(R.id.imageButtonMi1);
        btnMu1 = findViewById(R.id.imageButtonMu1);
        btnMe1 = findViewById(R.id.imageButtonMe1);
        btnMo1 = findViewById(R.id.imageButtonMo1);
        btnYa1 = findViewById(R.id.imageButtonYa1);
        btnYu1 = findViewById(R.id.imageButtonYu1);
        btnYo1 = findViewById(R.id.imageButtonYo1);
        btnRa1 = findViewById(R.id.imageButtonRa1);
        btnRi1 = findViewById(R.id.imageButtonRi1);
        btnRu1 = findViewById(R.id.imageButtonRu1);
        btnRe1 = findViewById(R.id.imageButtonRe1);
        btnRo1 = findViewById(R.id.imageButtonRo1);
        btnWa1 = findViewById(R.id.imageButtonWa1);
        btnWo1= findViewById(R.id.imageButtonWo1);
        btnN1 = findViewById(R.id.imageButtonN1);
        btnEmpty = findViewById(R.id.imageButtonEmpty);
        btnA2 = findViewById(R.id.imageButtonA2);
        btnI2 = findViewById(R.id.imageButtonI2);
        btnU2 = findViewById(R.id.imageButtonU2);
        btnE2 = findViewById(R.id.imageButtonE2);
        btnO2 = findViewById(R.id.imageButtonO2);
        btnKa2 = findViewById(R.id.imageButtonKa2);
        btnKi2 = findViewById(R.id.imageButtonKi2);
        btnKu2 = findViewById(R.id.imageButtonKu2);
        btnKe2 = findViewById(R.id.imageButtonKe2);
        btnKo2 = findViewById(R.id.imageButtonKo2);
        btnSa2 = findViewById(R.id.imageButtonSa2);
        btnShi2 = findViewById(R.id.imageButtonShi2);
        btnSu2 = findViewById(R.id.imageButtonSu2);
        btnSe2 = findViewById(R.id.imageButtonSe2);
        btnSo2 = findViewById(R.id.imageButtonSo2);
        btnTa2 = findViewById(R.id.imageButtonTa2);
        btnChi2 = findViewById(R.id.imageButtonChi2);
        btnTsu2 = findViewById(R.id.imageButtonTsu2);
        btnTe2 = findViewById(R.id.imageButtonTe2);
        btnTo2 = findViewById(R.id.imageButtonTo2);
        btnNa2 = findViewById(R.id.imageButtonNa2);
        btnNi2= findViewById(R.id.imageButtonNi2);
        btnNu2 = findViewById(R.id.imageButtonNu2);
        btnNe2 = findViewById(R.id.imageButtonNe2);
        btnNo2 = findViewById(R.id.imageButtonNo2);
        btnHa2 = findViewById(R.id.imageButtonHa2);
        btnHi2 = findViewById(R.id.imageButtonHi2);
        btnFu2 = findViewById(R.id.imageButtonFu2);
        btnHe2 = findViewById(R.id.imageButtonHe2);
        btnHo2 = findViewById(R.id.imageButtonHo2);
        btnMa2 = findViewById(R.id.imageButtonMa2);
        btnMi2 = findViewById(R.id.imageButtonMi2);
        btnMu2 = findViewById(R.id.imageButtonMu2);
        btnMe2 = findViewById(R.id.imageButtonMe2);
        btnMo2 = findViewById(R.id.imageButtonMo2);
        btnYa2 = findViewById(R.id.imageButtonYa2);
        btnYu2 = findViewById(R.id.imageButtonYu2);
        btnYo2 = findViewById(R.id.imageButtonYo2);
        btnRa2 = findViewById(R.id.imageButtonRa2);
        btnRi2 = findViewById(R.id.imageButtonRi2);
        btnRu2 = findViewById(R.id.imageButtonRu2);
        btnRe2 = findViewById(R.id.imageButtonRe2);
        btnRo2 = findViewById(R.id.imageButtonRo2);
        btnWa2 = findViewById(R.id.imageButtonWa2);
        btnWo2 = findViewById(R.id.imageButtonWo2);
        btnN2 = findViewById(R.id.imageButtonN2);

        Hiragana.setOnClickListener(this);
        Katakana.setOnClickListener(this);
        btnA1.setOnClickListener(this);
        btnI1.setOnClickListener(this);
        btnU1.setOnClickListener(this);
        btnE1.setOnClickListener(this);
        btnO1.setOnClickListener(this);
        btnU1.setOnClickListener(this);
        btnE1.setOnClickListener(this);
        btnO1.setOnClickListener(this);
        btnKa1.setOnClickListener(this);
        btnKi1.setOnClickListener(this);
        btnKu1.setOnClickListener(this);
        btnKe1.setOnClickListener(this);
        btnKo1.setOnClickListener(this);
        btnSa1.setOnClickListener(this);
        btnShi1.setOnClickListener(this);
        btnSu1.setOnClickListener(this);
        btnSe1.setOnClickListener(this);
        btnSo1.setOnClickListener(this);
        btnTa1.setOnClickListener(this);
        btnChi1.setOnClickListener(this);
        btnTsu1.setOnClickListener(this);
        btnTe1.setOnClickListener(this);
        btnTo1.setOnClickListener(this);
        btnNa1.setOnClickListener(this);
        btnNi1.setOnClickListener(this);
        btnNu1.setOnClickListener(this);
        btnNe1.setOnClickListener(this);
        btnNo1.setOnClickListener(this);
        btnHa1.setOnClickListener(this);
        btnHi1.setOnClickListener(this);
        btnFu1.setOnClickListener(this);
        btnHe1.setOnClickListener(this);
        btnHo1.setOnClickListener(this);
        btnMa1.setOnClickListener(this);
        btnMi1.setOnClickListener(this);
        btnMu1.setOnClickListener(this);
        btnMe1.setOnClickListener(this);
        btnMo1.setOnClickListener(this);
        btnYa1.setOnClickListener(this);
        btnYu1.setOnClickListener(this);
        btnYo1.setOnClickListener(this);
        btnRa1.setOnClickListener(this);
        btnRi1.setOnClickListener(this);
        btnRu1.setOnClickListener(this);
        btnRe1.setOnClickListener(this);
        btnRo1.setOnClickListener(this);
        btnWa1.setOnClickListener(this);
        btnWo1.setOnClickListener(this);
        btnN1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnI2.setOnClickListener(this);
        btnU2.setOnClickListener(this);
        btnE2.setOnClickListener(this);
        btnO2.setOnClickListener(this);
        btnU2.setOnClickListener(this);
        btnE2.setOnClickListener(this);
        btnO2.setOnClickListener(this);
        btnKa2.setOnClickListener(this);
        btnKi2.setOnClickListener(this);
        btnKu2.setOnClickListener(this);
        btnKe2.setOnClickListener(this);
        btnKo2.setOnClickListener(this);
        btnSa2.setOnClickListener(this);
        btnShi2.setOnClickListener(this);
        btnSu2.setOnClickListener(this);
        btnSe2.setOnClickListener(this);
        btnSo2.setOnClickListener(this);
        btnTa2.setOnClickListener(this);
        btnChi2.setOnClickListener(this);
        btnTsu2.setOnClickListener(this);
        btnTe2.setOnClickListener(this);
        btnTo2.setOnClickListener(this);
        btnNa2.setOnClickListener(this);
        btnNi2.setOnClickListener(this);
        btnNu2.setOnClickListener(this);
        btnNe2.setOnClickListener(this);
        btnNo2.setOnClickListener(this);
        btnHa2.setOnClickListener(this);
        btnHi2.setOnClickListener(this);
        btnFu2.setOnClickListener(this);
        btnHe2.setOnClickListener(this);
        btnHo2.setOnClickListener(this);
        btnMa2.setOnClickListener(this);
        btnMi2.setOnClickListener(this);
        btnMu2.setOnClickListener(this);
        btnMe2.setOnClickListener(this);
        btnMo2.setOnClickListener(this);
        btnYa2.setOnClickListener(this);
        btnYu2.setOnClickListener(this);
        btnYo2.setOnClickListener(this);
        btnRa2.setOnClickListener(this);
        btnRi2.setOnClickListener(this);
        btnRu2.setOnClickListener(this);
        btnRe2.setOnClickListener(this);
        btnRo2.setOnClickListener(this);
        btnWa2.setOnClickListener(this);
        btnWo2.setOnClickListener(this);
        btnN2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Hiragana:
                view1.setVisibility(View.VISIBLE);
                view2.setVisibility(View.INVISIBLE);
                title1.setVisibility(View.VISIBLE);
                title2.setVisibility(View.INVISIBLE);
                break;
            case R.id.Katakana:
                view2.setVisibility(View.VISIBLE);
                view1.setVisibility(View.INVISIBLE);
                title2.setVisibility(View.VISIBLE);
                title1.setVisibility(View.INVISIBLE);
                break;
            case R.id.imageButtonA1:
                MediaPlayer a = MediaPlayer.create(this, R.raw.a);
                a.start();
                break;
            case R.id.imageButtonI1:
                MediaPlayer i = MediaPlayer.create(this, R.raw.i);
                i.start();
                break;
            case R.id.imageButtonU1:
                MediaPlayer u = MediaPlayer.create(this, R.raw.u);
                u.start();
                break;
            case R.id.imageButtonE1:
                MediaPlayer e = MediaPlayer.create(this, R.raw.e);
                e.start();
                break;
            case R.id.imageButtonO1:
                MediaPlayer o = MediaPlayer.create(this, R.raw.o);
                o.start();
                break;
            case R.id.imageButtonKa1:
                MediaPlayer ka = MediaPlayer.create(this, R.raw.ka);
                ka.start();
                break;
            case R.id.imageButtonKi1:
                MediaPlayer ki = MediaPlayer.create(this, R.raw.ki);
                ki.start();
                break;
            case R.id.imageButtonKu1:
                MediaPlayer ku = MediaPlayer.create(this, R.raw.ku);
                ku.start();
                break;
            case R.id.imageButtonKe1:
                MediaPlayer ke = MediaPlayer.create(this, R.raw.ke);
                ke.start();
                break;
            case R.id.imageButtonKo1:
                MediaPlayer ko = MediaPlayer.create(this, R.raw.ko);
                ko.start();
                break;
            case R.id.imageButtonSa1:
                MediaPlayer sa = MediaPlayer.create(this, R.raw.sa);
                sa.start();
                break;
            case R.id.imageButtonShi1:
                MediaPlayer shi = MediaPlayer.create(this, R.raw.shi);
                shi.start();
                break;
            case R.id.imageButtonSu1:
                MediaPlayer su = MediaPlayer.create(this, R.raw.su);
                su.start();
                break;
            case R.id.imageButtonSe1:
                MediaPlayer se = MediaPlayer.create(this, R.raw.se);
                se.start();
                break;
            case R.id.imageButtonSo1:
                MediaPlayer so = MediaPlayer.create(this, R.raw.so);
                so.start();
                break;
            case R.id.imageButtonTa1:
                MediaPlayer ta = MediaPlayer.create(this, R.raw.ta);
                ta.start();
                break;
            case R.id.imageButtonChi1:
                MediaPlayer chi = MediaPlayer.create(this, R.raw.chi);
                chi.start();
                break;
            case R.id.imageButtonTsu1:
                MediaPlayer tsu = MediaPlayer.create(this, R.raw.tsu);
                tsu.start();
                break;
            case R.id.imageButtonTe1:
                MediaPlayer te = MediaPlayer.create(this, R.raw.te);
                te.start();
                break;
            case R.id.imageButtonTo1:
                MediaPlayer to = MediaPlayer.create(this, R.raw.to);
                to.start();
                break;
            case R.id.imageButtonNa1:
                MediaPlayer na = MediaPlayer.create(this, R.raw.na);
                na.start();
                break;
            case R.id.imageButtonNi1:
                MediaPlayer ni = MediaPlayer.create(this, R.raw.ni);
                ni.start();
                break;
            case R.id.imageButtonNu1:
                MediaPlayer nu  = MediaPlayer.create(this, R.raw.nu);
                nu.start();
                break;
            case R.id.imageButtonNe1:
                MediaPlayer ne = MediaPlayer.create(this, R.raw.ne);
                ne.start();
                break;
            case R.id.imageButtonNo1:
                MediaPlayer no = MediaPlayer.create(this, R.raw.no);
                no.start();
                break;
            case R.id.imageButtonHa1:
                MediaPlayer ha = MediaPlayer.create(this, R.raw.ha);
                ha.start();
                break;
            case R.id.imageButtonHi1:
                MediaPlayer hi = MediaPlayer.create(this, R.raw.hi);
                hi.start();
                break;
            case R.id.imageButtonFu1:
                MediaPlayer fu = MediaPlayer.create(this, R.raw.fu);
                fu.start();
                break;
            case R.id.imageButtonHe1:
                MediaPlayer he = MediaPlayer.create(this, R.raw.he);
                he.start();
                break;
            case R.id.imageButtonHo1:
                MediaPlayer ho = MediaPlayer.create(this, R.raw.ho);
                ho.start();
                break;
            case R.id.imageButtonMa1:
                MediaPlayer ma = MediaPlayer.create(this, R.raw.ma);
                ma.start();
                break;
            case R.id.imageButtonMi1:
                MediaPlayer mi = MediaPlayer.create(this, R.raw.mi);
                mi.start();
                break;
            case R.id.imageButtonMu1:
                MediaPlayer mu = MediaPlayer.create(this, R.raw.mu);
                mu.start();
                break;
            case R.id.imageButtonMe1:
                MediaPlayer me = MediaPlayer.create(this, R.raw.me);
                me.start();
                break;
            case R.id.imageButtonMo1:
                MediaPlayer mo = MediaPlayer.create(this, R.raw.mo);
                mo.start();
                break;
            case R.id.imageButtonYa1:
                MediaPlayer ya = MediaPlayer.create(this, R.raw.ya);
                ya.start();
                break;
            case R.id.imageButtonYu1:
                MediaPlayer yu = MediaPlayer.create(this, R.raw.yu);
                yu.start();
                break;
            case R.id.imageButtonYo1:
                MediaPlayer yo = MediaPlayer.create(this, R.raw.yo);
                yo.start();
                break;
            case R.id.imageButtonRa1:
                MediaPlayer ra = MediaPlayer.create(this, R.raw.ra);
                ra.start();
                break;
            case R.id.imageButtonRi1:
                MediaPlayer ri = MediaPlayer.create(this, R.raw.ri);
                ri.start();
                break;
            case R.id.imageButtonRu1:
                MediaPlayer ru = MediaPlayer.create(this, R.raw.ru);
                ru.start();
                break;
            case R.id.imageButtonRe1:
                MediaPlayer re = MediaPlayer.create(this, R.raw.re);
                re.start();
                break;
            case R.id.imageButtonRo1:
                MediaPlayer ro = MediaPlayer.create(this, R.raw.ro);
                ro.start();
                break;
            case R.id.imageButtonWa1:
                MediaPlayer wa  = MediaPlayer.create(this, R.raw.wa);
                wa.start();
                break;
            case R.id.imageButtonWo1:
                MediaPlayer wo = MediaPlayer.create(this, R.raw.wo);
                wo.start();
                break;
            case R.id.imageButtonN1:
                MediaPlayer n = MediaPlayer.create(this, R.raw.n);
                n.start();
                break;
            case R.id.imageButtonA2:
                MediaPlayer a2 = MediaPlayer.create(this, R.raw.a);
                a2.start();
                break;
            case R.id.imageButtonI2:
                MediaPlayer i2 = MediaPlayer.create(this, R.raw.i);
                i2.start();
                break;
            case R.id.imageButtonU2:
                MediaPlayer u2 = MediaPlayer.create(this, R.raw.u);
                u2.start();
                break;
            case R.id.imageButtonE2:
                MediaPlayer e2 = MediaPlayer.create(this, R.raw.e);
                e2.start();
                break;
            case R.id.imageButtonO2:
                MediaPlayer o2 = MediaPlayer.create(this, R.raw.o);
                o2.start();
                break;
            case R.id.imageButtonKa2:
                MediaPlayer ka2 = MediaPlayer.create(this, R.raw.ka);
                ka2.start();
                break;
            case R.id.imageButtonKi2:
                MediaPlayer ki2 = MediaPlayer.create(this, R.raw.ki);
                ki2.start();
                break;
            case R.id.imageButtonKu2:
                MediaPlayer ku2 = MediaPlayer.create(this, R.raw.ku);
                ku2.start();
                break;
            case R.id.imageButtonKe2:
                MediaPlayer ke2 = MediaPlayer.create(this, R.raw.ke);
                ke2.start();
                break;
            case R.id.imageButtonKo2:
                MediaPlayer ko2 = MediaPlayer.create(this, R.raw.ko);
                ko2.start();
                break;
            case R.id.imageButtonSa2:
                MediaPlayer sa2 = MediaPlayer.create(this, R.raw.sa);
                sa2.start();
                break;
            case R.id.imageButtonShi2:
                MediaPlayer shi2 = MediaPlayer.create(this, R.raw.shi);
                shi2.start();
                break;
            case R.id.imageButtonSu2:
                MediaPlayer su2 = MediaPlayer.create(this, R.raw.su);
                su2.start();
                break;
            case R.id.imageButtonSe2:
                MediaPlayer se2 = MediaPlayer.create(this, R.raw.se);
                se2.start();
                break;
            case R.id.imageButtonSo2:
                MediaPlayer so2 = MediaPlayer.create(this, R.raw.so);
                so2.start();
                break;
            case R.id.imageButtonTa2:
                MediaPlayer ta2 = MediaPlayer.create(this, R.raw.ta);
                ta2.start();
                break;
            case R.id.imageButtonChi2:
                MediaPlayer chi2 = MediaPlayer.create(this, R.raw.chi);
                chi2.start();
                break;
            case R.id.imageButtonTsu2:
                MediaPlayer tsu2 = MediaPlayer.create(this, R.raw.tsu);
                tsu2.start();
                break;
            case R.id.imageButtonTe2:
                MediaPlayer te2 = MediaPlayer.create(this, R.raw.te);
                te2.start();
                break;
            case R.id.imageButtonTo2:
                MediaPlayer to2 = MediaPlayer.create(this, R.raw.to);
                to2.start();
                break;
            case R.id.imageButtonNa2:
                MediaPlayer na2 = MediaPlayer.create(this, R.raw.na);
                na2.start();
                break;
            case R.id.imageButtonNi2:
                MediaPlayer ni2 = MediaPlayer.create(this, R.raw.ni);
                ni2.start();
                break;
            case R.id.imageButtonNu2:
                MediaPlayer nu2  = MediaPlayer.create(this, R.raw.nu);
                nu2.start();
                break;
            case R.id.imageButtonNe2:
                MediaPlayer ne2 = MediaPlayer.create(this, R.raw.ne);
                ne2.start();
                break;
            case R.id.imageButtonNo2:
                MediaPlayer no2 = MediaPlayer.create(this, R.raw.no);
                no2.start();
                break;
            case R.id.imageButtonHa2:
                MediaPlayer ha2 = MediaPlayer.create(this, R.raw.ha);
                ha2.start();
                break;
            case R.id.imageButtonHi2:
                MediaPlayer hi2 = MediaPlayer.create(this, R.raw.hi);
                hi2.start();
                break;
            case R.id.imageButtonFu2:
                MediaPlayer fu2 = MediaPlayer.create(this, R.raw.fu);
                fu2.start();
                break;
            case R.id.imageButtonHe2:
                MediaPlayer he2 = MediaPlayer.create(this, R.raw.he);
                he2.start();
                break;
            case R.id.imageButtonHo2:
                MediaPlayer ho2 = MediaPlayer.create(this, R.raw.ho);
                ho2.start();
                break;
            case R.id.imageButtonMa2:
                MediaPlayer ma2 = MediaPlayer.create(this, R.raw.ma);
                ma2.start();
                break;
            case R.id.imageButtonMi2:
                MediaPlayer mi2 = MediaPlayer.create(this, R.raw.mi);
                mi2.start();
                break;
            case R.id.imageButtonMu2:
                MediaPlayer mu2 = MediaPlayer.create(this, R.raw.mu);
                mu2.start();
                break;
            case R.id.imageButtonMe2:
                MediaPlayer me2 = MediaPlayer.create(this, R.raw.me);
                me2.start();
                break;
            case R.id.imageButtonMo2:
                MediaPlayer mo2 = MediaPlayer.create(this, R.raw.mo);
                mo2.start();
                break;
            case R.id.imageButtonYa2:
                MediaPlayer ya2 = MediaPlayer.create(this, R.raw.ya);
                ya2.start();
                break;
            case R.id.imageButtonYu2:
                MediaPlayer yu2 = MediaPlayer.create(this, R.raw.yu);
                yu2.start();
                break;
            case R.id.imageButtonYo2:
                MediaPlayer yo2 = MediaPlayer.create(this, R.raw.yo);
                yo2.start();
                break;
            case R.id.imageButtonRa2:
                MediaPlayer ra2 = MediaPlayer.create(this, R.raw.ra);
                ra2.start();
                break;
            case R.id.imageButtonRi2:
                MediaPlayer ri2 = MediaPlayer.create(this, R.raw.ri);
                ri2.start();
                break;
            case R.id.imageButtonRu2:
                MediaPlayer ru2 = MediaPlayer.create(this, R.raw.ru);
                ru2.start();
                break;
            case R.id.imageButtonRe2:
                MediaPlayer re2 = MediaPlayer.create(this, R.raw.re);
                re2.start();
                break;
            case R.id.imageButtonRo2:
                MediaPlayer ro2 = MediaPlayer.create(this, R.raw.ro);
                ro2.start();
                break;
            case R.id.imageButtonWa2:
                MediaPlayer wa2  = MediaPlayer.create(this, R.raw.wa);
                wa2.start();
                break;
            case R.id.imageButtonWo2:
                MediaPlayer wo2 = MediaPlayer.create(this, R.raw.wo);
                wo2.start();
                break;
            case R.id.imageButtonN2:
                MediaPlayer n2 = MediaPlayer.create(this, R.raw.n);
                n2.start();
                break;
            default:
                break;

        }

    }
}


