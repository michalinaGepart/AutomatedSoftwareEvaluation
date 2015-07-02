package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public Result uploadCodePage() {
        return ok();
    }

    public Result index() { return ok(index.render("Software Evaluation System"));
    }

    public Result about() { return ok(about.render("Software Evaluation System - About"));
    }

    public Result history() { return ok(history.render("Software Evaluation System - History of results"));
    }

    public Result ranking() { return ok(ranking.render("Software Evaluation System - Ranking"));
    }

    public Result authenticate(){
    return redirect(routes.Application.uploadCodePage());}

    public Result login(){
        return ok(
              //  login.render(Form.form(Login.class))
        );
    }

    public static class Login{
        public String email;
        public String password;

    }

}
