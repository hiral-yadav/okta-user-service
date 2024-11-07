package org.okta.common.service;

import com.okta.server.api.client.OktaClient;
import com.okta.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.List;

@Service
public class UserService {

    @Autowired
    OktaClient client;

    public void test(){
        System.out.println("Test....");
        client.testParams();
    }

    public Object getUsers() throws Exception {
        HttpResponse userEntity = (HttpResponse) client.getUsers();
        return userEntity.body();
    }

    public Object addUser(User user) throws Exception {
        HttpResponse userEntity = (HttpResponse) client.addUser(user);
        return userEntity.body();
    }

/*    public Object makeAdmin(User user) throws Exception {
        HttpResponse userEntity = (HttpResponse) client.(user);
        return userEntity.body();
    }*/

    public Object assignApp(User user) throws Exception {
        HttpResponse userEntity = (HttpResponse) client.assignUserApplication(user);
        return userEntity.body();
    }

}
