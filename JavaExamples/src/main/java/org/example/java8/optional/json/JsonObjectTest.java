package org.example.java8.optional.json;

import org.json.JSONObject;

public class JsonObjectTest {

    public static void main(String[] args) {
        JSONObject login = new JSONObject();
        login.put("username", "houria@nbb-lease.fr@OSEGROUP");
        login.put("password", "pass");
        System.out.println(login.toString());
    }
}
