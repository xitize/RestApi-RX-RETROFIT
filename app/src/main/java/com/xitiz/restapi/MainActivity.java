package com.xitiz.restapi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.xitiz.restapi.model.ReqresinApi;
import com.xitiz.restapi.model.ReqresinService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ReqresinService service = ReqresinApi.getClient(getApplicationContext()).create(ReqresinService.class);
        service.getUserList(1).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ListUser>() {
            @Override
            public void onSuccess(ListUser listUser) {
                Toast.makeText(getApplicationContext(), "show message ." + listUser.getData()[2].getFirstName(), Toast.LENGTH_SHORT).show();
                Log.d("TAG", "" + listUser.getData()[1].getLastName());
               /* Data[] data = listUser.getData();
                String[] name = new String[]{};
                for (int i = 0; i < data.length; i++) {
                    name[i] = data[i].getName();
                }

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, name);
                listView.setAdapter(arrayAdapter);
*/
            }

            @Override
            public void onError(Throwable e) {

            }
        });


      /*  Call<DelayedResponse> delayedResponseCall = service.delayedResponse(3);

        delayedResponseCall.enqueue(new Callback<DelayedResponse>() {
            @Override
            public void onResponse(Call<DelayedResponse> call, Response<DelayedResponse> response) {
                DelayedResponse delayedResponse = response.body();
                Log.d("TAG", "" + delayedResponse.toString());
            }

            @Override
            public void onFailure(Call<DelayedResponse> call, Throwable t) {

            }
        });*/


  /*      Register register = new Register();
        register.setEmail("xitize@gmail.com");
        register.setPassword("lean on");
        Call<TokenGen> tokenGenCall = service.registerUser(register);
        tokenGenCall.enqueue(new Callback<TokenGen>() {
            @Override
            public void onResponse(Call<TokenGen> call, Response<TokenGen> response) {
                TokenGen tokenGen = response.body();
                Log.d("TAG", "" + tokenGen.getToken());
            }

            @Override
            public void onFailure(Call<TokenGen> call, Throwable t) {

            }
        });*/


     /*   Call<User> userCall = service.delete(3);
        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, TokenGen<User> response) {


                Log.d("TAG", "" + response.code());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
*/



       /* final User user = new User();
        user.setName("Kshitiz");
        user.setJob("Developer");

        Call<UserCreated> userCreatedCall = service.putUpdate(3, user);
        userCreatedCall.enqueue(new Callback<UserCreated>() {
            @Override
            public void onResponse(Call<UserCreated> call, TokenGen<UserCreated> response) {
                UserCreated userCreated = response.body();
                Log.d("TAG", "" + userCreated.toString());
            }

            @Override
            public void onFailure(Call<UserCreated> call, Throwable t) {

            }
        });
*/
    /*    Call<UserCreated> userCreatedCall = service.createuser(user);
        userCreatedCall.enqueue(new Callback<UserCreated>() {
            @Override
            public void onResponse(Call<UserCreated> call, TokenGen<UserCreated> response) {
                UserCreated userCreated = response.body();
                Log.d("TAG", "" + userCreated.toString());
            }

            @Override
            public void onFailure(Call<UserCreated> call, Throwable t) {

            }
        });
*/




       /* Call<SingleUser> singleUserCall = service.getSingleUser(2);
        singleUserCall.enqueue(new Callback<SingleUser>() {
            @Override
            public void onResponse(Call<SingleUser> call, TokenGen<SingleUser> response) {
                SingleUser singleUser = response.body();
                Log.d("TAG", "" + singleUser.getData().getColor());
            }

            @Override
            public void onFailure(Call<SingleUser> call, Throwable t) {
                Log.d("TAG", "failure to load Single User");
            }
        });*/

        /*Call<ListResource> listResourceCall = service.getListResource();
        listResourceCall.enqueue(new Callback<ListResource>() {
            @Override
            public void onResponse(@NonNull Call<ListResource> call, @NonNull TokenGen<ListResource> response) {
                ListResource listResource = response.body();
                Log.d("TAG", "" + listResource.getData().toString());
            }

            @Override
            public void onFailure(Call<ListResource> call, Throwable t) {
                Log.d("TAG", "failure to load.");
            }
        });


        Call<SingleResource> singleResourceCall = service.getSingleResource(2);
        singleResourceCall.enqueue(new Callback<SingleResource>() {
            @Override
            public void onResponse(Call<SingleResource> call, TokenGen<SingleResource> response) {
                SingleResource singleResource = response.body();
                Log.d("TAG", "" + singleResource.toString());
            }

            @Override
            public void onFailure(Call<SingleResource> call, Throwable t) {

            }
        });*/

    }


    @Override
    public void onClick(View v) {

    }

    private void loadUsersList() {
     /*   ReqresinService service = ReqresinApi.getClient(getApplicationContext()).create(ReqresinService.class);
        Call<ListUser> listUserCall = service.getUserList(3);
        listUserCall.enqueue(new Callback<ListUser>() {
            @Override
            public void onResponse(@NonNull Call<ListUser> call, @NonNull Response<ListUser> response) {
                ListUser listUser = response.body();
            }

            @Override
            public void onFailure(Call<ListUser> call, Throwable t) {
                Log.d("TAG", "failure to load");
            }
        });*/
    }
}
