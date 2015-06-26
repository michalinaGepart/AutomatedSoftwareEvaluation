package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result uploadCodePage() { return ok(upload.render("Your new application is ready."));
    }

    public Result index() { return ok(index.render("Your new application is ready."));
    }

    public Result about() { return ok(about.render("Descriptions of tests."));
    }

    public Result history() { return ok(history.render("Descriptions of tests."));
    }

    public Result ranking() { return ok(ranking.render("Descriptions of tests."));
    }

    public Result authenticate(){
    return redirect(routes.Application.uploadCodePage());}

}
