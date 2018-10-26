package com.spokesoft.api.server;

import org.jooby.Jooby;
import org.jooby.banner.Banner;


/**
 * Hello world gradle project.
 */
public class App extends Jooby {

  static String TITLE = "client-api-server";

  {

    use(new Banner(TITLE).font("slant"));

    get(req -> {
      String name = req.param("name").value("Jooby");
      return "Hello therddddde ssss" + name + "!";
    });
  }

  public static void main(String[] args) {
    run(App::new, args);
  }
}
