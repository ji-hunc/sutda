package com.example.sutda;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int sum = 0;
    int first = 1;
    String[] nums = new String[2];
    int clickCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageview1 = findViewById(R.id.select);
        final ImageView imageview2 = findViewById(R.id.select2);

        final TextView result_text = findViewById(R.id.result);
        final Button check_button = findViewById(R.id.check_button);

        final ImageButton january1 = findViewById(R.id.imageButton1);
        final ImageButton february1 = findViewById(R.id.imageButton2);
        final ImageButton march1 = findViewById(R.id.imageButton3);
        final ImageButton april1 = findViewById(R.id.imageButton4);
        final ImageButton may1 = findViewById(R.id.imageButton5);
        final ImageButton june1 = findViewById(R.id.imageButton6);
        final ImageButton july1 = findViewById(R.id.imageButton7);
        final ImageButton august1 = findViewById(R.id.imageButton8);
        final ImageButton september1 = findViewById(R.id.imageButton9);
        final ImageButton october1 = findViewById(R.id.imageButton10);
        final ImageButton january2 = findViewById(R.id.imageButton11);
        final ImageButton february2 = findViewById(R.id.imageButton12);
        final ImageButton march2 = findViewById(R.id.imageButton13);
        final ImageButton april2 = findViewById(R.id.imageButton14);
        final ImageButton may2 = findViewById(R.id.imageButton15);
        final ImageButton june2 = findViewById(R.id.imageButton16);
        final ImageButton july2 = findViewById(R.id.imageButton17);
        final ImageButton august2 = findViewById(R.id.imageButton18);
        final ImageButton september2 = findViewById(R.id.imageButton19);
        final ImageButton october2 = findViewById(R.id.imageButton20);

        final LinearLayout matrixLinear = findViewById(R.id.matrixLinear);

        final TextView gd38 = findViewById(R.id.gd38);
        final TextView gd18 = findViewById(R.id.gd18);
        final TextView gd13 = findViewById(R.id.gd13);
        final TextView dd = findViewById(R.id.dd);
        final TextView al = findViewById(R.id.al);
        final TextView ds = findViewById(R.id.ds);
        final TextView gb = findViewById(R.id.gb);
        final TextView jb = findViewById(R.id.jb);
        final TextView js = findViewById(R.id.js);
        final TextView sl = findViewById(R.id.sl);
        final TextView go = findViewById(R.id.go);
        final TextView gg = findViewById(R.id.gg);
        final TextView mt = findViewById(R.id.mt);
        final TextView ah = findViewById(R.id.ah);
        final TextView tg = findViewById(R.id.tg);
        final TextView mg = findViewById(R.id.mg);
        final TextView gs = findViewById(R.id.gs);

        final LinearLayout list = findViewById(R.id.list);

        final TextView result = findViewById(R.id.result);

        list.setVisibility(View.INVISIBLE);


        result.setSelected(true);




        // check button click
        check_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sum != 0 && clickCount == 2) {

                    result_text.setVisibility(View.VISIBLE);

                    if (sum == 2) {
                        result_text.setText("삥땡");
                    } else if (sum == 3) {
                        result_text.setText("알리");
                    } else if (sum == 4) {
                        if (nums[0].equals("february1") || nums[0].equals("february2")) {
                            result_text.setText("이땡");
                        } else if ((nums[0].equals("january1")) && nums[1].equals("march1") || (nums[1].equals("january1")) && nums[0].equals("march1")) {
                            result_text.setText("일삼광땡");
                        } else {
                            result_text.setText("사끗");
                        }
                    } else if (sum == 5) {
                        if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("april1") || nums[0].equals("april2"))) {
                            result_text.setText("독사");
                        } else {
                            result_text.setText("오끗");
                        }
                    } else if (sum == 6) {
                        if (nums[0].equals("march1") || nums[0].equals("march2")) {
                            result_text.setText("삼땡");
                        } else {
                            result_text.setText("육끗");
                        }
                    } else if (sum == 7) {
                        result_text.setText("칠끗");
                    } else if (sum == 8) {
                        if (nums[0].equals("april1") || nums[0].equals("april2")) {
                            result_text.setText("사땡");
                        } else {
                            result_text.setText("팔끗");
                        }
                    } else if (sum == 9) {
                        if ((nums[0].equals("january1") && nums[1].equals("august1")) || nums[0].equals("august1") && nums[1].equals("january1")) {
                            result_text.setText("일팔광땡");
                        } else {
                            result_text.setText("갑오");
                        }
                    } else if (sum == 10) {
                        if (nums[0].equals("may1") || nums[0].equals("may2")) {
                            result_text.setText("오땡");
                        } else if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("june1") || nums[0].equals("june2"))) {
                            result_text.setText("세륙");
                        } else if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("september1") || nums[0].equals("september2"))) {
                            result_text.setText("구삥");
                        } else if ((nums[0].equals("march1") || nums[0].equals("march2")) || (nums[0].equals("july1") || nums[0].equals("july2"))) {
                            result_text.setText("땡잡이");
                        } else {
                            result_text.setText("망통");
                        }
                    } else if (sum == 11) {
                        if ((nums[0].equals("march1") && nums[1].equals("august1")) || nums[0].equals("august1") && nums[1].equals("march1")) {
                            result_text.setText("삼팔광땡");
                        } else if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("october1") || nums[0].equals("october2"))) {
                            result_text.setText("장삥");
                        } else if ((nums[0].equals("april1") && nums[1].equals("july1")) || nums[0].equals("july1") && nums[1].equals("april1")) {
                            result_text.setText("암행어사");
                        } else {
                            result_text.setText("일끗");
                        }
                    } else if (sum == 12) {
                        if (nums[0].equals("june1") || nums[0].equals("june2")) {
                            result_text.setText("육땡");
                        } else {
                            result_text.setText("이끗");
                        }
                    } else if (sum == 13) {
                        if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("september1") || nums[0].equals("september2"))) {
                            if ((nums[0].equals("april1") && nums[1].equals("september1")) || (nums[0].equals("september1") && nums[1].equals("april1"))) {
                                result_text.setText("멍텅구리 구사");
                            } else {
                                result_text.setText("구사");
                            }
                        } else {
                            result_text.setText("삼끗");
                        }
                    } else if (sum == 14) {
                        if (nums[0].equals("july1") || nums[0].equals("july2")) {
                            result_text.setText("칠땡");
                        } else if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("october1") || nums[0].equals("october2"))) {
                            result_text.setText("장사");
                        } else {
                            result_text.setText("사끗");
                        }
                    } else if (sum == 15) {
                        result_text.setText("오끗");
                    } else if (sum == 16) {
                        if (nums[0].equals("august1") || nums[0].equals("august2")) {
                            result_text.setText("팔땡");
                        } else {
                            result_text.setText("육끗");
                        }
                    } else if (sum == 17) {
                        result_text.setText("칠끗");
                    } else if (sum == 18) {
                        if (nums[0].equals("september1") || nums[0].equals("september2")) {
                            result_text.setText("구땡");
                        } else {
                            result_text.setText("팔끗");
                        }
                    } else if (sum == 19) {
                        result_text.setText("갑오");
                    } else {
                        result_text.setText("장땡");
                    }


                    matrixLinear.setVisibility(View.INVISIBLE);
                    list.setVisibility(View.VISIBLE);

                    String name = result_text.getText().toString();

                    if (name.equals("삼팔광땡")) {
                        gd38.setTextColor(Color.RED);
                    } else if (name.equals("일팔광땡")) {
                        gd18.setTextColor(Color.RED);
                    } else if (name.equals("일삼광땡")) {
                        gd13.setTextColor(Color.RED);
                    } else if (name.equals("장땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("구땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("팔땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("칠땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("육땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("오땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("사땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("삼땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("이땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("삥땡")) {
                        dd.setTextColor(Color.RED);
                    } else if (name.equals("알리")) {
                        al.setTextColor(Color.RED);
                    } else if (name.equals("독사")) {
                        ds.setTextColor(Color.RED);
                    } else if (name.equals("구삥")) {
                        gb.setTextColor(Color.RED);
                    } else if (name.equals("장삥")) {
                        jb.setTextColor(Color.RED);
                    } else if (name.equals("장사")) {
                        js.setTextColor(Color.RED);
                    } else if (name.equals("세륙")) {
                        sl.setTextColor(Color.RED);
                    } else if (name.equals("갑오")) {
                        go.setTextColor(Color.RED);
                    } else if (name.equals("팔끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("칠끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("육끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("오끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("사끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("삼끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("이끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("일끗")) {
                        gg.setTextColor(Color.RED);
                    } else if (name.equals("망통")) {
                        mt.setTextColor(Color.RED);
                    } else if (name.equals("암행어사")) {
                        ah.setTextColor(Color.RED);
                    } else if (name.equals("땡잡이")) {
                        tg.setTextColor(Color.RED);
                    } else if (name.equals("멍텅구리 구사")) {
                        mg.setTextColor(Color.RED);
                    } else if (name.equals("구사")) {
                        gs.setTextColor(Color.RED);
                    }



                    check_button.setText("돌아가기");


                    //initial
                    sum = 0;
                    first = 1;
                    nums[0] = " ";
                    nums[1] = " ";
                    clickCount = 0;
                }

                else if (sum != 0 && clickCount == 1) {
                    clickCount = 0;
                    imageview1.setImageResource(R.drawable.trans2);
                    imageview2.setImageResource(R.drawable.trans2);
                    sum = 0;
                    first = 1;
                    nums[0] = " ";
                    nums[1] = " ";
                    Toast.makeText(getApplicationContext(), "두개의 패를 선택하세요", Toast.LENGTH_SHORT).show();

                    january1.setEnabled(true);
                    february1.setEnabled(true);
                    march1.setEnabled(true);
                    april1.setEnabled(true);
                    may1.setEnabled(true);
                    june1.setEnabled(true);
                    july1.setEnabled(true);
                    august1.setEnabled(true);
                    september1.setEnabled(true);
                    october1.setEnabled(true);
                    january2.setEnabled(true);
                    february2.setEnabled(true);
                    march2.setEnabled(true);
                    april2.setEnabled(true);
                    may2.setEnabled(true);
                    june2.setEnabled(true);
                    july2.setEnabled(true);
                    august2.setEnabled(true);
                    september2.setEnabled(true);
                    october2.setEnabled(true);

                    january1.setAlpha(255);
                    february1.setAlpha(255);
                    march1.setAlpha(255);
                    april1.setAlpha(255);
                    may1.setAlpha(255);
                    june1.setAlpha(255);
                    july1.setAlpha(255);
                    august1.setAlpha(255);
                    september1.setAlpha(255);
                    october1.setAlpha(255);
                    january2.setAlpha(255);
                    february2.setAlpha(255);
                    march2.setAlpha(255);
                    april2.setAlpha(255);
                    may2.setAlpha(255);
                    june2.setAlpha(255);
                    july2.setAlpha(255);
                    august2.setAlpha(255);
                    september2.setAlpha(255);
                    october2.setAlpha(255);
                }

                else {
                    january1.setAlpha(255);
                    february1.setAlpha(255);
                    march1.setAlpha(255);
                    april1.setAlpha(255);
                    may1.setAlpha(255);
                    june1.setAlpha(255);
                    july1.setAlpha(255);
                    august1.setAlpha(255);
                    september1.setAlpha(255);
                    october1.setAlpha(255);
                    january2.setAlpha(255);
                    february2.setAlpha(255);
                    march2.setAlpha(255);
                    april2.setAlpha(255);
                    may2.setAlpha(255);
                    june2.setAlpha(255);
                    july2.setAlpha(255);
                    august2.setAlpha(255);
                    september2.setAlpha(255);
                    october2.setAlpha(255);


                    matrixLinear.setVisibility(View.VISIBLE);
                    list.setVisibility(View.INVISIBLE);

                    check_button.setText("족보 확인");
                    result_text.setText("패를 선택해 주세요");

                    imageview1.setImageResource(R.drawable.trans2);
                    imageview2.setImageResource(R.drawable.trans2);

                    gd38.setTextColor(Color.WHITE);
                    gd18.setTextColor(Color.WHITE);
                    gd13.setTextColor(Color.WHITE);
                    dd.setTextColor(Color.WHITE);
                    al.setTextColor(Color.WHITE);
                    ds.setTextColor(Color.WHITE);
                    gb.setTextColor(Color.WHITE);
                    jb.setTextColor(Color.WHITE);
                    js.setTextColor(Color.WHITE);
                    sl.setTextColor(Color.WHITE);
                    go.setTextColor(Color.WHITE);
                    gg.setTextColor(Color.WHITE);
                    mt.setTextColor(Color.WHITE);
                    ah.setTextColor(Color.WHITE);
                    tg.setTextColor(Color.WHITE);
                    mg.setTextColor(Color.WHITE);
                    gs.setTextColor(Color.WHITE);


                    january1.setEnabled(true);
                    february1.setEnabled(true);
                    march1.setEnabled(true);
                    april1.setEnabled(true);
                    may1.setEnabled(true);
                    june1.setEnabled(true);
                    july1.setEnabled(true);
                    august1.setEnabled(true);
                    september1.setEnabled(true);
                    october1.setEnabled(true);
                    january2.setEnabled(true);
                    february2.setEnabled(true);
                    march2.setEnabled(true);
                    april2.setEnabled(true);
                    may2.setEnabled(true);
                    june2.setEnabled(true);
                    july2.setEnabled(true);
                    august2.setEnabled(true);
                    september2.setEnabled(true);
                    october2.setEnabled(true);
                }

            }
        });


        // each month click
        january1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    january1.setEnabled(false);
                    clickCount += 1;
                    january1.setAlpha(80);
                    sum += 1;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.january1);
                        nums[0] = "january1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.january1);
                        nums[1] = "january1";
                    }
                }
            }
        });
        february1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    february1.setEnabled(false);
                    clickCount += 1;
                    february1.setAlpha(80);
                    sum += 2;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.february1);
                        nums[0] = "february1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.february1);
                        nums[1] = "february1";
                    }
                }
            }
        });
        march1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    march1.setEnabled(false);
                    clickCount += 1;
                    march1.setAlpha(80);
                    sum += 3;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.march1);
                        nums[0] = "march1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.march1);
                        nums[1] = "march1";

                    }}
            }
        });
        april1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    april1.setEnabled(false);
                    clickCount += 1;
                    april1.setAlpha(80);
                    sum += 4;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.april1);
                        nums[0] = "april1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.april1);
                        nums[1] = "april1";

                    }}
            }
        });
        may1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    may1.setEnabled(false);
                    clickCount += 1;
                    may1.setAlpha(80);
                    sum += 5;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.may1);
                        nums[0] = "may1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.may1);
                        nums[1] = "may1";

                    }      }
            }
        });
        june1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    june1.setEnabled(false);
                    clickCount += 1;
                    june1.setAlpha(80);
                    sum += 6;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.june1);
                        nums[0] = "june1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.june1);
                        nums[1] = "june1";

                    }     }
            }
        });
        july1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    july1.setEnabled(false);
                    clickCount += 1;
                    july1.setAlpha(80);
                    sum += 7;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.july1);
                        nums[0] = "july1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.july1);
                        nums[1] = "july1";

                    }     }
            }
        });
        august1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    august1.setEnabled(false);
                    clickCount += 1;
                    august1.setAlpha(80);
                    sum += 8;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.august1);
                        nums[0] = "august1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.august1);
                        nums[1] = "august1";
                    }
                }
            }
        });
        september1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    september1.setEnabled(false);
                    clickCount += 1;
                    september1.setAlpha(80);
                    sum += 9;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.september1);
                        nums[0] = "september1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.september1);
                        nums[1] = "september1";
                    }
                }
            }
        });
        october1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    october1.setEnabled(false);
                    clickCount += 1;
                    october1.setAlpha(80);
                    sum += 10;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.october1);
                        nums[0] = "october1";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.october1);
                        nums[1] = "october1";
                    }
                }
            }
        });
        january2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    january2.setEnabled(false);
                    clickCount += 1;
                    january2.setAlpha(80);
                    sum += 1;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.january2);
                        nums[0] = "january2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.january2);
                        nums[1] = "january2";
                    }
                }
            }
        });
        february2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    february2.setEnabled(false);
                    clickCount += 1;
                    february2.setAlpha(80);
                    sum += 2;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.february2);
                        nums[0] = "february2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.february2);
                        nums[1] = "february2";
                    }
                }
            }
        });
        march2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    march2.setEnabled(false);
                    clickCount += 1;
                    march2.setAlpha(80);
                    sum += 3;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.march2);
                        nums[0] = "march2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.march2);
                        nums[1] = "march2";

                    }}
            }
        });
        april2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    april2.setEnabled(false);
                    clickCount += 1;
                    april2.setAlpha(80);
                    sum += 4;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.april2);
                        nums[0] = "april2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.april2);
                        nums[1] = "april2";

                    }}
            }
        });
        may2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    may2.setEnabled(false);
                    clickCount += 1;
                    may2.setAlpha(80);
                    sum += 5;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.may2);
                        nums[0] = "may2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.may2);
                        nums[1] = "may2";

                    }      }
            }
        });
        june2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    june2.setEnabled(false);
                    clickCount += 1;
                    june2.setAlpha(80);
                    sum += 6;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.june2);
                        nums[0] = "june2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.june2);
                        nums[1] = "june2";

                    }     }
            }
        });
        july2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    july2.setEnabled(false);
                    clickCount += 1;
                    july2.setAlpha(80);
                    sum += 7;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.july2);
                        nums[0] = "july2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.july2);
                        nums[1] = "july2";

                    }     }
            }
        });
        august2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    august2.setEnabled(false);
                    clickCount += 1;
                    august2.setAlpha(80);
                    sum += 8;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.august2);
                        nums[0] = "august2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.august2);
                        nums[1] = "august2";
                    }
                }
            }
        });
        september2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    september2.setEnabled(false);
                    clickCount += 1;
                    september2.setAlpha(80);
                    sum += 9;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.september2);
                        nums[0] = "september2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.september2);
                        nums[1] = "september2";
                    }
                }
            }
        });
        october2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount < 2) {
                    october2.setEnabled(false);
                    clickCount += 1;
                    october2.setAlpha(80);
                    sum += 10;
                    if (first == 1) {
                        imageview1.setImageResource(R.drawable.october2);
                        nums[0] = "october2";
                        first = 0;
                    } else {
                        imageview2.setImageResource(R.drawable.october2);
                        nums[1] = "october2";
                    }
                }
            }
        });
    }
}