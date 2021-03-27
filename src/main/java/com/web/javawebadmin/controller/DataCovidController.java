package com.web.javawebadmin.controller;

import com.web.javawebadmin.model.User;
import com.web.javawebadmin.repository.UserRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Scanner;

@Controller
@RequestMapping("/home")
public class DataCovidController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/getDataCovid", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String postLogin(@RequestParam Map<String, Object> payload, Model model) {
        String userName = (String) payload.get("username");
        String userPass = (String) payload.get("password");
        User user = userRepository.findUserByName(userName);

        if (user != null) {
            if (BCrypt.checkpw(userPass, user.getPassword())) {
                user.setLogged_in(true);
                user.setUpdated_at(new Timestamp(System.currentTimeMillis()));
                userRepository.save(user);
                try {
                    URL url = new URL("https://api.covid19api.com/summary");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.connect();
                    int responsecode = conn.getResponseCode();
                    if (responsecode != 200) {
                        throw new RuntimeException("HttpResponseCode: " + responsecode);

                    } else {
                        String inline = "";
                        Scanner scanner = new Scanner(url.openStream());
                        while (scanner.hasNext()) {
                            inline += scanner.nextLine();
                        }
                        scanner.close();
                        JSONParser parse = new JSONParser();
                        JSONObject data_obj = (JSONObject) parse.parse(inline);
                        JSONArray arr = (JSONArray) data_obj.get("Countries");
                        for (int i = 0; i < arr.size(); i++) {
                            JSONObject new_obj = (JSONObject) arr.get(i);
                            if (new_obj.get("Slug").equals("indonesia")) {
                                model.addAttribute("confirmedIndo", new_obj.get("TotalConfirmed"));
                            }
                            if (new_obj.get("Slug").equals("malaysia")) {
                                model.addAttribute("confirmedMalay", new_obj.get("TotalConfirmed"));
                            }
                            if (new_obj.get("Slug").equals("japan")) {
                                model.addAttribute("confirmedJapan", new_obj.get("TotalConfirmed"));
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return "500";
                }
                return "home";
            }else{
                return "login";
            }
        } else {
            return "login";
        }
    }
}
