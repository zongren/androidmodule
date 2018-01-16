package me.zongren.android_module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.zongren.iface.IFace;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Class<IFace<Integer>> clazz = (Class<IFace<Integer>>) Class.forName("me.zongren.faceiml.FaceFaceIml");
            IFace<Integer> faceIml = clazz.newInstance();
            FaceImlStub.getInstance().setIml(faceIml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
