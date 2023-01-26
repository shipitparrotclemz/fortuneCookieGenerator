package com.company.cookie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CookieService {
    /**
     * This service is responsible for reading in the cookies, and serving a random cookie
     */

    Random random;
    ArrayList<String> fortuneCookies;

    public CookieService(String fileName) throws IOException {
        // for randomly selecting a cookie
        this.random = new Random();
        // for storing the cookies it can return
        this.fortuneCookies = CookieService.readCookiesFromFile(fileName);
    }

    public String getFortuneCookie() {
        /**
         * Returns a random fortune cookie
         */
        // returns an index from 0 to size of fortune cookies, exclusive
        // given this.fortuneCookies having a size of 10, we will return 0 to 9
        int randomIndex = this.random.nextInt(this.fortuneCookies.size());
        return this.fortuneCookies.get(randomIndex);
    }

    public static ArrayList<String> readCookiesFromFile(String fileName) throws IOException {
        /**
         * Read a list of cookies from the file
         */
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> fortuneCookies = new ArrayList<String>();

        String fortuneCookie;
        while ((fortuneCookie = br.readLine()) != null) {
            // Trim the front and back white spaces
            String cleanedFortuneCookie = fortuneCookie.trim();
            fortuneCookies.add(cleanedFortuneCookie);
        }

        return fortuneCookies;
    }
}
