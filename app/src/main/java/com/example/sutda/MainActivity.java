package com.example.sutda;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
    ImageView firstImageButton;
    ImageView secondImageButton;
    int firstScore = 0;
    int secondScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set orientation to only portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);


        final Button checkButton = findViewById(R.id.check_button);
        final TextView resultText = findViewById(R.id.result);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);

        final LinearLayout matrixLinear = findViewById(R.id.matrixLinear);
        final LinearLayout list = findViewById(R.id.list);

        final ImageButton january1 = findViewById(R.id.january1);
        final ImageButton february1 = findViewById(R.id.february1);
        final ImageButton march1 = findViewById(R.id.march1);
        final ImageButton april1 = findViewById(R.id.april1);
        final ImageButton may1 = findViewById(R.id.may1);
        final ImageButton june1 = findViewById(R.id.june1);
        final ImageButton july1 = findViewById(R.id.july1);
        final ImageButton august1 = findViewById(R.id.august1);
        final ImageButton september1 = findViewById(R.id.september1);
        final ImageButton october1 = findViewById(R.id.october1);
        final ImageButton january2 = findViewById(R.id.january2);
        final ImageButton february2 = findViewById(R.id.february2);
        final ImageButton march2 = findViewById(R.id.march2);
        final ImageButton april2 = findViewById(R.id.april2);
        final ImageButton may2 = findViewById(R.id.may2);
        final ImageButton june2 = findViewById(R.id.june2);
        final ImageButton july2 = findViewById(R.id.july2);
        final ImageButton august2 = findViewById(R.id.august2);
        final ImageButton september2 = findViewById(R.id.september2);
        final ImageButton october2 = findViewById(R.id.october2);

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


        list.setVisibility(View.INVISIBLE);
        resultText.setSelected(true);

        // clicked the checkButton
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sum != 0 && clickCount == 2) {
                    resultText.setVisibility(View.VISIBLE);

                    if (sum == 2) {
                        resultText.setText("삥땡");
                        dd.setTextColor(Color.RED);
                    } else if (sum == 3) {
                        resultText.setText("알리");
                        al.setTextColor(Color.RED);
                    } else if (sum == 4) {
                        if (nums[0].equals("february1") || nums[0].equals("february2")) {
                            resultText.setText("이땡");
                            dd.setTextColor(Color.RED);
                        } else if ((nums[0].equals("january1")) && nums[1].equals("march1") || (nums[1].equals("january1")) && nums[0].equals("march1")) {
                            resultText.setText("일삼광땡");
                            gd13.setTextColor(Color.RED);
                        } else {
                            resultText.setText("사끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 5) {
                        if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("april1") || nums[0].equals("april2"))) {
                            resultText.setText("독사");
                            ds.setTextColor(Color.RED);
                        } else {
                            resultText.setText("오끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 6) {
                        if (nums[0].equals("march1") || nums[0].equals("march2")) {
                            resultText.setText("삼땡");
                            dd.setTextColor(Color.RED);
                        } else {
                            resultText.setText("육끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 7) {
                        resultText.setText("칠끗");
                        gg.setTextColor(Color.RED);
                    } else if (sum == 8) {
                        if (nums[0].equals("april1") || nums[0].equals("april2")) {
                            resultText.setText("사땡");
                            dd.setTextColor(Color.RED);
                        } else {
                            resultText.setText("팔끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 9) {
                        if ((nums[0].equals("january1") && nums[1].equals("august1")) || nums[0].equals("august1") && nums[1].equals("january1")) {
                            resultText.setText("일팔광땡");
                            gd18.setTextColor(Color.RED);
                        } else {
                            resultText.setText("갑오");
                            go.setTextColor(Color.RED);
                        }
                    } else if (sum == 10) {
                        if (nums[0].equals("may1") || nums[0].equals("may2")) {
                            resultText.setText("오땡");
                            dd.setTextColor(Color.RED);
                        } else if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("june1") || nums[0].equals("june2"))) {
                            resultText.setText("세륙");
                            sl.setTextColor(Color.RED);
                        } else if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("september1") || nums[0].equals("september2"))) {
                            resultText.setText("구삥");
                            gb.setTextColor(Color.RED);
                        } else if ((nums[0].equals("march1") || nums[0].equals("march2")) || (nums[0].equals("july1") || nums[0].equals("july2"))) {
                            resultText.setText("땡잡이");
                            tg.setTextColor(Color.RED);
                        } else {
                            resultText.setText("망통");
                            mt.setTextColor(Color.RED);
                        }
                    } else if (sum == 11) {
                        if ((nums[0].equals("march1") && nums[1].equals("august1")) || nums[0].equals("august1") && nums[1].equals("march1")) {
                            resultText.setText("삼팔광땡");
                            gd38.setTextColor(Color.RED);
                        } else if ((nums[0].equals("january1") || nums[0].equals("january2")) || (nums[0].equals("october1") || nums[0].equals("october2"))) {
                            resultText.setText("장삥");
                            jb.setTextColor(Color.RED);
                        } else if ((nums[0].equals("april1") && nums[1].equals("july1")) || nums[0].equals("july1") && nums[1].equals("april1")) {
                            resultText.setText("암행어사");
                            ah.setTextColor(Color.RED);
                        } else {
                            resultText.setText("일끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 12) {
                        if (nums[0].equals("june1") || nums[0].equals("june2")) {
                            resultText.setText("육땡");
                            dd.setTextColor(Color.RED);
                        } else {
                            resultText.setText("이끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 13) {
                        if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("september1") || nums[0].equals("september2"))) {
                            if ((nums[0].equals("april1") && nums[1].equals("september1")) || (nums[0].equals("september1") && nums[1].equals("april1"))) {
                                resultText.setText("멍텅구리 구사");
                                mg.setTextColor(Color.RED);
                            } else {
                                resultText.setText("구사");
                                gs.setTextColor(Color.RED);
                            }
                        } else {
                            resultText.setText("삼끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 14) {
                        if (nums[0].equals("july1") || nums[0].equals("july2")) {
                            resultText.setText("칠땡");
                            dd.setTextColor(Color.RED);
                        } else if ((nums[0].equals("april1") || nums[0].equals("april2")) || (nums[0].equals("october1") || nums[0].equals("october2"))) {
                            resultText.setText("장사");
                            js.setTextColor(Color.RED);
                        } else {
                            resultText.setText("사끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 15) {
                        resultText.setText("오끗");
                        gg.setTextColor(Color.RED);
                    } else if (sum == 16) {
                        if (nums[0].equals("august1") || nums[0].equals("august2")) {
                            resultText.setText("팔땡");
                            dd.setTextColor(Color.RED);
                        } else {
                            resultText.setText("육끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 17) {
                        resultText.setText("칠끗");
                        gg.setTextColor(Color.RED);
                    } else if (sum == 18) {
                        if (nums[0].equals("september1") || nums[0].equals("september2")) {
                            resultText.setText("구땡");
                            dd.setTextColor(Color.RED);
                        } else {
                            resultText.setText("팔끗");
                            gg.setTextColor(Color.RED);
                        }
                    } else if (sum == 19) {
                        resultText.setText("갑오");
                        go.setTextColor(Color.RED);
                    } else {
                        resultText.setText("장땡");
                        dd.setTextColor(Color.RED);
                    }

                    matrixLinear.setVisibility(View.INVISIBLE);
                    list.setVisibility(View.VISIBLE);

                    // initialization
                    checkButton.setText("돌아가기");
                    sum = 0;
                    first = 1;
                    nums[0] = " ";
                    nums[1] = " ";
                    clickCount = 0;
                }

                else if (sum != 0 && clickCount == 1) {
                    clickCount = 0;
                    firstSelected.setImageResource(R.drawable.trans2);
                    secondSelected.setImageResource(R.drawable.trans2);
                    sum = 0;
                    first = 1;
                    nums[0] = " ";
                    nums[1] = " ";
                    Toast.makeText(getApplicationContext(), "두개의 패를 선택하세요", Toast.LENGTH_SHORT).show();

                    setAllButtonEnabled(january1, february1, march1, april1, may1, june1, july1, august1, september1, october1, january2, february2, march2, april2, may2, june2, july2, august2, september2, october2);
                    setAllButtonAlphaTo255(january1, february1, march1, april1, may1, june1, july1, august1, september1, october1, january2, february2, march2, april2, may2, june2, july2, august2, september2, october2);
                }

                else {
                    setAllButtonAlphaTo255(january1, february1, march1, april1, may1, june1, july1, august1, september1, october1, january2, february2, march2, april2, may2, june2, july2, august2, september2, october2);

                    matrixLinear.setVisibility(View.VISIBLE);
                    list.setVisibility(View.INVISIBLE);

                    checkButton.setText("족보 확인");
                    resultText.setText("패를 선택해 주세요");

                    firstSelected.setImageResource(R.drawable.trans2);
                    secondSelected.setImageResource(R.drawable.trans2);

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

                    setAllButtonEnabled(january1, february1, march1, april1, may1, june1, july1, august1, september1, october1, january2, february2, march2, april2, may2, june2, july2, august2, september2, october2);
                }

            }
        });


        firstSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount == 1) {
                    firstSelected.setImageResource(R.drawable.trans2);
                    firstImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= firstScore;
                    nums[0] = " ";
                    firstImageButton.setEnabled(true);
                    firstSelected.setEnabled(false);
                    first = 1;  // like first time
                }
                else if (clickCount == 2) {
                    firstSelected.setImageResource(R.drawable.trans2);
                    firstImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= firstScore;
                    nums[0] = " ";
                    firstImageButton.setEnabled(true);
                    firstSelected.setEnabled(false);
                    first = 1; // like second time
                }
            }
        });
        secondSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount == 1) {
                    secondSelected.setImageResource(R.drawable.trans2);
                    secondImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= secondScore;
                    nums[1] = " ";
                    secondImageButton.setEnabled(true);
                    secondSelected.setEnabled(false);
                    first = 1; // like first time
                }
                else if (clickCount == 2) {
                    secondSelected.setImageResource(R.drawable.trans2);
                    secondImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= secondScore;
                    nums[1] = " ";
                    secondImageButton.setEnabled(true);
                    secondSelected.setEnabled(false);
                    first = 0; // like second time
                }
            }
        });
    }


    void EachMonthClicked (ImageButton months, String month, int score, ImageView firstSelect, ImageView secondSelect) {
        if (clickCount < 2) {
            months.setEnabled(false);
            clickCount += 1;
            months.setAlpha(80);
            sum += score;

            int resId = getResources().getIdentifier(month, "drawable", getPackageName());
            Drawable image = getResources().getDrawable(resId);

            if (first == 1) {
                firstSelect.setImageDrawable(image);
                firstImageButton = months;
                firstScore = score;
                nums[0] = month;
                first = 0;
                firstSelect.setEnabled(true);
            }
            else {
                secondSelect.setImageDrawable(image);
                secondImageButton = months;
                secondScore = score;
                nums[1] = month;
                secondSelect.setEnabled(true);
            }
        }
    }

    void setAllButtonEnabled(ImageButton january1, ImageButton february1, ImageButton march1, ImageButton april1, ImageButton may1, ImageButton june1, ImageButton july1, ImageButton august1, ImageButton september1, ImageButton october1,
                          ImageButton january2, ImageButton february2, ImageButton march2, ImageButton april2, ImageButton may2, ImageButton june2, ImageButton july2, ImageButton august2, ImageButton september2, ImageButton october2) {
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

    void setAllButtonAlphaTo255(ImageButton january1, ImageButton february1, ImageButton march1, ImageButton april1, ImageButton may1, ImageButton june1, ImageButton july1, ImageButton august1, ImageButton september1, ImageButton october1,
                                ImageButton january2, ImageButton february2, ImageButton march2, ImageButton april2, ImageButton may2, ImageButton june2, ImageButton july2, ImageButton august2, ImageButton september2, ImageButton october2) {
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

    public void clickJanuary1 (View v) {
        final ImageButton january1 = findViewById(R.id.january1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(january1, "january1", 1, firstSelected, secondSelected);
    }
    public void clickFebruary1 (View v) {
        final ImageButton february1 = findViewById(R.id.february1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(february1, "february1", 2, firstSelected, secondSelected);
    }
    public void clickMarch1 (View v) {
        final ImageButton march1 = findViewById(R.id.march1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(march1, "march1", 3, firstSelected, secondSelected);
    }
    public void clickApril1 (View v) {
        final ImageButton april1 = findViewById(R.id.april1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(april1, "april1", 4, firstSelected, secondSelected);
    }
    public void clickMay1 (View v) {
        final ImageButton may1 = findViewById(R.id.may1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(may1, "may1", 5, firstSelected, secondSelected);
    }
    public void clickJune1 (View v) {
        final ImageButton june1 = findViewById(R.id.june1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(june1, "june1", 6, firstSelected, secondSelected);
    }
    public void clickJuly1 (View v) {
        final ImageButton july1 = findViewById(R.id.july1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(july1, "july1", 7, firstSelected, secondSelected);
    }
    public void clickAugust1 (View v) {
        final ImageButton august1 = findViewById(R.id.august1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(august1, "august1", 8, firstSelected, secondSelected);
    }
    public void clickSeptember1 (View v) {
        final ImageButton september1 = findViewById(R.id.september1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(september1, "september1", 9, firstSelected, secondSelected);
    }
    public void clickOctober1 (View v) {
        final ImageButton october1 = findViewById(R.id.october1);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(october1, "october1", 10, firstSelected, secondSelected);
    }
    public void clickJanuary2 (View v) {
        final ImageButton january2 = findViewById(R.id.january2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(january2, "january2", 1, firstSelected, secondSelected);
    }
    public void clickFebruary2 (View v) {
        final ImageButton february2 = findViewById(R.id.february2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(february2, "february2", 2, firstSelected, secondSelected);
    }
    public void clickMarch2 (View v) {
        final ImageButton march2 = findViewById(R.id.march2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(march2, "march2", 3, firstSelected, secondSelected);
    }
    public void clickApril2 (View v) {
        final ImageButton april2 = findViewById(R.id.april2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(april2, "april2", 4, firstSelected, secondSelected);
    }
    public void clickMay2 (View v) {
        final ImageButton may2 = findViewById(R.id.may2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(may2, "may2", 5, firstSelected, secondSelected);
    }
    public void clickJune2 (View v) {
        final ImageButton june2 = findViewById(R.id.june2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(june2, "june2", 6, firstSelected, secondSelected);
    }
    public void clickJuly2 (View v) {
        final ImageButton july2 = findViewById(R.id.july2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(july2, "july2", 7, firstSelected, secondSelected);
    }
    public void clickAugust2 (View v) {
        final ImageButton august2 = findViewById(R.id.august2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(august2, "august2", 8, firstSelected, secondSelected);
    }
    public void clickSeptember2 (View v) {
        final ImageButton september2 = findViewById(R.id.september2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(september2, "september2", 9, firstSelected, secondSelected);
    }
    public void clickOctober2 (View v) {
        final ImageButton october2 = findViewById(R.id.october2);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        EachMonthClicked(october2, "october2", 10, firstSelected, secondSelected);
    }
}