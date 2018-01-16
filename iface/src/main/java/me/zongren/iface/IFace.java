package me.zongren.iface;

/**
 * Created by zongren on 2018/1/16.
 */

public interface IFace<T> {
    void startCapture();

    void stopCapture();

    void destroy();

    void setCallback(Callback<T> callback);

    interface Callback<T> {
        void onCaptureFace(T info);
    }
}
