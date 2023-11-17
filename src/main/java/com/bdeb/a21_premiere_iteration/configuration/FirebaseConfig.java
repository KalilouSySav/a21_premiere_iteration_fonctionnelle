package com.bdeb.a21_premiere_iteration.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class FirebaseConfig implements CommandLineRunner {

    @Value("classpath:config/firebase-config.json")
    private Resource firebaseConfigResource;

    @Override
    public void run(String... args) throws Exception {
        initializeFirebase();
    }

    private void initializeFirebase() throws IOException {
        try (InputStream serviceAccount = firebaseConfigResource.getInputStream()) {
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        }
    }
}

