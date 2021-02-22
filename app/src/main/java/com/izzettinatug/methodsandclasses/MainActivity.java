package com.izzettinatug.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("İzzettin"));
        username = "James";

        makeMusicians();
        makeSimpsons();
    }
    public  void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50, "Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }
    public void makeMusicians(){
        //instance
        Musicians James = new Musicians("James","Guitar",50);
        System.out.println(James.instrument);

    }




    public String newMethod(String string){
        username = "Lars";
        return string + " New Method";
    }

    public void testMethod(){
        username = "Kirk";
        int x = 4 + 4;
        x = 9;
        System.out.println("value of x:" + x);
    }

    public int math(int a, int b){
        username = "Rob";
        int x = 10;
        System.out.println("Value of x in math " + x);
        return a + b;
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}