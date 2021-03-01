package com.csh.hann.gohwiki.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class JsoupHelper {

    public static Document connect(String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
