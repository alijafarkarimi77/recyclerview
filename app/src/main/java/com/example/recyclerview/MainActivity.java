package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapters.MyRecyclerAdapter;
import com.example.recyclerview.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView MyRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyRecyclerView = findViewById(R.id.myRecycler);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(this,getUsers());
        MyRecyclerView.setLayoutManager(linearLayoutManager);
        MyRecyclerView.setAdapter(adapter);
        MyRecyclerView.setItemAnimator(new DefaultItemAnimator());



    }
     private List<User> getUsers(){
         List<User> users=new ArrayList<>();
         users.add(new User("amir","amiry"));
         users.add(new User("ali","amiry"));
         users.add(new User("mamad","amiry"));
         users.add(new User("reza","amiry"));
         users.add(new User("ahmad","amiry"));
         users.add(new User("ahmad","amiry"));
         users.add(new User("ahmad","amiry"));
         users.add(new User("yaser","amiry"));
         users.add(new User("yaghob","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));
         users.add(new User("rahman","amiry"));

         return users;
     }

}