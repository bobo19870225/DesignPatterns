package cn.gz3create.designpatterns.example.builder;

import android.util.Log;

/**
 * Created by Sampson on 2020/10/21.
 * DesignPatterns
 */
public class ProductA extends Product {
//    private static final String TAG = ProductA.class.getSimpleName();

    @Override
    public void setPartA() {
        System.out.println("setPartA: ");
//        Log.e(TAG, "setPartA: ");
    }

    @Override
    public void setPartB() {
        System.out.println("setPartB: ");
//        Log.e(TAG, "setPartB: ");
    }

    @Override
    public void setPartC() {
        System.out.println("setPartC: ");
//        Log.e(TAG, "setPartC: ");
    }
}
