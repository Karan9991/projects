package com.test.quizexampleinterview.authentication;

public interface AuthContract {

    interface View{
        void initUI();
        String getEmail();
        default String getPassword(){ return null;}
        default void initAnimateButton(){}
        default void animateButton(){}
    }

    interface Presenter{
        void Login();
        void SignUp();
        void ForgotPassword();
        void checkFirebaseLogin();
    }

}
