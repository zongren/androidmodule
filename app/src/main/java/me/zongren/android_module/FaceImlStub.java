package me.zongren.android_module;

import me.zongren.iface.IFace;

/**
 * Created by zongren on 2018/1/16.
 */

public class FaceImlStub implements IFace<Integer> {
    private static FaceImlStub instance = new FaceImlStub();
    private IFace<Integer> realIml;

    private FaceImlStub() {
    }

    public void setIml(IFace<Integer> iml) {
        this.realIml = iml;
    }

    public boolean isImplemented() {
        return realIml != null;
    }

    public static FaceImlStub getInstance() {
        return instance;
    }

    @Override
    public void startCapture() {
        if (realIml != null) {
            realIml.startCapture();
        }
    }

    @Override
    public void stopCapture() {
        if (realIml != null) {
            realIml.stopCapture();
        }
    }

    @Override
    public void destroy() {
        if (realIml != null) {
            realIml.destroy();
        }
    }

    @Override
    public void setCallback(Callback<Integer> callback) {
        if (realIml != null) {
            realIml.setCallback(callback);
        }
    }
}
