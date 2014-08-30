package com.example.wearslides;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class SlidesFragment extends Fragment {

    private WebView mWebView;

    public SlidesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slides, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mWebView = (WebView) view.findViewById(R.id.web_view);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://lab.hakim.se/reveal-js/#/");
    }

    private void navigateNext() {
        mWebView.loadUrl("javascript:Reveal.navigateNext()");
    }

    private void navigatePrev() {
        mWebView.loadUrl("javascript:Reveal.navigatePrev()");
    }

}
