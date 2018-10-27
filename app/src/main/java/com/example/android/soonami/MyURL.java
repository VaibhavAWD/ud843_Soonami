package com.example.android.soonami;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MyURL {
    private static final String MY_URL = "http://example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING";

    public static void main(String[] args) {
        URL myUrl = createNewUrl(MY_URL);

        String protocol = "PROTOCOL:\t" + myUrl.getProtocol();
        String authority = "AUTHORITY:\t" + myUrl.getAuthority();
        String host = "HOST:\t" + myUrl.getHost();
        String port = "PORT:\t" + myUrl.getPort();
        String path = "PATH:\t" + myUrl.getPath();
        String query = "QUERY:\t" + myUrl.getQuery();
        String fileName = "FILENAME:\t" + myUrl.getFile();
        String reference = "REFERENCE:\t" + myUrl.getRef();

        ArrayList<String> urlParts = new ArrayList<>();
        urlParts.add(protocol);
        urlParts.add(authority);
        urlParts.add(host);
        urlParts.add(port);
        urlParts.add(path);
        urlParts.add(query);
        urlParts.add(fileName);
        urlParts.add(reference);

        for (int i = 0; i < urlParts.size(); i++) {
            System.out.println(urlParts.get(i));
        }
    }

    private static URL createNewUrl(String myUrl) {
        URL newURL = null;
        try {
            newURL = new URL(myUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return newURL;
    }
}
