package com.capitalone.loans.autoloans;

import com.github.sarxos.webcam.Webcam;

/**
 * Created by qgu499 on 9/11/16.
 */
public class WebcamDetector {
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam: " + webcam.getName());
        } else {
            System.out.println("No webcam detected");
        }
    }
}
