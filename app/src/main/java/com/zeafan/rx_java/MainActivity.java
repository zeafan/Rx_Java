package com.zeafan.rx_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.zeafan.rx_java.databinding.ActivityMainBinding;

import java.util.concurrent.TimeUnit;

import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Observer observer;
    Observable create;
    Observable just;
    Observable array_observable;
    Observable range;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
      //  setContentView();
        // Cold Observable
//        Observable<Long> cold = Observable.intervalRange(0,30,0,200, TimeUnit.MILLISECONDS);
//        Sleep(1000);
//        cold.subscribe(i-> Log.d(TAG,"Student1:->"+i));
//        Sleep(500);
//        cold.subscribe(i-> Log.d(TAG,"Student2:->"+i));
//        Sleep(500);
//        cold.subscribe(i-> Log.d(TAG,"Student3:->"+i));

        ////////////////////////////////////////////
        // Convert Cold Observable To Hot Observable
//        ConnectableObservable<Long> hot = Observable.intervalRange(0,20,0,1, TimeUnit.SECONDS).publish();
//        hot.connect();
//        Sleep(2000);
//        hot.subscribe(i-> Log.d(TAG,"Student1:->"+i));
//        Sleep(3000);
//        hot.subscribe(i-> Log.d(TAG,"Student2:->"+i));
//        Sleep(2000);
//        hot.subscribe(i-> Log.d(TAG,"Student3:->"+i));
        ///////////////////////////////////////////////////////
        //Inilization Types Of  Hot Observable
        //1-Publish Subject
//        PublishSubject<String> publishSubject = PublishSubject.create();
//        publishSubject.subscribe(i-> Log.d(TAG,"Student1:->"+i));
//        publishSubject.onNext("A");
//        Sleep(1000);
//        publishSubject.onNext("B");
//        Sleep(1000);
//        publishSubject.onNext("C");
//        Sleep(1000);
//        publishSubject.onNext("D");
//        Sleep(1000);
//        publishSubject.subscribe(i-> Log.d(TAG,"Student2:->"+i));
//        publishSubject.onNext("E");
//        Sleep(1000);
//        publishSubject.onNext("F");
//        Sleep(1000);
//        publishSubject.onNext("G");
//        Sleep(1000);
      //  2-Behaviour Subject
//        BehaviorSubject<String> behaviorSubject = BehaviorSubject.create();
//        behaviorSubject.subscribe(i-> Log.d(TAG,"BehaviorSubject_Student1:->"+i));
//        behaviorSubject.onNext("A");
//        Sleep(1000);
//        behaviorSubject.onNext("B");
//        Sleep(1000);
//        behaviorSubject.onNext("C");
//        Sleep(1000);
//        behaviorSubject.onNext("D");
//        Sleep(1000);
//        behaviorSubject.subscribe(i-> Log.d(TAG,"BehaviorSubject_Student2:->"+i));
//        behaviorSubject.onNext("E");
//        Sleep(1000);
//        behaviorSubject.onNext("F");
//        Sleep(1000);
//        behaviorSubject.onNext("G");
//        Sleep(1000);
     //   1-ReplaySubject Subject
//        ReplaySubject<String> replaySubject = ReplaySubject.create();
//        replaySubject.subscribe(i-> Log.d(TAG,"ReplaySubject_Student1:->"+i));
//        replaySubject.onNext("A");
//        Sleep(1000);
//        replaySubject.onNext("B");
//        Sleep(1000);
//        replaySubject.onNext("C");
//        Sleep(1000);
//        replaySubject.onNext("D");
//        Sleep(1000);
//        replaySubject.subscribe(i-> Log.d(TAG,"ReplaySubject_Student2:->"+i));
//        replaySubject.onNext("E");
//        Sleep(1000);
//        replaySubject.onNext("F");
//        Sleep(1000);
//        replaySubject.onNext("G");
//        Sleep(1000);
        //1-AsyncSubject Subject
//        AsyncSubject<String> asyncSubject = AsyncSubject.create();
//        asyncSubject.subscribe(i-> Log.d(TAG,"AsyncSubject_Student1:->"+i));
//        asyncSubject.onNext("A");
//        Sleep(1000);
//        asyncSubject.onNext("B");
//        Sleep(1000);
//        asyncSubject.onNext("C");
//        Sleep(1000);
//        asyncSubject.onNext("D");
//        Sleep(1000);
//        asyncSubject.subscribe(i-> Log.d(TAG,"AsyncSubject_Student2:->"+i));
//        asyncSubject.onNext("E");
//        Sleep(1000);
//        asyncSubject.onNext("F");
//        Sleep(1000);
//        asyncSubject.onNext("G");
//        Sleep(1000);
//        asyncSubject.onComplete();
///////////////////////////////////////////////////////////////////////////////////

//        SingleObserver singleObserver = new SingleObserver() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onSuccess(Object o) {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//        };
//        MaybeObserver maybeObserver = new MaybeObserver() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onSuccess(Object o) {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        };
//        CompletableObserver completableObserver = new CompletableObserver() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//        }

//////////////////// Create
//        create = Observable.create(new ObservableOnSubscribe<Object>() {
//            @Override
//            public void subscribe(ObservableEmitter<Object> emitter) throws Exception {
//                for(int i = 5;i<10;i++){
//                    if(i==7){
//                        emitter.onNext("Number Is"+i/0);
//                    }
//                    emitter.onNext("Number Is"+i);
//                }
//                emitter.onComplete();
//            }
//
//        });
       //
        /////////////////////////////////
//        Integer[] values ={1,2,3,4,5,6,7,8,9,10};
//        array_observable = Observable.fromArray(values).repeat(6);
//        ///////////////////////////////
//        range = Observable.range(2,30);
//        Observable.just(1,2,3,4,5,6,7,8,9,10)
//                .subscribeOn(Schedulers.io())
//                .doOnNext(o->Log.d(TAG,"Upstream: "+o+" Using Theart is ->"+Thread.currentThread().getName()))
//                .observeOn(Schedulers.computation())
//                .observeOn(Schedulers.io())
//                .subscribe(i->Log.d(TAG,"Downstream: "+i+" Using Theart is ->"+Thread.currentThread().getName()));


//        Observable.just(1,2,3,4,5,6,7,8,9,10)
//                .doOnNext(o->Log.d(TAG,"Upstream: "+o+" Using Theart is ->"+Thread.currentThread().getName()))
////                .map(new Function<Integer, Object>() {
////                    @Override
////                    public Object apply(Integer integer) throws Exception {
////                        return integer*2;
////                    }
////                })
//                .
//                .subscribe(i->Log.d(TAG,"Downstream: "+i+" Using Theart is ->"+Thread.currentThread().getName()));



        Observable observable = Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                activityMainBinding.edText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        emitter.onNext(s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
            }
        });

        observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG,"onSubscribe :");
            }

            @Override
            public void onNext(Object o) {
                Log.d(TAG,"onNext"+o);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG,"onError");
            }

            @Override
            public void onComplete() {
                Log.d(TAG,"onCompl8ete");
            }
        };

    }

    private void Sleep(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Click(View view) {
        //create.subscribe(observer);
        //just.subscribe(observer);
        // array_observable.subscribe(observer);
        //range.subscribe(observer);
    }
}
