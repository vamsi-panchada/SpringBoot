package com.vamsi.myLogin.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPwd = "vamsi123";
        String encodedPwd = passwordEncoder.encode(rawPwd);
        System.out.println(encodedPwd);
    }

}
