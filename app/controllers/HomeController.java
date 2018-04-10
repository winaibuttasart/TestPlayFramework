package controllers;

import play.mvc.*;
import play.i18n.*;
import play.Logger;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
//        return ok(index.render("Your new application is ready."));
//        return ok("Your new application is ready.");
        Messages messages = Http.Context.current().messages();
        String header = messages.at("hello");
        String login = messages.at("login");
        Logger.warn("hello = " + header);
        Logger.warn("login = " + login);

        return ok(index.render(header, login));
    }


    public Result login() {
        Messages messages = Http.Context.current().messages();
        String loginHeader = messages.at("memberLogin");
        String login1 = messages.at("login");
        String email = messages.at("email");
        String password = messages.at("password");
        String forgot = messages.at("forgot");
        String username = messages.at("username");
        String createAccount = messages.at("createYourAccount");
        String backToHome = messages.at("backToHomePage");
        String validEmail = messages.at("validEmail");
        String validPassword = messages.at("validPassword");


//        Logger.warn("================\nloginHeader = " + loginHeader);
//        Logger.warn("login1 = " + login1);
//        Logger.warn("email = " + email);
//        Logger.warn("password = " + password);
//        Logger.warn("forgot = " + forgot);
//        Logger.warn("username = " + username);
//        Logger.warn("createAccount = " + createAccount);
//        Logger.warn("backToHome = " + backToHome);
//        Logger.warn("validEmail = " + validEmail);
//        Logger.warn("validPassword = " + validPassword);
//        Logger.warn("----------------------------------------------");
        return ok(login.render(loginHeader, login1, email, password, forgot, username, createAccount, backToHome,validEmail,validPassword));
    }
}
