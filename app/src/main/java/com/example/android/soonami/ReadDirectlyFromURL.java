package com.example.android.soonami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadDirectlyFromURL {
    private static final String MY_URL = "https://www.google.com/";

    public static void main(String[] args) {
        URL myUrl = createNewUrl(MY_URL);

        try {
            InputStream inputStream = myUrl.openStream();
            String result = readFromInputStream(inputStream);
            System.out.print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static URL createNewUrl(String myUrl) {
        URL newUrl = null;
        try {
            newUrl = new URL(myUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return newUrl;
    }

    private static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = reader.readLine();
        while (line != null) {
            output.append(line).append("\n");
            line = reader.readLine();
        }

        inputStream.close();

        return output.toString();
    }
}
