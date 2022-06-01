package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    //카운트다운을 수행할 변수 선언
    static int startCount = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, growTree.class);
        startActivity(intent);

//
////        Timer startTimer = new Timer();
////        TimerTask startTask = new TimerTask() {
////            @Override
////            public void run() {
////
////                if (startCount >= 1) {
////                    System.out.println("[카운트다운 : " + startCount + "]");
////                    startCount--;
////                } else {
////                    startTimer.cancel(); //타이머 종료
////                    System.out.println("[카운트다운 : 종료]");
////                }
////            } // run 종료
////        }; // startTask 종료
////        startTimer.schedule(startTask, 1000, 1000); //실행 Task, 1초뒤 실행, 1초마다 반복
//
//
//        //변수 선언
////        LinearLayout fullLayout = (LinearLayout) findViewById(R.id.fullLayout);
////        // LinearLayout layout = new LinearLayout(this);
////        ImageView dino = (ImageView) findViewById(R.id.dino);
////
////        ImageView[] itemArr = {};
////
////        LinearLayout itemLayout = (LinearLayout) findViewById(R.id.itemLayout);
////        ImageView coin = (ImageView) findViewById(R.id.coin);
////        ImageView can = (ImageView) findViewById(R.id.can);
////
////        ImageView[] roadArr = {};
////
////        LinearLayout roadLayout = (LinearLayout) findViewById(R.id.roadLayout);
////        ImageView road = (ImageView) findViewById(R.id.road);
////        ImageView hole = (ImageView) findViewById(R.id.hole);
//
//
//        // itemArr[]
//        // 담기 -> 랜덤 출력
//        itemArr[0] = coin;
//        itemArr[1] = can;
//            // + item 이미지 묶음
//        // timer 와 상관없이. itemArr 저장. 누적 추가.
//        // while loop을 쓰자. gameOver가 되면 break 하는 걸로.
//        while (!gameOver) {
//            int j = (int) Math.floor(Math.random() * itemArr.length);
//            itemLayout.addView(itemArr[j]);
//            if (gameOver){
//                break;
//            }
//        }
//
//
//        // holeArr[]
//        roadArr[0] = road;
//        roadArr[1] = hole;
//        while (!gameOver) {
//            int j = (int) Math.floor(Math.random() * roadArr.length);
//            roadLayout.addView(roadArr[j]);
//            if (gameOver){
//                break;
//            }
//        }
//
//
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                // layout 초기화
//                fullLayout.setVisibility(View.INVISIBLE);
//
//                // dino 출력
//                dino.setVisibility(View.VISIBLE);
//
//                // itemLayout 출력
//                itemLayout.setVisibility(View.VISIBLE);
//
//                // dino 떨어지기
//                // y좌표 - 하기
//                // 좌표 받기
//
//            }
//        }; // task 종료
//        timer.schedule(task, 0, 300); //
//
//
   } // onCreate 종료
} //클래스 종료