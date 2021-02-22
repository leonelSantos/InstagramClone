package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("t3sZWJP98lMyPVWbKcpnrMZzobL6zSqP8795UDdO")
                .clientKey("T0RJ75k6F43GOKBqATafj0vm3TztbUGdLVlooOhL")
                .server("http://parseapi.back4app.com")
                .build()
        );
    }
}
